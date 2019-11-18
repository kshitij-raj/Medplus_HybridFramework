package com.MedPlus.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PromotionLinks {

	WebDriver driver;
	public PromotionLinks(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	public void Promlinks()
	{
		List<WebElement> allPromolinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links present in Promotions page : "+allPromolinks.size());
		System.out.println(" Promotions links are : ");

		for(int i=0;i<allPromolinks.size();i++){

			System.out.println(+i+" "+allPromolinks.get(i).getText());
			
		}
	
}
}
