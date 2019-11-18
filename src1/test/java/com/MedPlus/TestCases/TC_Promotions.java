package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.MyCoupon;
import com.MedPlus.Pages.Promotions;
import com.MedPlus.Utilities.Utils;



public class TC_Promotions extends BaseClass{

	
	@Test
	public void Promotest() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
		Promotions obj1 = new Promotions(driver);


		Thread.sleep(5000);
		obj1.Promo();
		obj1.PromEle();
		
		Logout lg=new Logout(driver);
		lg.account();
		Thread.sleep(5000);
		lg.logout();
		Thread.sleep(5000);
		
	}

}

