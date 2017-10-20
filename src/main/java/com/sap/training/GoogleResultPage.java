package com.sap.training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {
	WebDriver driver;
	
	public GoogleResultPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getFirstResultText() {
		
		WebElement resultLink = driver.findElement(By.xpath("//a[@href='http://www.seleniumhq.org/']"));
		String resultText = resultLink.getText();
		
	
		return resultText;
		
	}
	
	public SeleniumHomePage clickFirstResultLink() {
		WebElement resultLink = driver.findElement(By.xpath("//a[@href='http://www.seleniumhq.org/']"));
		resultLink.click();
		
		return new SeleniumHomePage(driver);
	}

}
