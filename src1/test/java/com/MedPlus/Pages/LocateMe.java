package com.MedPlus.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LocateMe 
{
	WebDriver driver;
	public LocateMe(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="//li[@class='margin-r-20']")
	WebElement LocateMeClick;
	
	@FindBy(how=How.XPATH, using="//input[@id='locality']")
	WebElement searchPlace;
	
	@FindBy(how=How.XPATH, using="//li[@class='list-render suggestion active']")
	WebElement searchClick;
	public void clickLocate() throws InterruptedException

	{
		LocateMeClick.click();
		Thread.sleep(5000);
		
	}
	public void clickSearch(String pin) throws InterruptedException
	{
		//searchPlace.click();
		searchPlace.sendKeys(pin);
		Thread.sleep(5000);
		searchClick.click();
	}
	
}
