package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.Redeem_rewards;
import com.MedPlus.Pages.wishlist;
import com.MedPlus.Utilities.Utils;

public class TC_wishlist extends BaseClass{
	@Test
	public void red2() throws InterruptedException, IOException
	{
		Utils u = new Utils();
		u.doLogin(username, password);
		wishlist lp1 = new wishlist(driver);
		
		
		Thread.sleep(5000);
		lp1.flex();
		Thread.sleep(5000);
		lp1.redeem();
		Thread.sleep(5000);
		lp1.mywishlist();
Thread.sleep(3000);
		Logout lo=new Logout(driver);
		lo.account();
		lo.logout();
}
}
