package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.MyCoupon;
import com.MedPlus.Pages.PurchaseHistory;
import com.MedPlus.Utilities.Utils;

public class TC_PurchaseHistory extends BaseClass{
	@Test
	public void purchaseh() throws InterruptedException, IOException
	{
		
		Utils u=new Utils();
		u.doLogin(username, password);
		
		
		MyCoupon mc = new MyCoupon(driver);
			Thread.sleep(3000);
				mc.CouponClick();
				System.out.println("coupon click done");
				mc.myaccount();
		 
		 
			PurchaseHistory ph= new PurchaseHistory(driver);
			Thread.sleep(3000);
			ph.purchase();
			Thread.sleep(3000);
			ph.records();
			Thread.sleep(3000);
			ph.newrecord();
			Thread.sleep(3000);
			ph.recordname("Cardiacreport");
			ph.doctorname("Sharukh Khan");
			ph.select();
			ph.submit();
			
			Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
}
}
