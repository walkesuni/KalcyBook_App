package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_PAYMENT.Send_Paymentpage;


public class TC_Send_Paymentpage_Test_008 extends BaseClass {
	
	@Test
	public  void Send_Paymentpage_Test() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		   
		  lp.setUserName(username);
		  logger.info("Entered Username");
		  Thread.sleep(3000);
		  lp.setPassword(password);
		  logger.info("Entered password");
		  Thread.sleep(3000);
		  lp.clickSubmit();
		  logger.info(" user Entered in homepage");
		  Thread.sleep(3000);
		  
		  Send_Paymentpage Send = new Send_Paymentpage(driver);
		  
		  Send.clickonpaymentbuttontab();
		  logger.info("user click on payment tab");
		  Thread.sleep(3000);
		  
		  Send.clickonSend_Paymenticon();
		  logger.info("user click on Send payment Icon button");
		  Thread.sleep(3000);
	}
}
