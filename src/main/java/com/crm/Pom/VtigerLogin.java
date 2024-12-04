package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLogin {

	 public VtigerLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='user_name']")
	 private WebElement user;
	
	@FindBy(xpath = "//input[@name='user_password']")
	 private WebElement password;
	
	
	@FindBy(id = "submitButton")
	 private WebElement submit_button;
	

	public void signIn(String email , String pass)
	{
		user.sendKeys(email);
		password.sendKeys(pass);
		submit_button.click();
	}
}
// home page seperate pom
//pom organization,contact,and all like that