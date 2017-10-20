package com.sap.training;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {  
	WebDriver driver;
	
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		
	}
		

	public GoogleResultPage searchByKeyword(String keyword) {
		WebElement inputBox = driver.findElement(By.id("lst-ib"));
		inputBox.sendKeys(keyword);
		inputBox.sendKeys(Keys.ENTER);
		
		
		return new GoogleResultPage(driver);
		
	}
}
