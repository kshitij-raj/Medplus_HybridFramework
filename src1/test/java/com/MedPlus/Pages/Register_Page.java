package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.MedPlus.Pages.LogIn_Page;
public class Register_Page  {
	
	WebDriver driver;
	public Register_Page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//span[@class='visLg']")
	WebElement LoginClick;
	
	@FindBy(how=How.XPATH, using="//div[@class='btm-fixedbar color-grey border-t text-center padding-t-b-15 signinPopUp']//a")
	WebElement RegisterHere;
		
	@FindBy(how=How.XPATH, using="//input[@id='firstName']")
	WebElement FirstName;
	
	@FindBy(how=How.XPATH, using="//input[@id='lastName']")
	WebElement LastName;
	
	@FindBy(how=How.XPATH, using="//input[@id='emailAddress']")
	WebElement Email;
	
	@FindBy(how=How.XPATH, using="//input[@id='userPassword']")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwordVerify']")
	WebElement ConfirmPassword;
	

	@FindBy(how=How.XPATH, using="//input[@id='mobile']")
	WebElement Mobile1;
	
	@FindBy(how=How.XPATH, using="//button[@id='registerHereBtn']")
	WebElement RegisterButton;
	
	public void LoginClick()
	{
		LoginClick.click();
	}
	
	public void clickRegisterHere()
	{
		RegisterHere.click();
	}
	
	public void setFirstname(String fname) throws InterruptedException
	{
		Thread.sleep(3000);
		FirstName.sendKeys(fname);
	}
	
	public void setLasttname(String lname) throws InterruptedException
	{
		Thread.sleep(3000);
		LastName.sendKeys(lname);
	}
	
	public void setEmail(String email) throws InterruptedException
	{
		Thread.sleep(3000);
		Email.sendKeys(email);
	}
	
	public void setPassword(String Createpassword) throws InterruptedException
	{
		Thread.sleep(3000);
		Password.sendKeys(Createpassword);
	}
	
	public void setConfPassword(String Createpasswordconfirm) throws InterruptedException
	{
		Thread.sleep(3000);
		ConfirmPassword.sendKeys(Createpasswordconfirm);
	}
	
	public void setMobile(String Mobile) throws InterruptedException
	{
		Thread.sleep(3000);
		Mobile1.sendKeys(Mobile);
	}
	public void RegisterButton() throws InterruptedException
	{
		Thread.sleep(3000);
		RegisterButton.click();
	}
	
	

}
