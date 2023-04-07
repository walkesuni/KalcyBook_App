package com.KalcyBook_App.testCases;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_INVOICE.INVOICE_Page;

public class TC_INVOICE_Page_Test_15 extends BaseClass{
	
	@Test
	public void INVOICE_Page_test() throws InterruptedException {
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
	
		  INVOICE_Page Invoice = new INVOICE_Page (driver);
		  
		  Invoice.click_on_Invoice();
		  logger.info("user click on Invoice button Icon and entered in Invoice functionality page");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Purchase_Invoice();
		  logger.info("user click on Purchase_Invoice button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Sales_Invoice();
		  logger.info("user click on Sales_Invoice button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Sales_To_SEZ();
		  logger.info("user click on Sales_To_SEZ button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Export_Sales();
		  logger.info("user click on Export_Sales button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_All_Invoices();
		  logger.info("user click on All_Invoices button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Regular_Sales();
		  logger.info("user click on Regular_Sales button tab");
		  Thread.sleep(3000);
		  
		  
		  
		  Invoice.click_on_Show_Entries_tab();
		  logger.info("user click on Show_Entries button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_search_tab();
		  logger.info("user click on All_search button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Edit_Invoice();
		  logger.info("user click on Edit_Invoice button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Select_Client_tab();
		  logger.info("user click on Select_Client and select the client Firstclient ( Sundry Debtors ) form dropdown button tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Date_tab("10", "04", "2023");
		  logger.info("user click on Date button tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Billing_Address_tab();
		  logger.info("user click on Billing_Address button tab");
		  Thread.sleep(3000);
		 
		  
		  Invoice.click_on_Due_Date_tab("15", "05", "2023");
		  logger.info("user click on Due_Date button tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Shipping_Address_tab();
		  logger.info("user click on Shipping_Address button tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Product_tab();
		  logger.info("user click on Product button tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Qty_tab();
		  logger.info("user click on Qty button tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Discount_tab();
		  logger.info("user click on Discount button tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Add_more_row_tab();
		  logger.info("user click on Add_more_row button tab");
		  Thread.sleep(3000);
		 
		  
		  Invoice.click_on_Delete_row_tab();
		  logger.info("user click on Delete_row button tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Note_tab();
		  logger.info("user click on Note_tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Attachment_tab();
		  logger.info("user click on Attachment tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Addition_Roundup_tab();
		  logger.info("user click on Addition_Roundup_button_tab");
		  Thread.sleep(3000);
		  
		  Invoice.click_on_Round_up_valu_tab();
		  logger.info("user click on Round_up_valu_button_tab");
		  Thread.sleep(3000);
		  
		 Invoice.click_on_Update_button_tab();
		  logger.info("user click on Update_button_tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_Copy_invoice_icon_tab();
		  logger.info("user click on Copy_invoice icon_button_tab");
		  Thread.sleep(3000);
		  
		  
		  Invoice.click_on_View_invoice_icon_tab();
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll(0,800)");
			
		  logger.info("user click on View_invoice icon_button_tab");
		  Thread.sleep(3000);
		  
		  
		  
		  
		  
		  
		 /* Alert iv = driver.switchTo().alert();
			System.out.println(iv.getText());
			iv.accept();
			logger.info("user click on alert popup");
			Thread.sleep(5000);
			System.out.println("==============");*/

}
}
