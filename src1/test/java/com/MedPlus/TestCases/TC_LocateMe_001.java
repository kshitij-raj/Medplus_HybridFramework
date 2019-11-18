package com.MedPlus.TestCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.MedPlus.Pages.LocateMe;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Utilities.Utils;

public class TC_LocateMe_001  extends BaseClass{

	@Test
	public void Locate() throws InterruptedException
	{
		Utils u = new Utils();
		u.doLogin(username, password);
		Thread.sleep(3000);
		LocateMe lm = new LocateMe(driver);
		lm.clickLocate();		
		lm.clickSearch(pin);
		Thread.sleep(3000);
		Logout lo=new Logout(driver);
		lo.account();
		lo.logout();
	}
	
}
