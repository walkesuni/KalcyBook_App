package com.KalcyBook_App.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_RECEIPT.RECEIPT_Delete_Page;



public class TC_RECEIPT_Delete_Page_Test_11 extends BaseClass {
	
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
		
		  RECEIPT_Delete_Page R = new RECEIPT_Delete_Page(driver);
		  
		 Thread.sleep(3000);
		R.clickonReceipttab();
		 logger.info("user click on payment tab");
		  Thread.sleep(3000);
		
	R.clickonsearchtab();
	 logger.info("user click on search tab and enter name Suspense Account");
	  Thread.sleep(3000);
		
		R.clickoncheckbox();
		 logger.info("user click on Suspense Account checkbox");
		  Thread.sleep(3000);
		
		R.clickondeletetab();
		 logger.info("user click on delete tab ");
		  Thread.sleep(3000);
		  Alert iv = driver.switchTo().alert();
			System.out.println(iv.getText());
			iv.accept();
			logger.info("user click on Delete tab alert popup");
			Thread.sleep(5000);
			
			System.out.println("Record Deleted Successfully.");
			
	}

}



