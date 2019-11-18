package com.MedPlus.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PurchaseHistory {
	WebDriver driver;
	public PurchaseHistory(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//div[@class='container-fluid padding-r-none padnone-l-r']//div[2]//div[1]//h3[1]")
		WebElement  purchasehistory;
		
		@FindBy(how=How.XPATH, using="//button[contains(text(),'Health Records')]")
		WebElement healthrecords;
		
		
		@FindBy(how=How.XPATH, using="//button[@class='btn btnDark btn-lg btn-block lhgt28']")
		WebElement newhealthrecord;
		
		@FindBy(how=How.XPATH, using="//input[@id='prescriptionName']")
		WebElement recordname;
		
		@FindBy(how=How.XPATH, using="//div[@class='col-sm-8 xs-padding-l-r-none']//input[@id='doctorName']")
		WebElement doctor;
		
		@FindBy(how=How.XPATH, using="//select[@id='healthRecordType']")
		WebElement select;
		
		
		
		@FindBy(how=How.XPATH, using="//button[@id='prescriptionSubmit']")
		WebElement submit;
		
		public void purchase()
		{
			purchasehistory.click();
		}
		public void records()
		{
			healthrecords.click();
		}
		public void newrecord()
		{
			newhealthrecord.click();
		}
		public void recordname(String name)
		{
			recordname.sendKeys(name);
		}
		public void doctorname(String name2)
		{
			doctor.sendKeys(name2);
		}
		public void select() throws InterruptedException
		{
			select.click();
			Thread.sleep(3000);
			 WebElement DropdownItems=driver.findElement(By.xpath("//select[@id='healthRecordType']"));
				Select s=new Select(DropdownItems);
				s.selectByValue("PRE");//Select values
				}
		
		public void submit()
		{
			submit.click();
		}
}
