package com.KalcyBook_App.pageObjects_RECEIPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RECEIPT_Delete_Page {
	
WebDriver Idriver;
	
	public RECEIPT_Delete_Page(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//div[@class='d-flex align-items-start dash'])[1]")
	WebElement Receipttab;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchtab;

	@FindBy(xpath="(//input[@type='checkbox' and @class='c_selectall'])[1]")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@type='button']")
	WebElement deletetab;
	
	
	

	public void clickonReceipttab()
	{
		Receipttab.click();	
	}
	
	public void clickonsearchtab()
	{
		searchtab.sendKeys("Suspense Account");	
	}
	
	public void clickoncheckbox()
	{
		checkbox.click();	
	}
	
	public void clickondeletetab()
	{
		deletetab.click();	
	}
}
	


