package com.sap.training.version1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FioriLaunchPad {
	private WebDriver driver;
	
	public FioriLaunchPad(WebDriver driver) {
		this.driver = driver;
		
		//dismiss the license agreement window
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
	}
	
	public MyBenefitsPage goToMyBenefitsPage() {
		WebElement element = driver.findElement(By.xpath("//div[contains(@title, 'My Benefits')]"));
		element.click();
		
		return new MyBenefitsPage(driver);
	}
	
	public String getMyBenefitsPendingPlanNumber() {
		WebElement element = driver.findElement(By.xpath("//div[contains(@title, 'My Benefits')]//div[@class='sapUshellDynamicTileNumber']"));
		return element.getText();
	}
}
