package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {

	WebDriver driver;
	public LogIn_Page(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(how=How.XPATH, using="//span[@class='visLg']")
	WebElement LoginClick;
	
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	WebElement UserName;
	
	@FindBy(how=How.XPATH,using= "//input[@id='password']")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using="//button[@id='popupLoginButton']")
	WebElement button;
	
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	WebElement userprofilebutton;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Logout')]")
	WebElement logoutbutton;
	
	
	@FindBy(how=How.XPATH, using="//div[@class='col-xs-12 col-sm-8']//span[@class='closeModal']")
	WebElement CloseSigninWindow;
	
	
	public void clickLogin()
	{
		LoginClick.click();
	}
	
	public void setUsername(String uname) throws InterruptedException
	{
		//LoginClick.click();
		Thread.sleep(3000);
		UserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void clickButton()
	{
		button.click();
	}
	
	public void logout() throws InterruptedException
	{
		//Thread.sleep(3000);
		userprofilebutton.click();
		
		logoutbutton.click();
	}
	
	public void signinWindowClose() throws InterruptedException
	{
		//Thread.sleep(3000);
		CloseSigninWindow.click();
	}
	
	
}
