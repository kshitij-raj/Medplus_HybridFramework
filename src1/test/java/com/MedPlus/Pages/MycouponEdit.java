package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MycouponEdit {

	WebDriver driver;

		public MycouponEdit(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how=How.XPATH, using="//span[contains(text(),'Change Password')]")
	WebElement changepwd;
	
	@FindBy(how=How.XPATH,using="//input[@id='inputPassword']")
	WebElement oldpwd;
	
	@FindBy(how=How.XPATH,using= "//input[@id='inputNewPassword']")
	WebElement newpwd;
	
	@FindBy(how=How.XPATH, using="//input[@id='inputReNewPassword']")
	WebElement confirmpwd;
	
	@FindBy(how=How.XPATH, using="//form[@id='changePassword']//button[@class='btn btnDark activeBtn'][contains(text(),'Update')]")
	WebElement update;
		
		
	public void change()
		{
		changepwd.click();
		}
	public void oldpwd(String pwd)
	{
		oldpwd.sendKeys(pwd);	
	}
	
	public void newpwd(String npwd)
	{
		newpwd.sendKeys(npwd);
	}
	public void confirm(String conpwd)
	{
		confirmpwd.sendKeys(conpwd);
	}
	public void update()
	{
		update.click();
	}
}

