package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Cartview;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Utilities.Utils;

public class TC_Viewcart extends BaseClass{
	@Test
	public void cartview() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
	
		Cartview sc = new Cartview(driver);
			sc.cart();
			Thread.sleep(10000);
			
			Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
}
}
