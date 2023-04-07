package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_PAYMENT.View_Paymentpage;




public class TC_View_PaymentpageTest_006 extends BaseClass{
	
	@Test
	public  void View_Paymentpagetest() throws InterruptedException {
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
		  
		  View_Paymentpage view = new View_Paymentpage(driver);

		  view.clickonpaymentbuttontab();
		  logger.info("user click on payment tab");
		  Thread.sleep(3000);
		  
		view.clickonView_Paymenticon();
		  logger.info("user click on View_Paymenticon");
		  Thread.sleep(3000);
		  
		  view.clickonDownloadPayment();
		  logger.info("user click on DownloadPayment ");
		  Thread.sleep(3000);
		  
		  view.clickonDownloadpayletterhead();
		  logger.info("user click on Downloadpayletterhead");
		  Thread.sleep(3000);
		  
		  view.clickonBackbutton();
		  logger.info("user click on Backbutton");
		  Thread.sleep(3000);
	}
	}
