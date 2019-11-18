package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class wallet {
	WebDriver driver;
	public wallet(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//a[contains(text(),'MedPlus Wallet')]")
		WebElement wallet;
		@FindBy(how=How.XPATH, using="//a[contains(text(),'Frequently Asked Questions')]")
		WebElement faq;
		
		@FindBy(how=How.XPATH, using="//a[contains(text(),'FlexiCash Catalog')]")
		WebElement catalog;
		@FindBy(how=How.XPATH, using="//a[@class='btn btn-tab text-center'][contains(text(),'My Wallet')]")
		WebElement wallet1;
		public void walletcheck()
		{
			wallet.click();
			faq.click();
			catalog.click();
			wallet1.click();
		}
	
}
