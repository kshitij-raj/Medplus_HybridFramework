package com.MedPlus.TestCases;
import java.io.IOException;

import org.testng.annotations.Test;
import com.MedPlus.Pages.Healthylife;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Utilities.*;
 class T_healthlife extends BaseClass {
	 @Test
		public void red4() throws InterruptedException, IOException
		{
			Utils u = new Utils();
			u.doLogin(username, password);
			Healthylife lp1 = new Healthylife(driver);
		
			Thread.sleep(5000);
			lp1.healthylife();
            Thread.sleep(3000);
			Logout lo=new Logout(driver);
			lo.account();
			lo.logout();
		}
 }