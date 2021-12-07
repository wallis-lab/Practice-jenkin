package framwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import webDriverFactory.DriverManager;
import webDriverFactory.DriverManagerFactory;

public abstract class TestBase {
	protected String baseUrl;
	protected DriverManager manager;
	private Settings settings;
		
	protected TestBase(String baseUrl) {
		this.baseUrl = baseUrl;
		this.settings = Settings.get();
	}
	
	@BeforeMethod
	public void setup() {
		this.manager = DriverManagerFactory.getManager(settings.browserType);
		this.manager.createDriver();
		
		this.getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		this.getDriver().manage().window().maximize();
		this.getDriver().navigate().to(this.baseUrl);		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			try 
			{
				Screenshot screenshot = new Screenshot(this.getDriver());
				String filePath = "./Screenshots/"+result.getName()+".png";
				screenshot.takeScreenshot(filePath);
			} finally {
				this.manager.quitDriver();
			}
		}
		this.manager.quitDriver();
	}
	
	public WebDriver getDriver() {
		return this.manager.getDriver();
	}
}
