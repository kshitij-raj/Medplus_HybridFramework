package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.addtowishlist;

import com.MedPlus.Utilities.Utils;

public class TC_addtowishlist extends BaseClass {
	@Test
	public void addtowishlist() throws InterruptedException, IOException
	{

		Utils u = new Utils();
		u.doLogin(username, password);		               
		addtowishlist aw = new addtowishlist(driver);
		aw.Search1();
		Thread.sleep(5000);	
	    aw.product();
	    aw.wishlist();
	    
	    Thread.sleep(5000);
		 Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
}
}

