package com.KalcyBook_App.pageObjects_PAYMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class View_Paymentpage {
	
WebDriver Idriver;
	
    public View_Paymentpage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="(//i[@class='icon p-1 fa fa-money customize-icon font-large-1 fabtn'])[1]")
 	WebElement paymentbutton;
    
    @FindBy(xpath="(//button[@class='btn btn-info btn-rounded btn-sm'])[1]")
 	WebElement View_Paymenticon;
    
    
    		@FindBy(xpath="//button[@type='button' and @class='btn btn-info btn-labeled printBtn']")
    	 	WebElement DownloadPayment;
    		
    		@FindBy(xpath="//button[@type='button' and @class='btn btn-danger btn-labeled printBtn']")
    	 	WebElement Downloadpayletterhead;
    		
    		@FindBy(xpath="//button[@type='button' and @class='btn btn-info']")
    	 	WebElement Backbutton;
    		
    		public void clickonpaymentbuttontab()
    		{
    			paymentbutton.click();
    			
    		}
    		
    		public void clickonView_Paymenticon()
    		{
    			View_Paymenticon.click();
    			
    		}
    		
    		public void clickonDownloadPayment()
    		{
    			DownloadPayment.click();
    			Idriver.switchTo().defaultContent();
    			
    		}
    		
    		
    		public void clickonDownloadpayletterhead()
    		{
    			Downloadpayletterhead.click();
    			Idriver.switchTo().defaultContent();
    		}
    		
    		public void clickonBackbutton()
    		{
    			Backbutton.click();	
    		}
    

}
