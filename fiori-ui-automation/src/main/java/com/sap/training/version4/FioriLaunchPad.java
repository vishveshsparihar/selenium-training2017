package com.sap.training.version4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FioriLaunchPad {
	private WebDriver driver;
	
	@FindBy(xpath="//div[contains(@title, 'My Benefits')]")
	private WebElement myBenefitsTile;
	
	@FindBy(xpath="//div[contains(@title, 'My Benefits')]//div[@class='sapUshellDynamicTileNumber']")
	private WebElement pendingPlanNumber;
	
	public FioriLaunchPad(WebDriver driver) {
		this.driver = driver;	
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);

		//dismiss the license agreement window
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
	}
	
	public MyBenefitsPage goToMyBenefitsPage() {
		myBenefitsTile.click();	
		return new MyBenefitsPage(driver);
	}
	
	public String getMyBenefitsPendingPlanNumber() {
		return pendingPlanNumber.getText();
	}
}
