package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.MedplusLab;
import com.MedPlus.Utilities.Utils;

public class TC_MedplusLab extends BaseClass {
	@Test
	public void toggle() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
		
		
		MedplusLab ml = new MedplusLab(driver);
		Thread.sleep(5000);
		ml.lens();
		Thread.sleep(5000);
		Logout lo=new Logout(driver);
		lo.account();
		lo.logout();
	}
}

