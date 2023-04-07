package com.KalcyBook_App.testCases;

//import org.openqa.selenium.Alert;
import org.testng.annotations.Test;


import com.KalcyBook_App.pageObjects.LoginPage;
import com.KalcyBook_App.pageObjects_PAYMENT.Edit_Paymentpage;

public class TC_Edit_Paymentpage_test_005  extends BaseClass{
	
	@Test
	public void Edit_Paymentpagetest() throws InterruptedException {
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
		
		  
		  Edit_Paymentpage  edit= new Edit_Paymentpage(driver);
		  
		  
		  edit.clickonpaymentbuttontab();
		  logger.info("user click on payment tab");
		  Thread.sleep(3000);
		  
		  edit.clickonpaymenticonbutton();
		  logger.info("user click on payment tab icon button");
		  Thread.sleep(3000);
		  
		  edit.clickonSelect_Vendor();
		  
		  logger.info("user click on Select_Vendor tab");
		  Thread.sleep(3000);
		  
		  edit.clickonPayment_Date("05", "10", "2023");
		  
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
		  
		  
		  edit.clickonPayment_Through();
		  logger.info("user click on Payment_Through tab");
		  Thread.sleep(3000);
		  
		  
		  edit.clickonAdjustment_Method();
		  logger.info("user click on Adjustment_Method tab");
		  Thread.sleep(3000);
		  
		  
		  edit.clickonNarration_tab();
		  logger.info("user click on Narration_tab tab");
		  Thread.sleep(3000);
		  
		  edit.clickonUpdatebutton();
		  logger.info("user click on Updatebutton tab");
		  Thread.sleep(3000);
		 /* Alert iv = driver.switchTo().alert();
			System.out.println(iv.getText());
			iv.accept();
			logger.info("user click on alert popup");
			Thread.sleep(5000);
			System.out.println("==============");*/
}
	}

