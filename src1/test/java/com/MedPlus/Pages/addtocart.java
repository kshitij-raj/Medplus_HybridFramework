package com.MedPlus.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class addtocart {
		WebDriver driver;
		public addtocart(WebDriver rdriver) {
			driver=rdriver;
			PageFactory.initElements(rdriver,this);
		}	
		@FindBy(how=How.XPATH,using="//input[@id='enterval']")
		WebElement Search;
		
		@FindBy(how=How.XPATH,using="//button[contains(text(),'SEARCH')]") 
		WebElement click;
		
		@FindBy(how=How.XPATH,using="//tr[1]//td[4]//div[1]//div[1]//form[1]//div[2]//button[1]") 
		WebElement adingtocard;

		@FindBy(how=How.XPATH,using="//span[@class='margin-l-5 hidden-xs visLg']") 
		WebElement viewcard;
		
		@FindBy(how=How.XPATH,using="//button[@id='pharmaCheckOutBtn']") 
		WebElement viewshoppingcart;

		public  void Search1() throws InterruptedException//Constructor for invoking the driver
		{
			Thread.sleep(5000);
			Search.sendKeys("Horlicks");
            Thread.sleep(5000);
			click.click();
		}


		public void addingtocart() throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(5000);
			adingtocard.click();

		}


		public void viewcart() throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(5000);
			viewcard.click();

		}


		public void viewshoppingcart() throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(5000);
			viewshoppingcart.click();

		}


	

			

	
}
	
		

	
