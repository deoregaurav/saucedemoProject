package com.sauceDemo.VerifyTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.pomClasses1.HomePOMClass1;

public class TC002_VerifyLogOutFunctionality extends BaseTestClass 
{
	//before
    @Test
    public void logOutFunctionality()
    {

	//homePage
	//logOutActivity
	
	HomePOMClass1 hp = new HomePOMClass1(driver);
	hp.clickOnSettingButton();
	log.info("Click on SettingButton");
	hp.clickOnLogOutButton();
	log.info("Click on LogOutButton");
	
	System.out.println("Applying the validation");
	
	//loginpage
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle,"Titles are not matching");
    }


}
