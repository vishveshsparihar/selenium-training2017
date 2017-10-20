package com.sap.training.version1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyBenefitsPage {
	private WebDriver driver;
	
	public MyBenefitsPage(WebDriver driver) {
		this.driver = driver;
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getSuppLifeInsValue() {
		WebElement element = driver.findElement(By.cssSelector("span.sapMObjectNumberText"));
		return element.getText();
	}
}
