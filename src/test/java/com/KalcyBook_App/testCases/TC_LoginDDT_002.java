package com.KalcyBook_App.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.utilities.XLUtiles;

class TC_LoginDDT_002 extends BaseClass {
	
	@Test(dataProvider="LoginTestData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		Thread.sleep(3000);
		logger.info("user name provided");
		lp.setPassword(pwd);
		Thread.sleep(3000);
		logger.info("password provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		logger.info("user click on login button");
		//lp.clickbutton();
	Thread.sleep(3000);
		logger.info("user click on dropdown button");
     //   lp.clickLogout();
      //  Thread.sleep(3000);
      //  logger.info("user click on logout button");
	}
	
	@DataProvider(name="LoginTestData")
	String [][] getData() throws IOException
	{
		String path="C:\\Users\\lokes\\eclipse-workspace\\KalcyBook_App\\src\\test\\java\\com\\KalcyBook_App\\testData\\Logindatatest.xlsx";
		
		int rownum=XLUtiles.getRowCount(path, "Sheet1");
		int colcount=XLUtiles.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtiles.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	
}
