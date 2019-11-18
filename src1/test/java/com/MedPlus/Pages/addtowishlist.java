package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class addtowishlist {
	WebDriver driver;
	public addtowishlist(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);

}
	
@FindBy(how=How.XPATH,using="//input[@id='enterval']")
WebElement Search;

@FindBy(how=How.XPATH,using="//button[contains(text(),'SEARCH')]") 
WebElement click;

@FindBy(how=How.XPATH,using="//strong[contains(text(),'BOOST BOTTLE 500GM')]") 
WebElement product;

@FindBy(how=How.XPATH,using="//i[@class='fa fa-heart-o padding-r-5']") 
WebElement wishlist;



public  void Search1() throws InterruptedException//Constructor for invoking the driver
{
	Thread.sleep(5000);
	Search.sendKeys("boost");
    Thread.sleep(5000);
	click.click();
}


public void product() throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(5000);
	product.click();

}

public void wishlist() throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(5000);
	wishlist.click();
}
}

