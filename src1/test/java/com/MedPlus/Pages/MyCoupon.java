package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MyCoupon {

	
	WebDriver driver;
	public MyCoupon(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'My Coupons')]")
		WebElement CouponClick;
		@FindBy(how=How.XPATH, using="//button[contains(text(),'My Account')]")
		WebElement myaccount;
		
		public void CouponClick()
		{
			CouponClick.click();
		}
		
		
			public void myaccount()
			{
				myaccount.click();
			}
	
	
	
}
