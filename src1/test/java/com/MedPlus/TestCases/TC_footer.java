package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.footer;
import com.MedPlus.Utilities.Utils;

public class TC_footer extends BaseClass {
	@Test
	public void footer() throws InterruptedException, IOException
	{

		Utils u = new Utils();
		u.doLogin(username, password);		               
        footer ft=new footer(driver);	
        
		Thread.sleep(5000);
		ft.aboutus();
		Thread.sleep(5000);
		ft.faqs();
		Thread.sleep(5000);
		ft.locateastore();
     	ft.trackorders();
		Thread.sleep(5000);
     	ft.browseallbrands();
     	ft.customerfeedback();
     	ft.contactus();
     	
     	Thread.sleep(5000);
		 Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
}
}