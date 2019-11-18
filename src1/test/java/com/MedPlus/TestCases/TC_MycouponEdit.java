package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;


import com.MedPlus.Pages.MycouponEdit;
import com.MedPlus.Utilities.Utils;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.MyCoupon;

public class TC_MycouponEdit extends BaseClass {
	@Test
	public void mypassword() throws InterruptedException, IOException
	{
		
		Utils u = new Utils();
		u.doLogin(username, password);
		
		
		MyCoupon mc = new MyCoupon(driver);
			Thread.sleep(3000);
				mc.CouponClick();
				System.out.println("coupon click done");
				mc.myaccount();
		 
		 
			MycouponEdit ed= new MycouponEdit(driver);
			Thread.sleep(3000);
			ed.change();
			Thread.sleep(3000);
			ed.oldpwd("pritamdas011");
			Thread.sleep(3000);
			ed.newpwd("manasa19");
			Thread.sleep(3000);
			ed.confirm("manasa19");
			ed.update();
			Thread.sleep(3000);
			Logout lo=new Logout(driver);
			lo.account();
			lo.logout();
}	

}

