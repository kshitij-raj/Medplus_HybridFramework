package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.LogIn_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Utilities.Utils;

public class TC_Logout extends BaseClass{
	@Test
	public void coupontest() throws InterruptedException, IOException
	{
		Utils u=new Utils();
		u.doLogin(username, password);
		
		Logout lo=new Logout(driver);
		lo.account();
		lo.logout();
}
}