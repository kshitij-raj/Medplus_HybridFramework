package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.pharmacy;
import com.MedPlus.Utilities.*;
public class TC_pharmacyDDT_003 extends BaseClass {


	@Test
	public void pharmacy1() throws InterruptedException, IOException
	{
		Utils u = new Utils();
		u.doLogin(username, password);		
//		
		pharmacy lp1 = new pharmacy(driver);
		
		Thread.sleep(5000);
		lp1.pharmacyClick();
		Thread.sleep(5000);
		lp1.PromEle();
		lp1.viewdetailsClick();
		Thread.sleep(5000);
		lp1.closemodalClick();
		
//     	lp1.drugscategoryClick();
		Thread.sleep(5000);
     	lp1.antiacidsClick();
     	
     	Logout lg=new Logout(driver);
		lg.account();
		Thread.sleep(5000);
		lg.logout();
		Thread.sleep(5000);
     
}
}
