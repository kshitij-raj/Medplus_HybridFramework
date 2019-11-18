package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.wallet;
import com.MedPlus.Utilities.Utils;

public class TC_Wallet extends BaseClass{
	@Test
	public void wallet() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
		
		wallet mc = new wallet(driver);
		mc.walletcheck();
		 
		 Logout lg=new Logout(driver);
			lg.account();
			Thread.sleep(5000);
			lg.logout();
			Thread.sleep(5000);
	}
}
