package com.KalcyBook_App.pageObjects_RECEIPT;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RECEIPT_Add_Receipt_Page {
	
	 WebDriver Idriver;
		
     public RECEIPT_Add_Receipt_Page(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
     @FindBy(xpath="(//div[@class='d-flex align-items-start dash'])[1]")
 	WebElement Receipttab;
     
     @FindBy(xpath="//i[@class='fa fa-plus']")
  	WebElement newbutton;
     
	@FindBy(xpath="//span[@id='select2-client_data-container' and @class='select2-selection__rendered']")
	WebElement SelectLedger;
	
	@FindBy(xpath="//input[@tabindex='0']")
	WebElement SelectLedgersearchtab;
	//span[@id='select2-AddressData-container']
	//(//span[@class='select2-selection select2-selection--single'])[1]
	
	@FindBy(xpath="//input[@tabindex='0']")
	//@FindBy(xpath="//span[@id='select2-ledger_id-container']")
	WebElement SelectLedgersearchtabindex;
	////span[@id='select2-ledger_id-container']
	
	@FindBy(xpath="//input[@name='date_create']")
	WebElement Receipt_Date;
	
	@FindBy(xpath="//span[@title=' Select Address ']")
	WebElement SelectAddress;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SelectAddressSearchtab;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SelectAddressSearchtabindex;
	
	
	@FindBy(xpath="//select[@class='form-control paymentType']")
	WebElement Payment_Type ;
	
	
	@FindBy(xpath="//select[@class='form-control']")
	WebElement Received_At;
	
	@FindBy(xpath="//select[@name='adjustment_method']")
	WebElement AdjustmentMethod;
	
	
	@FindBy(xpath="//textarea[@name='narration']")
	WebElement Narration;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	
	
	public void click_on_Receipt_button_tab()
	{
		Receipttab.click();	
	}
	public void click_on_new_button_tab()
	{
		newbutton.click();	
	}
	public void  click_on_Select_Ledger_tab()
	{
		SelectLedger.click();
		
	}
	public void  click_on_Select_Ledger_search_tab()
	{
		SelectLedgersearchtab.sendKeys("Firstclient ( Sundry Debtors )");
		
		//Actions v = new Actions(Idriver);
		//v.doubleClick(SelectLedgersearchtab).perform();
		
		//SelectLedgersearchtab.click();
		
		//SelectLedgersearchtab.sendKeys("Firstclient ( Sundry Debtors )");
		//SelectLedgersearchtab.click();
		
		//Select s = new Select(SelectLedgersearchtab);
		//s.selectByValue("Firstclient ( Sundry Debtors )");
		
	}
	
	public void click_on_Select_Ledger_search_tab_index()
	{
		SelectLedgersearchtabindex.sendKeys(Keys.ENTER);
	}
	
	public void  click_on_Receipt_Date_tab(String dd,String mm,String  yy)
	{
		Receipt_Date.sendKeys(dd);
		Receipt_Date.sendKeys(mm);
		Receipt_Date.sendKeys(yy);
		
	}
	public void  click_on_Select_Address_tab()
	{
		SelectAddress.click();
	}
	
	public void  click_on_Select_Address_Search_tab() {
		
		SelectAddressSearchtab.sendKeys("Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari");
		//Select s = new Select(SelectAddressSearchtab);
		//s.selectByValue("Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari");
	}
	public void  click_on_Select_Address_Search_tab_index() {
		
		SelectAddressSearchtabindex.sendKeys(Keys.ENTER);
	}
	
	
	
	
	public void  click_on_Payment_Type_tab()
	{
		Payment_Type.click();
		Select s = new Select(Payment_Type);
		s.selectByVisibleText("Cash");
	}
	public void  click_on_Received_At_tab()
	{
		Received_At.click();
		Select s1 = new Select(Received_At);
		s1.selectByVisibleText("Select Received Type");
	}
	public void  click_on_Adjustment_Method_tab()
	{
		AdjustmentMethod.click();
		Select s2 = new Select(AdjustmentMethod);
		s2.selectByVisibleText("Against Bills");
	}
	public void  click_on_Narration_tab()
	{
		Narration.sendKeys("peyment done");
		
	}
	public void  click_on_Submit_tab()
	{
		Submit.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
