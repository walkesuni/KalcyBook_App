package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;


import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_PAYMENT.DownloadPayment_page;

public class TC_DownloadPayment_page_Test_007 extends BaseClass{
	
	@Test
	public  void DownloadPayment_pagetest() throws InterruptedException {
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
		  
		  DownloadPayment_page Download = new DownloadPayment_page(driver);
		  
		  Download.clickonpaymentbuttontab();
		  logger.info("user click on payment tab");
		  Thread.sleep(3000);
		  
		  Download.clickonDownload_Paymenticon();
		  logger.info("user click on Download payment Icon button");
		  Thread.sleep(3000);
}
}