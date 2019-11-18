/**
 * 
 */
package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Search {
	WebDriver driver;
	public Search(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}	
	@FindBy(how=How.XPATH,using="//input[@id='enterval']")
	WebElement Search;
	
	@FindBy(how=How.XPATH,using="//body[@class='dftlocation']/header/div[@class='webNav hidden-xs hidden-sm']/nav[@class='navbar mart-nav margin-none header-bar affix-top']/ul[@class='nav navbar-nav nav-search']/form[@id='productSearchFrm']/div[@class='form-group margin-none']/div[@class='input-group productsearch']/span[@class='twitter-typeahead srchdropdwn container-fluid padding-none']/span[@class='tt-dropdown-menu dropdown-menu']/div[@class='tt-dataset-products']/span[@class='tt-suggestions']/div[3]/div[1]") 
	WebElement click;
	public  void Search1() throws InterruptedException//Constructor for invoking the driver
	{
		Thread.sleep(5000);
		Search.sendKeys("Horlicks");
		Thread.sleep(5000);
		click.click();
	}
}
