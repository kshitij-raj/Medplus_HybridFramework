package com.MedPlus.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.medpluslens;



import com.MedPlus.Utilities.Utils;

public class TC_medpluslens extends BaseClass {

	@Test
	public void medpluslens() throws InterruptedException, IOException
	{

		Utils u = new Utils();
		u.doLogin(username, password);		
		               
		medpluslens ls = new medpluslens(driver);
		
		Thread.sleep(5000);
		ls.medpluslensClick();
		
		Thread.sleep(5000);
		Logout lo=new Logout(driver);
		lo.account();
		lo.logout();
	
}
}
