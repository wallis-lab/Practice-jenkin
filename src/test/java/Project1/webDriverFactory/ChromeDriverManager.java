package webDriverFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {
	private final String CHROME_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	private final String chromeDriverPath = "C:\\Users\\Administrator\\Desktop\\chromedriver.exe";
	public ChromeDriverManager() {
		System.setProperty(CHROME_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
	}
	public void createDriver() {
		setDriver(new ChromeDriver());
	}
}
