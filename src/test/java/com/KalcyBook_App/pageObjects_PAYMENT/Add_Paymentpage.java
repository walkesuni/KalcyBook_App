package com.KalcyBook_App.pageObjects_PAYMENT;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_Paymentpage {

	
     WebDriver Idriver;
	
     public Add_Paymentpage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
     @FindBy(xpath="(//i[@class='icon p-1 fa fa-money customize-icon font-large-1 fabtn'])[1]")
 	WebElement paymentbutton;
     
     @FindBy(xpath="//i[@class='fa fa-plus']")
  	WebElement newbutton;
     
	@FindBy(xpath="//span[@id='select2-ledger_id-container']")
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
	WebElement PaymentDate;
	
	@FindBy(xpath="//span[@title=' Select Address ']")
	WebElement SelectAddress;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SelectAddressSearchtab;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SelectAddressSearchtabindex;
	
	
	@FindBy(xpath="//select[@name='payment_type']")
	WebElement PaymentType ;
	
	
	@FindBy(xpath="//select[@id='payment_through']")
	WebElement PaymentThrough;
	
	@FindBy(xpath="//select[@name='adjustment_method']")
	WebElement AdjustmentMethod;
	
	
	@FindBy(xpath="//textarea[@name='narration']")
	WebElement Narration;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	
	
	public void clickonpaymentbuttontab()
	{
		paymentbutton.click();	
	}
	public void clickonnewbuttontab()
	{
		newbutton.click();	
	}
	public void  clickonSelectLedgertab()
	{
		SelectLedger.click();
		
	}
	public void  clickonSelectLedgersearchtab()
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
	
	public void clickonSelectLedgersearchtabindex()
	{
		SelectLedgersearchtabindex.sendKeys(Keys.ENTER);
	}
	
	public void  clickonPaymentDatetab(String dd,String mm,String  yy)
	{
		PaymentDate.sendKeys(dd);
		PaymentDate.sendKeys(mm);
		PaymentDate.sendKeys(yy);
		
	}
	public void  clickonSelectAddresstab()
	{
		SelectAddress.click();
	}
	
	public void  clickonSelectAddressSearchtab() {
		
		SelectAddressSearchtab.sendKeys("Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari");
		//Select s = new Select(SelectAddressSearchtab);
		//s.selectByValue("Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari");
	}
	public void  clickonSelectAddressSearchtabindex() {
		
		SelectAddressSearchtabindex.sendKeys(Keys.ENTER);
	}
	
	
	
	
	public void  clickonPaymentTypetab()
	{
		PaymentType.click();
		Select s = new Select(PaymentType);
		s.selectByVisibleText("Cash");
	}
	public void  clickonPaymentThroughtab()
	{
		PaymentThrough.click();
		Select s1 = new Select(PaymentThrough);
		s1.selectByVisibleText("Select Payment Through");
	}
	public void  clickonAdjustmentMethodtab()
	{
		AdjustmentMethod.click();
		Select s2 = new Select(AdjustmentMethod);
		s2.selectByVisibleText("Against Bills");
	}
	public void  clickonNarrationtab()
	{
		Narration.sendKeys("peyment done");
		
	}
	public void  clickonSubmittab()
	{
		Submit.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
