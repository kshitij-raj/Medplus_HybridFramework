package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.AllPromotions;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.Promotions;
import com.MedPlus.Utilities.Utils;

public class TC_AllPromotions extends BaseClass {

	@Test
	public void Promotest() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
		AllPromotions obj3 = new AllPromotions(driver);


		Thread.sleep(5000);
		obj3.Promo();
		Thread.sleep(5000);
		 Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
	}
}
