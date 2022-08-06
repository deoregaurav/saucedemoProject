package com.sauceDemo.VerifyTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.pomClasses1.HomePOMClass1;

public class TC003_VerfiyBagProductAddtoCartFunctionality extends BaseTestClass
{
	//before
	@Test
	public void bagProductAddTOCartFunctionality()
	{  
	    //homePage
	    HomePOMClass1 hp = new HomePOMClass1(driver);
	    hp.clickOnBagButton();
	    
	   String actaulCount =  hp.getTextFromCartButton();
	    
	   String expectedCount = "1";
	   
	   Assert.assertEquals(actaulCount, expectedCount,"Titles are not matching");
	}
	


}
