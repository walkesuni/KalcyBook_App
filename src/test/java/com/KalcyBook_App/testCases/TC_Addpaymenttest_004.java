package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;


import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_PAYMENT.Add_Paymentpage;

public class TC_Addpaymenttest_004 extends BaseClass{

	
	@Test
	public void addpaymenttest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		   
		  lp.setUserName(username);
		  logger.info("Entered Username");
		  Thread.sleep(3000);
		  lp.setPassword(password);
		  logger.info("Entered password");
		  Thread.sleep(3000);
		  lp.clickSubmit();
		  logger.info(" user Entered");
		  Thread.sleep(3000);
		
		  Add_Paymentpage Add= new Add_Paymentpage(driver);
		  Add.clickonpaymentbuttontab();
		  logger.info("user click on payment tab");
		  Thread.sleep(3000);
		  
		  
		  Add.clickonnewbuttontab();
		  logger.info("user click on New button ");
		  Thread.sleep(3000);
		  
		  
		  Add.clickonSelectLedgertab();
		  logger.info("user click on SelectLedger tab");
		  Thread.sleep(3000);
		  
		  Add.clickonSelectLedgersearchtab();
		  logger.info("user click on SelectLedger Search tab");
		  Thread.sleep(3000);
		  
		  Add.clickonSelectLedgersearchtabindex();
		  logger.info("user click on SelectLedger Search tabindex");
		  Thread.sleep(3000);
		  
		  
		  Add.clickonPaymentDatetab("10", "04", "2024");
		  logger.info("user click on paymentdate tab");
		  Thread.sleep(3000);
		  
		  
		  Add.clickonSelectAddresstab();
		  logger.info("user click on Select address  tab");
		  Thread.sleep(3000);
		  
		  Add.clickonSelectAddressSearchtab();
		  logger.info("user click on Select address Search  tab");
		  Thread.sleep(5000);
		  
		Add.clickonSelectAddressSearchtabindex();
		  logger.info("user click on SelectAddress Search tabindex");
		  Thread.sleep(3000);
		  
		  Add.clickonPaymentTypetab();
		  logger.info("user click on payment type tab");
		  Thread.sleep(3000);
		  
		  
		  Add.clickonPaymentThroughtab();
		  logger.info("user click on PaymentThrough tab");
		  Thread.sleep(3000);
		  
		  
		  Add.clickonAdjustmentMethodtab();
		  logger.info("user click on AdjustmentMethod tab");
		  Thread.sleep(3000);
		  
		  
		  
		  Add.clickonNarrationtab();
		  logger.info("user click on Narration tab");
		  Thread.sleep(3000);
		  
		  
		  
		  Add.clickonSubmittab();
		  logger.info("user click on Submit tab");
		  Thread.sleep(3000);
		  
		  
	}
}
