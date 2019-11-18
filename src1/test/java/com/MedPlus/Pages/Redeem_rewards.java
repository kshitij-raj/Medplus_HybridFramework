package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Redeem_rewards {

	
	WebDriver driver;
	public Redeem_rewards(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'FlexiRewards')]")
		WebElement flex;
	    
		@FindBy(how=How.XPATH, using="//a[contains(text(),'Redeem Rewards')]")
		WebElement redeem;
		
		
		@FindBy(how=How.XPATH, using="//div[@id='GIFT_10001']//div[contains(@class,'col-xs-12 col-sm-6 col-md-4 col-lg-4 padding-l-r AVEL0004_summary')]//a[contains(@class,'detailtxt')][contains(text(),'more details')]")
		WebElement moreDetails;
		
		@FindBy(how=How.XPATH, using="//button[contains(@class,'p-abs zoomimg-close')]")
		WebElement close;
		
		
		@FindBy(how=How.XPATH, using="//div[@id='GIFT_10001']//button[@id='AVEL0004']")
		WebElement add;
		
		
		
		public void flex()
		{
			flex.click();
		}
		public void redeem()
		{
			redeem.click();
		}
		public void moreDetails() {
			// TODO Auto-generated method stub
			moreDetails.click();
		}
		public void add() {
			// TODO Auto-generated method stub
			add.click();
		}
		public void close() {
			// TODO Auto-generated method stub
			close.click();
		}
	
	
	
}
