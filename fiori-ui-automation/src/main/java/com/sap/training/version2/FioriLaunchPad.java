package com.sap.training.version2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FioriLaunchPad {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public FioriLaunchPad(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		
		//dismiss the license agreement window
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
	}
	
	public MyBenefitsPage goToMyBenefitsPage() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@title, 'My Benefits')]")));
		element.click();
		
		return new MyBenefitsPage(driver);
	}
	
	public String getMyBenefitsPendingPlanNumber() {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@title, 'My Benefits')]//div[@class='sapUshellDynamicTileNumber']")));
		return element.getText();
	}
}
