package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class footer {
	WebDriver driver;
	public footer(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
		@FindBy(how=How.XPATH, using="//a[contains(text(),'About Us')]")
		WebElement aboutus;
		
		@FindBy(how=How.XPATH, using="//a[contains(text(),'FAQs')]")
		WebElement faqs;
		
		@FindBy(how=How.XPATH, using="//a[contains(text(),'Locate A Store')]")
		WebElement locateastore;

		@FindBy(how=How.XPATH, using="//a[contains(text(),'Track Orders')]")
		WebElement trackorders;
		
		@FindBy(how=How.XPATH, using="//a[contains(text(),'Browse All Brands')]")
		WebElement browseallbrands;
		
		@FindBy(how=How.XPATH, using="//a[contains(text(),'Customer Feedback')]")
		WebElement customerfeedback;
		
		@FindBy(how=How.XPATH, using="//a[contains(text(),'Contact Us')]")
		WebElement contactus;
		
	public void aboutus()
	{
		aboutus.click();
	}
	public void faqs() {
		// TODO Auto-generated method stub
		faqs.click();
	} 
	public void locateastore()
	{
		locateastore.click();
}
	
	public void trackorders() {
		// TODO Auto-generated method stub
		trackorders.click();
	}

	public void browseallbrands() {
		// TODO Auto-generated method stub
		browseallbrands.click();
}
	public void customerfeedback() {
		// TODO Auto-generated method stub
		customerfeedback.click();
}
	public void contactus() {
		// TODO Auto-generated method stub
		contactus.click();
}
}

