package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Cartview {
	WebDriver driver;
	public Cartview(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
	@FindBy(how=How.XPATH,using="//li[@id='miniCartDiv']")
	WebElement cart;
	
	@FindBy(how=How.XPATH,using="//form[@class='margin-none']//div[@class='container-fluid padding-none']") 
	WebElement viewc;
	
	@FindBy(how=How.XPATH,using="//div[@class='padding-all checkout-container-row']") 
	WebElement text;
	public  void cart() throws InterruptedException//Constructor for invoking the driver
	{
		Thread.sleep(5000);
		cart.click();
		Thread.sleep(5000);
		viewc.click();
		Thread.sleep(5000);
		System.out.println(text.getText());
	}
}
