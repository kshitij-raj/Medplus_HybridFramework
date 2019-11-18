package com.MedPlus.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Utilities.XLUtils;

public class Login_Test extends BaseClass {
	
	@Test
	public void logintest() throws InterruptedException, IOException
	{
		
		logger.info("URL is opened");
		LogIn_Page lp = new LogIn_Page(driver);
		
		lp.clickLogin();
		
		lp.setUsername(username);
		logger.info("Entered Email/Mobile");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		
		lp.clickButton();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Online Pharmacy Store in India. Best value on medicines - MedPlusMart"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test is Passed");
			XLUtils xl = new XLUtils();
			
			XLUtils.setCellData("C:\\Users\\Administrator\\Desktop\\TRAIL 1.0\\Medplus_HybridFramework\\src1\\test\\java\\com\\MedPlus\\TestData\\LogIn.xlsx", "Login", 0, 0, "Pass");
			
		}
		else {
			captureScreen( driver," logintest");
			Assert.assertTrue(false);
			logger.info("Login Test is Failed");
			}
			
}
	
}
