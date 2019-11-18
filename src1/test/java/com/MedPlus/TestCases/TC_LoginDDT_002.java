package com.MedPlus.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Utilities.Utils;
import com.MedPlus.Utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	@Test(dataProvider="LogIn")
	 
	public void loginDDT(String user,String pwd,String Status,String Message) throws InterruptedException, IOException
	{	
		LogIn_Page lp = new LogIn_Page(driver);
		Utils u = new Utils();
		lp.clickLogin();
		lp.setUsername(user);
		logger.info("Username is provided");
		lp.setPassword(pwd);
		logger.info("Password is provided");
		lp.clickButton();
		Thread.sleep(5000);
		
		if(isAlertPresent()==true)
		{
			driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-8']//span[@class='closeModal']")).click();
			Thread.sleep(5000);
//			driver.switchTo().defaultContent();
			
			logger.warn("Login failed");
			Utils.setData("Login", "Status", user, "Fail", "Username");
			Utils.setData("Login", "Message", user, "login(Failure) testcase is successful", "Username");
			Assert.assertTrue(false);
		}
		else
		{
//			Assert.assertTrue(false);
//			logger.info("Login Passed");
			lp.logout();
//			driver.switchTo().defaultContent();
			Utils.setData("Login", "Status", user, "Passed", "Username");
			Utils.setData("Login", "Message", user, "login(Passed) testcase is successful", "Username");
		}
		
	}
	
	
	public boolean isAlertPresent()
	{	try {
		driver.findElement(By.cssSelector("#loginServerErrorMsg"));
		return true;
		}
		catch(Exception e)
	{
			return false;
	}
	
	}
		
		
	
	@DataProvider(name="LogIn")
	String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src1/test/java/com/MedPlus/TestData/LogIn.xlsx";
		int rownum=XLUtils.getRowCount(path, "Login");
		int colnum=XLUtils.getCellCount(path, "Login", 1);
		String logindata[][]=new String[rownum][colnum];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Login", i, j);
			}
		}
		
		return logindata;
	}
	
}
