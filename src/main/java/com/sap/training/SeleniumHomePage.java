package com.sap.training;


import org.openqa.selenium.WebDriver;

public class SeleniumHomePage {
	WebDriver driver;
	
	public SeleniumHomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}

}
