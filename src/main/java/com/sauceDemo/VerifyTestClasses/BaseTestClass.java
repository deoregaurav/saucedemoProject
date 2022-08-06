package com.sauceDemo.VerifyTestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.UtilityClass.ScreenshotClass;
import com.sauceDemo.pomClasses1.LoginPOMClass1;

public class BaseTestClass 
{
	   WebDriver driver;
	   
	      Logger log;
	    @Parameters("browser")
		@BeforeMethod
		public void setUP(String browser) throws IOException 
		{

			if(browser.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver" ,
					"./DriverFolder/chromedriver.exe"); 
			driver = new ChromeDriver();
			 
			 
			}
			
			else if(browser.equals("Firefox"))
			{
			System.setProperty("webdriver.gecko.driver" ,
					"./DriverFolder/geckodriver.exe");		
			driver =new FirefoxDriver();	
		    }
			else
			{
				System.out.println("throw the error");
			}
			
			Logger log = Logger.getLogger("MPP");

			PropertyConfigurator.configure("log4j.properties");

			
			log.info("Browser is opened");
		
			driver.manage().window().maximize();
			log.info("Browser is maximized");
			
			
			driver.get("https://www.saucedemo.com/");
			
			log.info("URL is opened");
			//screenshot
			ScreenshotClass.takeScreenshot(driver);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//login
			LoginPOMClass1 lp = new LoginPOMClass1(driver);
		    lp.sendUsername();
		    lp.sendPassword();
		    lp.clickOnLoginButton();
		}
		
	
		@AfterMethod
		public void tearDown()
		{
			//logOut
			
			driver.quit();
			System.out.println("browser is closed");
		}


}
