package com.sap.training.version2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyBenefitsPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public MyBenefitsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 30);
	}
	
	public String getSuppLifeInsValue() {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.sapMObjectNumberText")));
		return element.getText();
	}
}
