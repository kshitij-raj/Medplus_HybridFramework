package com.MedPlus.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.MedPlus.Utilities.ReadConfig;


public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	
	public String URL =readconfig.getApplicatioUrl();
	public String username =readconfig.getusername();
	public String password =readconfig.getpassword();
	//Register
	public String fname=readconfig.getfname();
	public String lname=readconfig.getlname();
	public String email=readconfig.getemail();
	public String Createpassword=readconfig.getCreatepassword();
	public String Createpasswordconfirm=readconfig.getCreatepasswordconfirm();
	public String Mobile=readconfig.getMobile();
	//LocateStore
	public String Address=readconfig.getAddress();
	
	public String pin=readconfig.getPin();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void intialize(String br) throws IOException {
		
			
		if(br.equals("firefox"))

		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
			
		}
		
		else if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver = new ChromeDriver();
		}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(URL); 
		
			logger = Logger.getLogger("MedPlus");
			PropertyConfigurator.configure("Log4J.properties");
			
			
		}
	
	@AfterClass
	public void terminate() throws IOException{
		driver.quit();
		
	} 
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+ "/Screenshot/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}
	
	
	}
