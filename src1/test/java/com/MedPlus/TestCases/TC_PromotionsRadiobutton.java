package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.MyCoupon;
import com.MedPlus.Pages.Promotions;
import com.MedPlus.Pages.PromotionsRadiobutton;
import com.MedPlus.Utilities.Utils;

public class TC_PromotionsRadiobutton extends BaseClass{
	@Test
	public void Promotestrad() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
		PromotionsRadiobutton obj4 = new PromotionsRadiobutton(driver);


		Thread.sleep(5000);
		obj4.Promo();
		obj4.PromElem();
		
		Thread.sleep(5000);
		 Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
	}
}
