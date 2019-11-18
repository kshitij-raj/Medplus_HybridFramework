package com.MedPlus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MedplusLab {
	WebDriver driver;



	public MedplusLab(WebDriver rdriver) {
	driver=rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	public void MycouponEdit(WebDriver rdriver) {
	driver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(how=How.XPATH, using="//div[@class='col-xs-12 col-sm-8 col-md-3']//a[2]//img[1]")
WebElement lens;



	
	
public void lens()
	{
	lens.click();
	}


}
