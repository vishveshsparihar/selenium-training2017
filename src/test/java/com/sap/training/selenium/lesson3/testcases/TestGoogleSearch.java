package com.sap.training.selenium.lesson3.testcases;

import org.testng.annotations.Test;

import com.sap.training.GoogleHomePage;
import com.sap.training.GoogleResultPage;
import com.sap.training.SeleniumHomePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestGoogleSearch {
	WebDriver driver;
	
  @Test
  public void f() {
	  GoogleHomePage homepage = new GoogleHomePage(driver);
	  GoogleResultPage result = homepage.searchByKeyword("selenium");
	  String firstResult = result.getFirstResultText();
	  
	  Assert.assertEquals(firstResult, "Selenium - Web Browser Automation");
	  
      SeleniumHomePage seleniumHomePage = result.clickFirstResultLink();
      String pageTitle = seleniumHomePage.getPageTitle();
	  
      Assert.assertEquals(pageTitle, "Selenium - Web Browser Automation");
  }
  @BeforeMethod
  public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "C:/Program Files/Java/chromedriver.exe");
			
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("proxy-server=proxy.pal.sap.corp:8080");
		 
		    driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
	 }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
