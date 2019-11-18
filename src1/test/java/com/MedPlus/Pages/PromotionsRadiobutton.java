package com.MedPlus.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PromotionsRadiobutton {

	WebDriver driver;
	public PromotionsRadiobutton(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'Promotions')]")
		WebElement promo;
		

		
		public void Promo()
		{
			promo.click();
		}
		public void PromElem()
		{
			List<WebElement> allelem = driver.findElements(By.className("owl-page"));
			System.out.println("Total number of Radiobuttons  : "+allelem.size());

 }
}
