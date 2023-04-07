package com.KalcyBook_App.pageObjects_PAYMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment_List_Page_Show_Entries_page {

	
	WebDriver Idriver;
	
    public Payment_List_Page_Show_Entries_page(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    
    @FindBy(xpath="(//i[@class='icon p-1 fa fa-money customize-icon font-large-1 fabtn'])[1]")
	WebElement paymentbutton;

    @FindBy(xpath="//select[@name='paymentTable_length']")
	 	WebElement Show_Entries;
    
    @FindBy(xpath="//a[@class='paginate_button next']")
 	WebElement Nextbutton;
    
    public void clickonpaymentbuttontab()
	{
		paymentbutton.click();	
	}
	public void clickonShow_Entries_tab()
	{
		Show_Entries.click();
		Select s1 = new Select(Show_Entries);
		s1.selectByVisibleText("10");
	}

	 public void clickonNextbuttontab()
		{
		
		 Nextbutton.click();
		 
		 
		}
	
}
