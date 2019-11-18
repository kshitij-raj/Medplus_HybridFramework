package com.MedPlus.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.MedPlus.Pages.Register_Page;

import com.MedPlus.Pages.Register_Page;

public class TC_Register_001 extends BaseClass {

	
	@Test
	public void registeration() throws InterruptedException, IOException{
	
		
	logger.info("Register Page");
	Register_Page rp = new Register_Page(driver);
	rp.LoginClick();
	rp.clickRegisterHere();
	rp.setFirstname(fname);
	logger.info("First name is entered");
	rp.setLasttname(lname);
	logger.info("Last name is entered");
	rp.setEmail(email);
	logger.info("Email is entered");
	rp.setPassword(Createpassword);
	logger.info("Password is entered");
	rp.setConfPassword(Createpasswordconfirm);
	logger.info("ConfirmPassword is entered");
	rp.setMobile(Mobile);
	logger.info("Mobile is entered");
	rp.RegisterButton();
	
	Thread.sleep(5000);
	
	if(driver.getTitle().equals("Medplus Card - MedPlusMart"))
	{
		Assert.assertTrue(true);
		logger.info("Login Test is Passed");
		Thread.sleep(5000);
		captureScreen( driver," RegisterPass");
		
	}
	else {
		captureScreen( driver," RegisterFail");
		Assert.assertTrue(false);
		logger.info("Login Test is Passed");
		}
	
	}

}