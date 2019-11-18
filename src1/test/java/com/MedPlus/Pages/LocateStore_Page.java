package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LocateStore_Page {

	WebDriver driver;
	public LocateStore_Page(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
		WebElement LocateStoreClick;
		
		@FindBy(how=How.XPATH, using="//input[@id='searchStoreLocation']")
		WebElement SearchStoreClick;
	
		@FindBy(how=How.XPATH, using="//ul[@id='tas']")
		WebElement Autosuggest;
		
		public void LocateStoreClick()
		{
			LocateStoreClick.click();
		}
	
		public void SearchStoreClick(String Address1)
		{
			SearchStoreClick.click();
			SearchStoreClick.sendKeys(Address1);
		}
	
}