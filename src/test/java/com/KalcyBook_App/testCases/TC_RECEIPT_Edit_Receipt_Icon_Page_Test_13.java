package com.KalcyBook_App.testCases;

import org.testng.annotations.Test;


import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_RECEIPT.RECEIPT_Edit_Receipt_Icon_Page;


public class TC_RECEIPT_Edit_Receipt_Icon_Page_Test_13 extends BaseClass{
	
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
		
		  
		  RECEIPT_Edit_Receipt_Icon_Page edit=new RECEIPT_Edit_Receipt_Icon_Page(driver);
		  
		  
		  edit.clickonpaymentbuttontab();
		  logger.info("user click on Receipt tab and entered in Receipt list page");
		  Thread.sleep(3000);
		  
		  edit.clickonpaymenticonbutton();
		  logger.info("user click on Receipt tab icon button and entered in edit receipt page");
		  Thread.sleep(3000);
		  
		  edit.clickonSelect_Vendor();
		  
		  logger.info("user click on Select_Vendor tab");
		  Thread.sleep(3000);
		  
		  edit.clickonReceipt_Date("05", "10", "2023");
		  
		  logger.info("user click on Payment_Date tab");
		  Thread.sleep(3000);
		  
		  edit.clickonSelect_Address();

		  logger.info("user click on Select_Address tab");
		  Thread.sleep(3000);
		  
		  
		  edit.clickonSelect_Addresssearchtab();
		  

		  logger.info("user click on Select_Addresssearchtab tab");
		  Thread.sleep(3000);
		  
		  edit.clickonSelect_Addresssearchtabindex();
		  
		  logger.info("user click on Select_Address search index tab");
		  Thread.sleep(3000);
		  
		  edit.clickonPayment_Type();
		  
		  logger.info("user click on Payment_Type tab");
		  Thread.sleep(3000);
		  
		  
		  edit.clickon_Received_At_tab();
		  logger.info("user click on Received At tab");
		  Thread.sleep(3000);
		  
		  
		  edit.clickonAdjustment_Method();
		  logger.info("user click on Adjustment_Method tab");
		  Thread.sleep(3000);
		  
		  
		  edit.clickonNarration_tab();
		  logger.info("user click on Narration_tab");
		  Thread.sleep(3000);
		  
		  edit.clickonUpdatebutton();
		  logger.info("user click on Update_button tab");
		  Thread.sleep(3000);
		 /* Alert iv = driver.switchTo().alert();
			System.out.println(iv.getText());
			iv.accept();
			logger.info("user click on alert popup");
			Thread.sleep(5000);
			System.out.println("==============");*/
}

}
