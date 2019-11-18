package com.MedPlus.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Promotions {

	
	WebDriver driver;
	public Promotions(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'Promotions')]")
		WebElement promo;
		

		
		public void Promo()
		{
			promo.click();
		}
		public void PromEle()
		{
			List<WebElement> allele = driver.findElements(By.className("btnfilter"));
			System.out.println("Total types of Promotions categories are : "+allele.size());
			System.out.println(" Promotions categories are : ");

			for(int i=0;i<allele.size();i++){

				System.out.println(+i+"."+" " +allele.get(i).getText());
				
			}
			
  
			
		}
		
		
	
}
