package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.PromotionLinks;
import com.MedPlus.Pages.Promotions;
import com.MedPlus.Utilities.Utils;

public class TC_PromotionLinks extends BaseClass {

	@Test
	public void Promolin() throws InterruptedException, IOException
	{
		Utils u=new Utils();
	    u.doLogin(username, password);
		Promotions obj1 = new Promotions(driver);

	    PromotionLinks obj2 = new PromotionLinks(driver);
		Thread.sleep(5000);

		obj1.Promo();

		Thread.sleep(5000);
		obj2.Promlinks();
		
		Logout lg=new Logout(driver);
		lg.account();
		Thread.sleep(5000);
		lg.logout();
		Thread.sleep(5000);
		
	}


}
