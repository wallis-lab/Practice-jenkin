package com.textbox;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() throws IOException {
	  System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
      
	  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:5001/");
		driver.manage().window().maximize();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\Administrator\\Desktop\\test.png"));
	
		driver.close();
		
  }
  @Test
  public void FirefoxTest() {	
	  
	  System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
	     
//Initializing the firefox driver (Gecko)
	 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	  driver = new FirefoxDriver();	  
	  driver.get("https://www.toolsqa.com/"); 
	  driver.findElement(By.xpath("/html[1]/body[1]")).click();
	  driver.quit();

  }
 
 @Test
 public void ChromeTest()
 { 			
	 System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
       //Initialize the chrome driver
       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
       driver = new ChromeDriver();
       driver.get("https://www.toolsqa.com/"); 
       driver.findElement(By.xpath("/html[1]/body[1]")).click();
       driver.quit();
 }

}
