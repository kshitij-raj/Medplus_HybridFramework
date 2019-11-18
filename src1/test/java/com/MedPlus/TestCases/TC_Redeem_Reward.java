package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.Redeem_rewards;
import com.MedPlus.Utilities.*;
 class TC_Redeem_Reward extends BaseClass {
	
	@Test
	public void red() throws InterruptedException, IOException
	{
		Utils u = new Utils();
		u.doLogin(username, password);
		Redeem_rewards lp1 = new Redeem_rewards(driver);
		
		

		Thread.sleep(5000);
		lp1.flex();
		Thread.sleep(5000);
		lp1.redeem();
		lp1.moreDetails();
		Thread.sleep(5000);
		lp1.close();
		Thread.sleep(5000);
		lp1.add();
		
		Logout lg=new Logout(driver);
		lg.account();
		Thread.sleep(5000);
		lg.logout();
		Thread.sleep(5000);
	}
}
