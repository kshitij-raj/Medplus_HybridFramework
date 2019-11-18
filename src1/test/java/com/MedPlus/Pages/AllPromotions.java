package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AllPromotions {

	WebDriver driver;
	public AllPromotions(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'Promotions')]")
		WebElement promo;
		@FindBy(how=How.XPATH, using="//a[contains(text(),'OTC & HEALTH NEEDS')]")
		WebElement promo1;
		@FindBy(how=How.XPATH, using="//a[contains(text(),'PHARMACY')]")
		WebElement promo2;
		@FindBy(how=How.XPATH, using="//a[contains(text(),'PERSONAL CARE')]")
		WebElement promo3;
		@FindBy(how=How.XPATH, using="//a[contains(text(),'BABY NEEDS')]")
		WebElement promo4;
		@FindBy(how=How.XPATH, using="//a[contains(text(),'HEALTH & NUTRITION')]")
		WebElement promo5;
		
		
		
		public void Promo() throws InterruptedException
		{
			promo.click();
			promo1.click();
			System.out.println("OTC & HEALTH NEEDS page is Opened");
			Thread.sleep(2000);

			promo2.click();
			System.out.println("PHARMACY page is Opened");
			Thread.sleep(2000);

			promo3.click();
			System.out.println("PERSONAL CARE page is Opened");
			Thread.sleep(2000);

			promo4.click();
			System.out.println("BABY NEEDS page is Opened");
			Thread.sleep(2000);

			promo5.click();
			System.out.println("HEALTH & NUTRITION page is Opened");


			
		}
		

}
