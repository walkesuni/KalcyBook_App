package com.KalcyBook_App.testCases;
//import java.io.File;
//import java.io.IOException;





import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import com.KalcyBook_App.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String  baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		logger=Logger.getLogger("KalcyBook_App");
		PropertyConfigurator.configure("log4j.properties");
		
		
		
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver=new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,800)");
		
	}
	
	
	
	@AfterClass
	public  void tearDown()
	{
		driver.quit();
	}
	
	/*public static void  captureScreenshot(WebDriver driver,String tname)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver; 
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			String path="C:\\Users\\lokes\\eclipse-workspace\\KalcyBook_App\\Screenshots"+ tname
					+".png";
			
			File des= new File(path);
			FileHandler.copy(src, des);
		} catch (IOException e) 
		{	
			e.printStackTrace();
		}
	}*/
}
