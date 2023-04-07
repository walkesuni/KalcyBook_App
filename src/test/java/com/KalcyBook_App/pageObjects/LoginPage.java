package com.KalcyBook_App.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="user_name")
	WebElement txtUserName;
	
	@FindBy(name="user_password")
	WebElement txtPassword;

	@FindBy(xpath="(//button[@class=\"btn white btn-block\"])[1]")
	WebElement btnNext;
	
	/*@FindBy(partialLinkText="dropdown-toggle nav-link dropdown-user-link")
		WebElement button;
	
	@FindBy(xpath="//*[@id=\"navbar-mobile\"]/ul[2]/li[2]/div/a[2]")
	WebElement linkLogout;*/

	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);	
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);	
	}
	
	public void clickSubmit()
	{
		btnNext.click();	
	}
	 
	

	
		
		
	//*[@id="navbar-mobile"]/ul[2]/li[2]/div/a[2]
 /* public void  clickLogout() {
	   
	   Select s = new Select(linkLogout);
		s.selectByValue("Logout");
		
		
	   linkLogout.click();
   }
  
  public void clickLogout() {
	  
		
		Select s1 = new Select(linkLogout);
		s1.selectByValue("Logout");
	  linkLogout.click();
	  
  }*/
}
