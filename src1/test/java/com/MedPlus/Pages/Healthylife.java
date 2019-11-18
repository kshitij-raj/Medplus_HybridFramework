package com.MedPlus.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.MedPlus.TestCases.BaseClass;


public class Healthylife extends BaseClass {

	
	WebDriver driver;
	public Healthylife(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
		
		
		
		
		@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'Healthy Life')]")
		WebElement healthylife;
		
		
		
		
		
		
		
		public void healthylife() {
			// TODO Auto-generated method stub
			healthylife.click();
			List<WebElement> allele = driver.findElements(By.tagName("h3"));
			System.out.println("Total types of Promotions categories are : "+allele.size());
			System.out.println(" Promotions categories are : ");

			for(int i=0;i<allele.size();i++){

				System.out.println(+i+"."+" " +allele.get(i).getText());
				
			}
		}
		
		
}

