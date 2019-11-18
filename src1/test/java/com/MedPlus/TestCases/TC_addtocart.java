package com.MedPlus.TestCases;
import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.addtocart;
//import com.MedPlus.Utilities.*;

import com.MedPlus.Utilities.Utils;
public class TC_addtocart extends BaseClass
{

	@Test
	public void searchtest() throws InterruptedException, IOException
	{
		Utils u = new Utils();
		u.doLogin(username, password);		
	
	addtocart sc = new addtocart(driver);
			sc.Search1();
			Thread.sleep(5000);	
		    sc.addingtocart();
		    sc.viewcart();
		    sc.viewshoppingcart();
		    Thread.sleep(5000);
		    Logout lo=new Logout(driver);
			lo.account();
			lo.logout();
}
}