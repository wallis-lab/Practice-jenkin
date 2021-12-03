import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSelenium {
	
	
@Test
	public void test1() {
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:5001/");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//driver.navigate().to("Https://seleniumhp.github.io");
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	driver.findElement(By.id("quicksearch_main")).sendKeys("nidaye");
	driver.findElement(By.id("quicksearch_main")).sendKeys("nidama");
	driver.findElement(By.id("find")).click();
	driver.findElement(By.xpath("//body/div[@id='header']/ul[1]/li[1]/a[1]")).click();
	
	driver.close();
	driver.quit();
	
	  
}
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
     
      driver.get("http://localhost:5001/");
      
      driver.findElement(By.id("enter_bug")).click();
      
      driver.findElement(By.id("Bugzilla_login")).sendKeys("wangwenlong924@gmail.com");
      driver.findElement(By.id("Bugzilla_password")).sendKeys("03060502");
      driver.findElement(By.id("log_in")).click();
      
      WebElement serverity = driver.findElement(By.id("bug_severity"));
      Select serveritySel = new Select(serverity);
      serveritySel.selectByIndex(3);
      
      WebElement hardware = driver.findElement(By.id("rep_platform"));
      Select hardwareSel = new Select(hardware);
      hardwareSel.selectByIndex(3);
      
      WebElement OS = driver.findElement(By.id("op_sys"));
      Select OSSel = new Select(OS);
      //OSSel.selectByIndex(4);
      OSSel.selectByVisibleText("Windows");
      
      
      
      driver.findElement(By.id("short_desc")).sendKeys("who am i");
      
      
      driver.findElement(By.id("submit")).click();
  
  }
}
