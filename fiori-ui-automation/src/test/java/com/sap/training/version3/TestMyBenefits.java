package com.sap.training.version3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestMyBenefits {
	private WebDriver driver;
	
	@Test
	public void testMyBenefits() {
		FioriLaunchPad fioriLaunchPad = PageFactory.initElements(driver, FioriLaunchPad.class);
		
		String planNumber = fioriLaunchPad.getMyBenefitsPendingPlanNumber();
		Assert.assertEquals(planNumber, "1", "Pending Plan number not correct; test case failed!");
		
		MyBenefitsPage myBenefitsPage = fioriLaunchPad.goToMyBenefitsPage();
		String insValue = myBenefitsPage.getSuppLifeInsValue();
		Assert.assertEquals(insValue, "97,000.00", "Supplementary Life Insurance not correct; test case failed!");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.sapfioritrial.com/sites?helpset=trial&sap-client=001");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
