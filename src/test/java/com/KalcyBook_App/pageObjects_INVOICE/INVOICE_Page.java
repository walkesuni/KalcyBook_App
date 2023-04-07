package com.KalcyBook_App.pageObjects_INVOICE;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;



public class INVOICE_Page {
	
	 WebDriver Idriver;
	 
		
     public INVOICE_Page(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
     @FindBy(xpath="(//span[ @class='menu-title']) [10]")
     WebElement INVOICE;
     
     @FindBy(xpath="(//a[@data-toggle='tab'])[2]")
     WebElement Purchase_Invoice;
     
    @FindBy(xpath="(//a[@data-toggle='tab'])[1]")
     WebElement Sales_Invoice;
     
      @FindBy(xpath="(//a[@data-toggle='tab'])[4]")
     WebElement Sales_To_SEZ;
     
     @FindBy(xpath="(//a[@data-toggle='tab'])[5]")
     WebElement Export_Sales;
     
     @FindBy(xpath="(//a[@data-toggle='tab'])[6]")
     WebElement All_Invoices;
     
     @FindBy(xpath="(//a[@data-toggle='tab'])[3]")
     WebElement Regular_Sales;
     
     @FindBy(xpath="//select[@name='reg_sales_inv_length']")
     WebElement Show_Entries;
     
     @FindBy(xpath="//input[@aria-controls='reg_sales_inv']")
 	WebElement search_tab;
     
     @FindBy(xpath="(//span[@class='fa fa-edit'])[1]")
     WebElement Edit_Invoice;
      //(//button[@class='btn btn-success btn-rounded btn-sm' and @title='Edit Payment'])[2]
     @FindBy(xpath="//select[@class='form-control clientAuto clientList'][1]")
     WebElement Select_Client;
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[1]")
     WebElement Date;
     
     @FindBy(xpath="(//select[@class='form-control clientAddress'])[1]")
     WebElement Billing_Address;
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     @FindBy(xpath="//select[@class='form-control  shipingAddress']")
     WebElement Shipping_Address;
   
     @FindBy(xpath="(//select[@class='form-control autoProduct'])[1]")
     WebElement Product;
     
     @FindBy(xpath="(//input[@class='qty form-control numberinput'])[1]")
     WebElement Qty;
     
     @FindBy(xpath="(//input[@class='numberinput form-control lessdiscount'])[1]")
     WebElement Discount;
     
     @FindBy(xpath="(//button[@class='btn btn-rounded btn-outline btn-success addMoreRow'])[1]")
     WebElement Add_more_row;
     
     @FindBy(xpath="(//span[@class='fa fa-2x fa-minus-square removeItem'])[2]")
     WebElement Delete_row;
     
     @FindBy(xpath="(//textarea[@class='form-control'])[1]")
     WebElement Note_tab;
     
     @FindBy(xpath="(//input[@class='form-control'])[2]")
     WebElement Attachment_tab;
     
     
     @FindBy(xpath="(//select[@class='form-control sign'])[1]")
     WebElement Addition_Roundup_tab;
     
     @FindBy(xpath="(//input[@class='numberinput form-control roundfinalTotal'])[1]")
     WebElement Round_up_valu_tab;
     
     
     
     @FindBy(xpath="(//button[@class='btn btn-success update_btn'])[1]")
     WebElement Update_button;
     
     
     @FindBy(xpath="(//span[@class='fa fa-copy'])[1]")
     WebElement Copy_invoice;
     
     @FindBy(xpath="(//span[@class='fa fa-eye'])[1]")
     WebElement View_invoice;
    
     
     @FindBy(xpath="(//button[@class='btn btn-info dropdown-toggle'])[2]")
     WebElement Invoice_button;
     /*
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;
     
     
     @FindBy(xpath="(//input[@class='form-control datetimepicker'])[2]")
     WebElement Due_Date;*/
     
     
     
     
    // <a href="https://www.kalcybooks.com/sales"><i class="fa fa-inbox "></i><span class="menu-title" data-i18n="">&nbsp; Invoice</span> </a>
    public void click_on_Invoice()
  	{
     	 INVOICE.click();	
  	}
    
    
    public void click_on_Purchase_Invoice()
 	{
    	 Purchase_Invoice.click();	
 	}
     
    
     
     public void click_on_Sales_Invoice()
   	{
    	 Sales_Invoice.click();	
   	}
     
     public void click_on_Sales_To_SEZ()
    	{
    	 Sales_To_SEZ.click();	
    	}
     
     public void click_on_Export_Sales()
    	{
    	 Export_Sales.click();	
    	}
     
     public void click_on_All_Invoices()
    	{
    	 All_Invoices.click();	
    	}
     
     public void click_on_Regular_Sales()
 	{
    	 Regular_Sales.click();	
 	}
     
     public void click_on_Show_Entries_tab()
 	{
 		Show_Entries.click();
 		Select s1 = new Select(Show_Entries);
 		s1.selectByVisibleText("100");
 	}
     public void click_on_search_tab()
 	{
 		search_tab.sendKeys("Firstclient");	
 	}
     public void click_on_Edit_Invoice()
 	{
    	
    	
    	 Edit_Invoice.click(); 
    	 
 	}
     
     public void click_on_Select_Client_tab()
  	{
    	 Select_Client.click();
     	Select s = new Select(Select_Client);
 		s.selectByVisibleText("Firstclient ( Sundry Debtors )");	
  	}
     public void click_on_Date_tab(String dd,String mm,String  yy)
  	{
    	
    	 Date.clear();
    	 Date.sendKeys(dd);
    	 Date.sendKeys(mm);
    	 Date.sendKeys(yy);	
  	}
     public void click_on_Billing_Address_tab()
  	{
    	 Billing_Address.click();
    	 Select s = new Select(Billing_Address);
  		s.selectByVisibleText("Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari");
  	}
     public void click_on_Due_Date_tab(String dd,String mm,String  yy)
  	{
    	 Due_Date.click();
    	 Due_Date.clear();
    	 Due_Date.sendKeys(dd);
    	 Due_Date.sendKeys(mm);
    	 Due_Date.sendKeys(yy);
  	}
     public void click_on_Shipping_Address_tab()
  	{
    	 Shipping_Address.click();
    	 Select s = new Select(Shipping_Address);
   		s.selectByVisibleText("Office No-409,C-Wing, KPCT Mall, Fathima Nagar, Wanwari");
  	}
     public void click_on_Product_tab()
  	{
    	 Product.click();
    	 
    	 Select s = new Select(Product);
   		s.selectByVisibleText("New Product");	
  	}
     public void click_on_Qty_tab()
  	{
    	 Qty.clear();
    	 Qty.sendKeys("100");	
  	}
     public void click_on_Discount_tab()
  	{
    	 Discount.clear();
    	 Discount.sendKeys("10");
  	}
     public void click_on_Add_more_row_tab()
  	{
    	 Add_more_row.click();	
  	}
     public void click_on_Delete_row_tab()
  	{
    	 Delete_row.click();	
  	}
     
     public void click_on_Note_tab()
   	{
   		Note_tab.sendKeys("Payment Receipt in progress");	
   	}
     
     public void click_on_Attachment_tab()
   	{
   		Attachment_tab.sendKeys("C:\\Users\\lokes\\OneDrive\\Desktop\\bank_transaction.xlsx");	
   	}
     
     public void click_on_Addition_Roundup_tab()
   	{
   		
   		 Addition_Roundup_tab.click();
     	 Select s3 = new Select(Addition_Roundup_tab);
    		s3.selectByVisibleText("+");	
   	}
     
     public void click_on_Round_up_valu_tab()
   	{
    	
    	 
   		Round_up_valu_tab.sendKeys("10");	
   	}
     
       public void click_on_Update_button_tab()
  	{
  		Update_button.click();
  		
  	}
        
     public void click_on_Copy_invoice_icon_tab()
  	{
  		Copy_invoice.click();	
  	}
     public void click_on_View_invoice_icon_tab()
  	{
    	 View_invoice.click();
    	 
  	}
     
     /*
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
     public void click_on_search_tab()
  	{
  		search_tab.sendKeys("Firstclient");	
  	}
      */
     
}
