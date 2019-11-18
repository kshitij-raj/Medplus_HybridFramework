package com.MedPlus.Utilities;

import java.io.IOException;
import com.MedPlus.Utilities.xlsreader;
import com.MedPlus.Pages.*;

import com.MedPlus.TestCases.BaseClass;

public class Utils  extends BaseClass{

	public String[][] getData(String testname) throws IOException
	{
		String path = System.getProperty("user.dir")+"/src1/test/java/com/MedPlus/TestData/LogIn.xlsx";
		int rownum=XLUtils.getRowCount(path, testname);
		int colnum=XLUtils.getCellCount(path, testname, 1);
		String data[][]=new String[rownum][colnum];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				data[i-1][j]=XLUtils.getCellData(path, testname, i, j);
			}
		}
		
		return data;
	}
	
	public  void doLogin(String username,String password) throws InterruptedException
	{	
		Thread.sleep(3000);
		LogIn_Page lp = new LogIn_Page(driver);
		lp.clickLogin();
		Thread.sleep(3000);
		lp.setUsername(username);
		logger.info("Username is entered");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.clickButton();
	}
	
	public void doLogout() throws InterruptedException
	{
		LogIn_Page lp = new LogIn_Page(driver);
		lp.logout();
	}
	
	public void closeSignWindow() throws InterruptedException
	{
		LogIn_Page lp = new LogIn_Page(driver);
		lp.signinWindowClose();
	}
	
	public static void setData(String testname,String colname, String  existerowVal, String Status, String existcolName)
	{
		xlsreader setdata = new xlsreader(System.getProperty("user.dir")+"/src1/test/java/com/Medplus/TestData/LogIn.xlsx");
		int num = setdata.getCellRowNum(testname, existcolName, existerowVal);
		System.out.println(num);
		System.out.println(Status);
		setdata.setCellData(testname, colname, num, Status);
	}
	
	
}
