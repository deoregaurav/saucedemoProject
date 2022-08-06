package com.sauceDemo.VerifyTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.pomClasses1.HomePOMClass1;

public class TC004_VerifyMultipleproductAddtoCartFunctionality extends BaseTestClass
{
	@Test
	public void mutipleProductAddToCartFunctionality()
	{
		   
	    //homePage
	    HomePOMClass1 hp = new HomePOMClass1(driver);
	    hp.clickAllProduct();
	    
	    String actualCount = hp.getTextFromCartButton();
		String expectedCount = "6";
		
		Assert.assertEquals(actualCount, expectedCount,"Titles are not matching");
	}


}
