package com.sap.training.version4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MyBenefitsPage {
	private WebDriver driver;
	
	@FindBy(css="span.sapMObjectNumberText")
	private WebElement insValue;
	
	public MyBenefitsPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 30);
		PageFactory.initElements(factory, this);
	}
	
	public String getSuppLifeInsValue() {
		return insValue.getText();
	}
}
