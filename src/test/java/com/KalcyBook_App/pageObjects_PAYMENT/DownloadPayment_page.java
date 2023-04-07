 package com.KalcyBook_App.pageObjects_PAYMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPayment_page {
	
	

		
	     WebDriver Idriver;
		
	     public DownloadPayment_page(WebDriver rdriver)
		{
			Idriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	     
	     
	     @FindBy(xpath="(//i[@class='icon p-1 fa fa-money customize-icon font-large-1 fabtn'])[1]")
	 	WebElement paymentbutton;
	
	     @FindBy(xpath=" (//span[@class='fa fa-download'])[1]")
		 	WebElement Download_Paymenticon;
	     
	     public void clickonpaymentbuttontab()
	 	{
	 		paymentbutton.click();	
	 	}
	 	public void clickonDownload_Paymenticon()
	 	{
	 		Download_Paymenticon.click();	
	 	}
	
	    
}

