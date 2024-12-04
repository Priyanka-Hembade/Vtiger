package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLogout {

	public VtigerLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//td[@class='small']//td[2]/img")
	 private WebElement admin;
	
	@FindBy(linkText = "Sign Out")
	private  WebElement signout;
	
	public void signOut()
	{
		admin.click();
		signout.click();
	}

}
