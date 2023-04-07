package com.KalcyBook_App.pageObjects_PAYMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Send_Paymentpage {
	
	 WebDriver Idriver;
		
     public Send_Paymentpage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
     
     
     @FindBy(xpath="(//i[@class='icon p-1 fa fa-money customize-icon font-large-1 fabtn'])[1]")
 	WebElement paymentbutton;

     @FindBy(xpath="(//button[@title='Edit Payment' and @class='btn btn-success btn-rounded btn-sm'])[2]")
	 	WebElement Send_Paymenticon;
     
     public void clickonpaymentbuttontab()
 	{
 		paymentbutton.click();	
 	}
 	public void clickonSend_Paymenticon()
 	{
 		Send_Paymenticon.click();	
 	}

}
