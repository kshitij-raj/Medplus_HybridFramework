package com.MedPlus.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pharmacy {
	WebDriver driver;
	public  pharmacy(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
}
	@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav']//a[contains(text(),'Pharmacy')]")
	WebElement pharmacyClick;
	
	@FindBy(how=How.XPATH, using="//div[@class='owl-wrapper']//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//a[1]")
	WebElement viewdetailsClick;
	
	@FindBy(how=How.XPATH, using="//div[@id='promotion_offers_0']//span[@class='closeModal']")
	WebElement closemodalClick;

	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Drugs by Therapeutic Category')]")
	WebElement drugscategoryClick;

	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Antacids, Antireflux Agents & Antiulcerants')]")
	WebElement antiacidsClick;
	
	
	public void pharmacyClick()
	{
		pharmacyClick.click();
	}
	public void PromEle()
	{
		List<WebElement> allele = driver.findElements(By.className("help-heading"));
		System.out.println("Total number categories are : "+allele.size());
		List<WebElement> allel = driver.findElements(By.className("helpList"));
		System.out.println("Total number categories are : "+allel.size());
		System.out.println("  categories are : ");

		//for(int i=0;i<allele.size();i++){

			//System.out.println(+i+"."+" " +allele.get(i).getText());
			
		//}
	}
	public void viewdetailsClick()
	{
		viewdetailsClick.click();
	}
	public void closemodalClick() {
		// TODO Auto-generated method stub
		closemodalClick.click();

	}

	

//	public void drugscategoryClick()
//	{
//		drugscategoryClick.click();
//	}
	
	public void antiacidsClick() {
		// TODO Auto-generated method stub
		antiacidsClick.click();

	}
	
	
}
