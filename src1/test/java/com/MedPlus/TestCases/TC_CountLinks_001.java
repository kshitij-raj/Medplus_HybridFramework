package com.MedPlus.TestCases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.MedPlus.Utilities.Utils;

public class TC_CountLinks_001  extends BaseClass{
	
	@Test
	public void links() throws InterruptedException,StaleElementReferenceException
	{
		Utils u = new Utils();
		u.doLogin(username, password);
		logger.info("Link Present In Medplus Mart");
		try {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		logger.info(" "+links.size());
		 
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
			 System.out.println(links.get(i).getText());
		 
		 }
		}
		catch(Exception e)
		{
			
		}
		 
		 
		 }
}
