package com.sap.training.version3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FioriLaunchPad {
	private WebDriver driver;
	
	@FindBy(xpath="//div[contains(@title, 'My Benefits')]")
	private WebElement myBenefitsTile;
	
	@FindBy(xpath="//div[contains(@title, 'My Benefits')]//div[@class='sapUshellDynamicTileNumber']")
	private WebElement pendingPlanNumber;
	
	public FioriLaunchPad(WebDriver driver) {
		this.driver = driver;
		
		//dismiss the license agreement window
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
	}
	
	public MyBenefitsPage goToMyBenefitsPage() {
		myBenefitsTile.click();	
		return PageFactory.initElements(driver, MyBenefitsPage.class);
	}
	
	public String getMyBenefitsPendingPlanNumber() {
		return pendingPlanNumber.getText();
	}
}
