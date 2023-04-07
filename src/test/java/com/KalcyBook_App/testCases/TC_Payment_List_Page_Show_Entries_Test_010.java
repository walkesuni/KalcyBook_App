package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_PAYMENT.Payment_List_Page_Show_Entries_page;


public class TC_Payment_List_Page_Show_Entries_Test_010 extends BaseClass {
	
	
	@Test
	public void Payment_List_Page_Show_Entries() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		   
		  lp.setUserName(username);
		  logger.info("Entered Username");
		  Thread.sleep(3000);
		  lp.setPassword(password);
		  logger.info("Entered password");
		  Thread.sleep(3000);
		  lp.clickSubmit();
		  logger.info(" user click on next button and Entered in homepage of kalcybook application");
		  Thread.sleep(3000);
		  
		  Payment_List_Page_Show_Entries_page v = new Payment_List_Page_Show_Entries_page(driver);
		  
		  v.clickonpaymentbuttontab();
		  logger.info("User click on the payment tab button and entered in payment list page");
		  Thread.sleep(3000);
		  
		  v.clickonShow_Entries_tab();
		  logger.info("User click on the show entries tab and select 10 value form table");
		  Thread.sleep(3000);
		  for (int i=0; i<9; i++) {
		  v.clickonNextbuttontab();
		  logger.info("User click on the next button and move to the next page");
		  Thread.sleep(3000);
		  }
		 
	}

}
