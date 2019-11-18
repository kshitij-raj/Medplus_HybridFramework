package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.autosuggest;
import com.MedPlus.Utilities.Utils;

public class TC_Auto_001 extends BaseClass{
	@Test
	public void autosearch() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
	
	autosuggest a = new autosuggest(driver);
			a.Autosugg();
			Thread.sleep(10000);
	Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
}
}
