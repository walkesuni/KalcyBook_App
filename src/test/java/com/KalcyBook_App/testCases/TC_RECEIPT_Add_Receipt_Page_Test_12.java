package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_RECEIPT.RECEIPT_Add_Receipt_Page;


public class TC_RECEIPT_Add_Receipt_Page_Test_12 extends BaseClass{
	
	@Test
	public void RECEIPT_Delete_Page_test() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		   
		  lp.setUserName(username);
		  logger.info("User should be Entered Username");
		  lp.setPassword(password);
		  logger.info("User should be Entered password");
		  Thread.sleep(3000);
		  lp.clickSubmit();
		  logger.info(" user should be click on next button and Entered in homepage of kalcy_Book");
		  Thread.sleep(3000);
		  
		  RECEIPT_Add_Receipt_Page Add= new RECEIPT_Add_Receipt_Page(driver);
		  
		  
		  Add.click_on_Receipt_button_tab();
		  logger.info("user click on Receipt tab and entered in Receipt list page");
		  Thread.sleep(3000);
		  
		  
		  Add.click_on_new_button_tab();
		  logger.info("user click on New button in Receipt list page and open add Receipt page");
		  Thread.sleep(3000);
		  
		  
		  Add.click_on_Select_Ledger_tab();
		  logger.info("user click on SelectLedger tab");
		  Thread.sleep(3000);
		  
		  Add.click_on_Select_Ledger_search_tab();
		  logger.info("user click on SelectLedger Search tab");
		  Thread.sleep(3000);
		  
		  Add.click_on_Select_Ledger_search_tab_index();
		  logger.info("user click on SelectLedger Search tab index and entered Firstclient ( Sundry Debtors )");
		  Thread.sleep(3000);
		  
		  
		  Add.click_on_Receipt_Date_tab("10", "04", "2024");
		  logger.info("user click on payment date tab and modify date");
		  Thread.sleep(3000);
		  
		  
		  Add.click_on_Select_Address_tab();
		  logger.info("user click on Select address  tab");
		  Thread.sleep(3000);
		  
		  Add.click_on_Select_Address_Search_tab();
		  logger.info("user click on Select address Search  tab");
		  Thread.sleep(5000);
		  
		Add.click_on_Select_Address_Search_tab_index();
		  logger.info("user click on SelectAddress Search tab index and entered Address Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari ");
		  Thread.sleep(3000);
		  
		 Add.click_on_Payment_Type_tab();
		  logger.info("user click on payment type tab and select cash mode option form dropdown");
		  Thread.sleep(3000);
		  
		  
		  Add.click_on_Received_At_tab();
		  logger.info("user click on PaymentThrough tab");
		  Thread.sleep(3000);
		  
		  
		  Add.click_on_Adjustment_Method_tab();
		  logger.info("user click on AdjustmentMethod tab and select Against Bills ");
		  Thread.sleep(3000);
		  
		  
		  
		  Add.click_on_Narration_tab();
		  logger.info("user click on Narration tab and menstion bill paid charge update");
		  Thread.sleep(3000);
		  
		  
		  
		  Add.click_on_Submit_tab();
		  logger.info("user click on Submit tab and close add receipt page");
		  Thread.sleep(3000);
		  
		  
	}
}

		


