package com.KalcyBook_App.pageObjects_PAYMENT;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Edit_Paymentpage {
	
	
	WebDriver Idriver;
	
    public Edit_Paymentpage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    @FindBy(xpath="(//i[@class='icon p-1 fa fa-money customize-icon font-large-1 fabtn'])[1]")
 	WebElement paymentbutton;
    
    @FindBy(xpath="(//button[@class='btn btn-success btn-rounded btn-sm' and @title='Edit Payment'])[2]")
 	WebElement paymenticonbutton;
   // (//span[@class='fa fa-edit'])[1]
    
    @FindBy(xpath="//select[@name='clientId']")
 	WebElement Select_Vendor;
    
    @FindBy(xpath="//input[@name='date_create']")
 	WebElement Payment_Date;
    

    @FindBy(xpath="//span[@title=' Select Address ']")
 	WebElement Select_Address;
    
    @FindBy(xpath="//input[@type='search']")
 	WebElement Select_Addresssearchtab;
    
    @FindBy(xpath="//input[@tabindex='0']")
 	WebElement Select_Addresssearchtabindex;
    
    @FindBy(xpath="//select[@name='payment_type']")
 	WebElement Payment_Type;
    
    @FindBy(xpath="//select[@name='payment_through']")
 	WebElement Payment_Through;
    
    @FindBy(xpath="//select[@name='adjustment_method']")
 	WebElement Adjustment_Method ;
    
    @FindBy(xpath="//textarea[@name='narration']")
 	WebElement Narration ;
    
    @FindBy(xpath="//button[@id='updateData']")
 	WebElement Updatebutton ;
    
    
    
    
    
    
    
    
    public void clickonpaymentbuttontab()
	{
		paymentbutton.click();	
	}
    
    public void clickonpaymenticonbutton()
	{
    	paymenticonbutton.click();	
	}
    
    public void clickonSelect_Vendor()
	{
    	Select_Vendor.click();
    	Select s = new Select(Select_Vendor);
		s.selectByVisibleText("Firstclient ( Sundry Debtors )");
	}
    
    public void clickonPayment_Date(String dd,String mm,String  yy)
   	{
    	Payment_Date.sendKeys(dd);
		Payment_Date.sendKeys(mm);
		Payment_Date.sendKeys(yy);	
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
    
    public void clickonPayment_Through()
   	{
    	Payment_Through.click();
    	Select s1 = new Select(Payment_Through);
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
    	Narration.sendKeys("payment clear by user with cash process done");	
   	}
    
    public void clickonUpdatebutton()
   	{
    	Updatebutton.click();	
   	}
}
