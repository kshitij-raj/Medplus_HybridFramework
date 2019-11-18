package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.MyCoupon;
import com.MedPlus.Utilities.Utils;

public class TC_Coupon_001 extends BaseClass {
	
	@Test
	public void coupontest() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
		
		MyCoupon mc = new MyCoupon(driver);
		mc.CouponClick();
		 mc.myaccount();
		 
		 Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
	}
}
