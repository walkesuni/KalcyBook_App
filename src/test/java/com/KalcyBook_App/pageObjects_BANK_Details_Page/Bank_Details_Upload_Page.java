package com.KalcyBook_App.pageObjects_BANK_Details_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Bank_Details_Upload_Page {

	
	 WebDriver Idriver;
		
     public Bank_Details_Upload_Page(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
     
     @FindBy(xpath="//i[@class='fa fa-bank']")
  	WebElement Bank_button_Tab;
     
     
     @FindBy(xpath="//a[@class='menu-item']")
   	WebElement Bank_Transaction_button_Tab;
     
     
     @FindBy(xpath="//select[@id='bank_ledger']")
   	WebElement Select_Bank_Ledger;
     
     
     @FindBy(xpath="//input[@id='userfile']")
   	WebElement Choose_file_Tab;
     
     @FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    	WebElement Submit_button_Tab;
     
     @FindBy(xpath="//i[@class='fa fa-download']")
    	WebElement Download_sample_sheet;
     
     
     @FindBy(xpath="//select[@id='bank_ledgers']")
 	WebElement Select_Bank_Ledger_tab;
  
     
     @FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
 	WebElement Submit_button;
  
     @FindBy(xpath="//select[@name='bankTrans_length']")
   	WebElement Select_Entries;
     
     
     @FindBy(xpath="//input[@type='search']")
 	WebElement search_Tab;
     
     @FindBy(xpath="//input[@class='selectall']")
  	WebElement Chekbox;
     
     
     @FindBy(xpath="//input[@class='btn btn-danger']")
  	WebElement Delete_Tab;
     
     @FindBy(xpath="//textarea[@id='narration2143']")
   	WebElement Narration_Tab;
     
     @FindBy(xpath="(//input[@class='btn btn-success btn-rounded'])[1]")
   	WebElement Edit_Payment_Tab;
     
     @FindBy(xpath="//a[@class='paginate_button next']")
   	WebElement Next_Button;
     
     
     public void click_on_Bank_button_Tab()
 	{
    	 Bank_button_Tab.click();	
 	}
 	public void click_on_Bank_Transaction_button_Tab()
 	{
 		Bank_Transaction_button_Tab.click();	
 	}
 	public void  click_on_Select_Bank_Ledger()
 	{
 		Select_Bank_Ledger.click();
 		Select s = new Select(Select_Bank_Ledger);
		s.selectByVisibleText("Bank Test ( Bank Accounts )");
 		
 	}
  
 	
 	
 	public void click_on_Choose_file_Tab()
 	{
 		Choose_file_Tab.sendKeys("C:\\Users\\lokes\\OneDrive\\Desktop\\bank_transaction.xlsx");	
 	}
     
 	public void click_on_Submit_button_Tab()
 	{
 		Submit_button_Tab.click();	
 	}
 	
 	public void click_on_Download_sample_sheet()
 	{
 		Download_sample_sheet.click();	
 	}
     
     
     
     
     
     
     
     
     
}//UPI/302614629317/Pay to BharatPe/bharatpe9072291/Yes Bank Ltd/ICI47a3efe7516b44338147a80b35c251b2/
