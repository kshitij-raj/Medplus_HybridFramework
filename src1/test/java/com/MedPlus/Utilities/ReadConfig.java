package com.MedPlus.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch (Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
	}
	public String getApplicatioUrl()
	{
		String url=pro.getProperty("URL");
		return url;
	}
	public String getusername()
	{
		String usname=pro.getProperty("username");
		return usname;
	}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getfirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getfname()
	{
		String fname=pro.getProperty("fname");
		return fname;
	}
	public String getlname()
	{
		String lname=pro.getProperty("lname");
		return lname;
	}
	public String getemail()
	{
		String email=pro.getProperty("email");
		return email;
	}
	public String getCreatepassword()
	{
		String Createpassword=pro.getProperty("Createpassword");
		return Createpassword;
	}
	public String getCreatepasswordconfirm()
	{
		String Createpasswordconfirm=pro.getProperty("Createpasswordconfirm");
		return Createpasswordconfirm;
	}
	public String getMobile()
	{
		String Mobile=pro.getProperty("Mobile");
		return Mobile;
	}
	
	public String getAddress()
	{
		String Address=pro.getProperty("Address");
		return Address;
	}
	
	public String getPin()
	{
		String pin=pro.getProperty("pin");
		return pin;
	}
	
}
