package com.KalcyBook_App.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_PAYMENT.Payment_page;


public class TC_Paymenttest_003  extends BaseClass {
	
	@Test
	public void paymenttest() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		   
		  lp.setUserName(username);
		  
		  lp.setPassword(password);
		  logger.info("Entered password");
		  Thread.sleep(3000);
		  lp.clickSubmit();
		  logger.info(" user Entered");
		  Thread.sleep(3000);
		
		Payment_page p = new Payment_page(driver);
		 Thread.sleep(3000);
		p.clickonpaymenttab();
		 logger.info("user click on payment tab");
		  Thread.sleep(3000);
		
	p.clickonsearchtab();
	 logger.info("user click on search tab and enter name");
	  Thread.sleep(3000);
		
		p.clickoncheckbox();
		 logger.info("user click on checkbox");
		  Thread.sleep(3000);
		
		p.clickondeletetab();
		 logger.info("user click on delete tab ");
		  Thread.sleep(3000);
		  Alert iv = driver.switchTo().alert();
			System.out.println(iv.getText());
			iv.accept();
			logger.info("user click on alert popup");
			Thread.sleep(5000);
			System.out.println("==============");
			
	}

}
