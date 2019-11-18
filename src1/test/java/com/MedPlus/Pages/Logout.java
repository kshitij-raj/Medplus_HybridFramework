package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;
	public Logout(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(how=How.XPATH, using="//a[@id='customerSignIn']")
	WebElement account;

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Logout')]")
	WebElement Logout;
	
	public void account() {
		account.click();
	}
		
	public void logout() {
		Logout.click();

	}
	
}
