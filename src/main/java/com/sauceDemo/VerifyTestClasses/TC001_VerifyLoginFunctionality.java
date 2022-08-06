package com.sauceDemo.VerifyTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.UtilityClass.ScreenshotClass;

public class TC001_VerifyLoginFunctionality extends BaseTestClass
{
	@Test		
	public void loginFuntionality() throws IOException 
	{ 
		//screenshot
	    ScreenshotClass.takeScreenshot(driver);
	    
		//validation
        String expectedTitle = "Swag Labs";	   //given	
		
		String actualTitle = driver.getTitle();  //actual
		
		Assert.assertEquals(actualTitle, expectedTitle,"Titles are not matching");
	}
}
