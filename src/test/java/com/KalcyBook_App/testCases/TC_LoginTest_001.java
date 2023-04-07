package com.KalcyBook_App.testCases;




//import org.testng.Assert;
import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	
    @Test
    public void loginTest() throws InterruptedException
    {
    	driver.get(baseURL);
    	logger.info("URL is opened");
    	
  LoginPage lp=new LoginPage(driver);
   
  lp.setUserName(username);
  
  lp.setPassword(password);
  logger.info("Entered password");
  Thread.sleep(3000);
  lp.clickSubmit();
  logger.info(" user Entered");
  Thread.sleep(3000);
 //lp.clickbutton();
  //logger.info("user click on drop button");
  Thread.sleep(3000);
 // lp.clickLogout();
  //logger.info("user click on drop button");
 // Thread.sleep(3000);
  
  
 /* PaymentPage pp= new PaymentPage(driver);
  
  pp.clickPaymentTab();
  pp.selectChekbox();
  pp.clickDeleteTab();
  Alert iv = driver.switchTo().alert();
	System.out.println(iv.getText());
	iv.accept();
  //logger.info("");*/
   
   
   /*if (driver.getTitle().equals("Kalcy-App"))
   {
	   Assert.assertTrue(true);
	   logger.info("login test passed");
   }
    	
   else
   {
	   captureScreenshot( driver,"loginTest");
	   Assert.assertTrue(false);
	   logger.info("login test failed");
   }
    	
    }
    }*/
    }
}
