package com.KalcyBook_App.pageObjects_PAYMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
	
	

public class Payment_page {
	
	WebDriver Idriver;
	
	public Payment_page(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//i[@class='icon p-1 fa fa-money customize-icon font-large-1 fabtn'])[1]")
	WebElement paymenttab;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchtab;

	@FindBy(xpath="//input[@name='ids']")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@type='button']")
	WebElement deletetab;
	
	
	

	public void clickonpaymenttab()
	{
		paymenttab.click();	
	}
	
	public void clickonsearchtab()
	{
		searchtab.sendKeys("Firstclient");	
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
	
	

