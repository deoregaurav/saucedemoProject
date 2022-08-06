package com.sauceDemo.pomClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass1 
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath ="//form//div[1]//input" )
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//form//div[2]//input")
	private WebElement passWord;
	
	public void sendPassword()
	{
		passWord.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")
	private WebElement loginButton;
	
	//normal click process-webelement method
//	public void clickOnLoginButton()
//	{
//		loginButton.click();
//	}
	
	//mouse action click method
	public void clickOnLoginButton()
	{
		act.click(loginButton).perform();
		
	}
	
	public LoginPOMClass1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}

}
