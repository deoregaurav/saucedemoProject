package com.sauceDemo.pomClasses1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass1 
{
	private WebDriver  driver;
	private Select s;
	
	//settingButton
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingButton;
	
	public void clickOnSettingButton()
	{
		settingButton.click();
	}
	
	//logOut button
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutButton;
	
	public void clickOnLogOutButton()
	{
		logOutButton.click();
	}
	
	//bag element
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagButton;
	
	public void clickOnBagButton()
	{
		bagButton.click();
	}
	
	//add to cart button
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addToCartButton;
	
	public String getTextFromCartButton()
	{
		 String totalProducts= addToCartButton.getText();
		 return totalProducts;
	}
	
	//multiple products elements
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multiAddToCartButton;
	
	public void clickAllProduct()
	{
//		for(int i=0; i<multiAddToCartButton.size();i++)
//		{
//			multiAddToCartButton.get(i).click();
//		}
		
		for(WebElement i:multiAddToCartButton)
		{
			i.click();
		}
	}
	
	//filter dropdown
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropDownFilter;
	
	public void clickOnDropDownFilter()
	{
		dropDownFilter.click();
		s.selectByVisibleText("Price (low to high)");
		
	}
	
	
	public HomePOMClass1(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		s = new Select(dropDownFilter);
	}


}
