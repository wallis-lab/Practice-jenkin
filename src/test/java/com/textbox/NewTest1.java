package com.textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
      //Initialize the chrome driver
      System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
      driver = new ChromeDriver();
      driver.get("https://www.toolsqa.com/"); 
      driver.findElement(By.xpath("/html[1]/body[1]")).click();
      driver.quit();
  }
}
