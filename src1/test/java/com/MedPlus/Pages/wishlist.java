package com.MedPlus.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.MedPlus.TestCases.BaseClass;


public class wishlist extends BaseClass {

	
	WebDriver driver;
	public wishlist(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'FlexiRewards')]")
		WebElement flex;
	    
		@FindBy(how=How.XPATH, using="//a[contains(text(),'Redeem Rewards')]")
		WebElement redeem;
		
		
		@FindBy(how=How.XPATH, using="//button[contains(text(),'My WishList')]")
		WebElement mywishlist;
		
		
		
		
		
		public void flex()
		{
			flex.click();
		}
		public void redeem()
		{
			redeem.click();
		}
		
		public void mywishlist() {
			// TODO Auto-generated method stub
			mywishlist.click();
		}
		
		
}

