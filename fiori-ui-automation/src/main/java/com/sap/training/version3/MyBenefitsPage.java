package com.sap.training.version3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBenefitsPage {
	private WebDriver driver;
	
	@FindBy(css="span.sapMObjectNumberText")
	private WebElement insValue;
	
	public MyBenefitsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getSuppLifeInsValue() {
		return insValue.getText();
	}
}
