package com.KalcyBook_App.pageObjects_RECEIPT;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RECEIPT_Edit_Receipt_Icon_Page {
	
WebDriver Idriver;
	
    public RECEIPT_Edit_Receipt_Icon_Page(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="(//div[@class='d-flex align-items-start dash'])[1]")
 	WebElement Receipt_tab;
    
    @FindBy(xpath="(//span[@class='fa fa-edit'])[1]")
 	WebElement Edit_Receipt_icon_button;
   // (//span[@class='fa fa-edit'])[1]
    
    @FindBy(xpath="//select[@name='clientId']")
 	WebElement Select_Vendor;
    
    @FindBy(xpath="//input[@name='date_create']")
 	WebElement Receipt_Date;
    

    @FindBy(xpath="//span[@class='select2-selection__rendered']")
 	WebElement Select_Address;
    
    @FindBy(xpath="//input[@class='select2-search__field']")
 	WebElement Select_Addresssearchtab;
    
    @FindBy(xpath="//input[@tabindex='0']")
 	WebElement Select_Addresssearchtabindex;
    
    @FindBy(xpath="//select[@name='payment_type']")
 	WebElement Payment_Type;
    
    @FindBy(xpath="//select[@class='form-control']")
 	WebElement Received_At;
    
    @FindBy(xpath="//select[@class='form-control adjustment_method']")
 	WebElement Adjustment_Method ;
    
    @FindBy(xpath="//textarea[@class='form-control']")
 	WebElement Narration ;
    
    @FindBy(xpath="//button[@class='btn btn-primary']")
 	WebElement Updatebutton ;
    
    
    
    
    
    
    
    
    public void clickonpaymentbuttontab()
	{
    	Receipt_tab.click();	
	}
    
    public void clickonpaymenticonbutton()
	{
    	Edit_Receipt_icon_button.click();	
	}
    
    public void clickonSelect_Vendor()
	{
    	Select_Vendor.click();
    	Select s = new Select(Select_Vendor);
		s.selectByVisibleText("Firstclient ( Sundry Debtors )");
	}
    
    public void clickonReceipt_Date(String dd,String mm,String  yy)
   	{
    	Receipt_Date.sendKeys(dd);
    	Receipt_Date.sendKeys(mm);
    	Receipt_Date.sendKeys(yy);	
   	}
    
    public void clickonSelect_Address()
   	{
    	Select_Address.click();	
   	}
    
    public void clickonSelect_Addresssearchtab()
   	{
    	Select_Addresssearchtab.sendKeys("Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari");	
   	}
    
    public void clickonSelect_Addresssearchtabindex()
   	{
    	Select_Addresssearchtabindex.sendKeys(Keys.ENTER);
   	}
    
    public void clickonPayment_Type()
   	{
    	Payment_Type.click();	
    	Select s = new Select(Payment_Type);
		s.selectByVisibleText("Cash");
   	}
    
    public void clickon_Received_At_tab()
   	{
    	Received_At.click();
    	Select s1 = new Select(Received_At);
		s1.selectByVisibleText("Select Payment Through");
   	}
    public void clickonAdjustment_Method()
   	{
    	Adjustment_Method.click();
    	Select s2 = new Select(Adjustment_Method);
		s2.selectByVisibleText("On Account");
   	}
    
    
    public void clickonNarration_tab()
   	{
    	Narration.sendKeys("   payment clear by user with cash process done");	
   	}
    
    public void clickonUpdatebutton()
   	{
    	Updatebutton.click();	
   	}

}
