package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;


import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_BANK_Details_Page.Bank_Details_Upload_Page;


public class TC_Bank_Details_Upload_Page_Test_14  extends BaseClass{
	
	@Test
	public void Edit_Receipt_Icon_Page_test() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		   
		  lp.setUserName(username);
		  logger.info("User should be Entered Username");
		  Thread.sleep(3000);
		  lp.setPassword(password);
		  logger.info("User should be Entered password");
		  Thread.sleep(3000);
		  lp.clickSubmit();
		  logger.info(" user should be click on next button and Entered in homepage of kalcy_Book");
		  Thread.sleep(3000);
		
		  
		  Bank_Details_Upload_Page Bank=new Bank_Details_Upload_Page(driver);
		  
		  
		  Bank.click_on_Bank_button_Tab();
		  logger.info("user click_on_Bank_button_Tab and entered in Bank_Transaction list Dropdown");
		  Thread.sleep(3000);
		  
		  Bank.click_on_Bank_Transaction_button_Tab();
		  logger.info("user click_on Bank_Transaction tab");
		  Thread.sleep(3000);
		  
		  Bank.click_on_Select_Bank_Ledger();
		  logger.info("user click_on Select_Bank_Ledger dropdown");
		  Thread.sleep(3000);

		  Bank.click_on_Choose_file_Tab();
		  logger.info("user click_on Choose_file_Tab");
		  Thread.sleep(3000);
		  
		  Bank.click_on_Submit_button_Tab();
		  logger.info("user click_on Submit_button_Tab");
		  Thread.sleep(3000);
		  
		  Bank.click_on_Download_sample_sheet();
		  logger.info("user click_on Download_sample_sheet");
		  Thread.sleep(3000);

}
}