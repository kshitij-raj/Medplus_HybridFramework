package com.MedPlus.TestCases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MedPlus.Pages.LocateStore_Page;
import com.MedPlus.Pages.Logout;
import com.MedPlus.Pages.Register_Page;
import com.MedPlus.Utilities.*;
public class TC_LocateStore_001 extends BaseClass {

	

	@Test
	public void storeTest() throws InterruptedException
	{
		
		Utils u = new Utils();
		u.doLogin(username, password);
		Thread.sleep(3000);
		LocateStore_Page lp = new LocateStore_Page(driver);
		lp.LocateStoreClick();
		lp.SearchStoreClick(Address);
		
		List<WebElement>dropdowns=driver.findElements(By.className("map-address-section"));
		System.out.println("Total number of elements"+dropdowns.size());
		for(int i=0;i<dropdowns.size();i++) {
			
		System.out.println("The text is"+dropdowns.get(i).getText());
		}
		 
		
		Logout lo=new Logout(driver);
		lo.account();
		lo.logout();
	
	}
}

