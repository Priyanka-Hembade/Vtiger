package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Organization {

	 public Organization(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(linkText = "Organizations")
	private WebElement org;
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement  create_org;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement org_name;
	
	@FindBy(xpath = "//input[@name='assigntype'][1]")
	private WebElement assign_type;
	
	@FindBy(xpath = "//select[@name=\"assigned_user_id\"]")
	 private WebElement assign_user_id;
	
	@FindBy(xpath = "//input[@accesskey='S']")
	 private WebElement save;
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industry;
	
	
	
	public void organization()
	{
		org.click();
	}
	public void createOrg()
	{
		create_org.click();
	}
	public WebElement accountname()
	{
		 return org_name;
	}
	public void assigntype()
	{
		assign_type.click();
	}
	public void assignedUserId()
	{
		Select sel = new Select(assign_user_id);
		sel.selectByVisibleText("Administrator");
		
	}
	public void save()
	{
		save.click();
	}
	public void industry()
	{
		Select sel = new Select(industry);
		sel.selectByVisibleText("Banking");
	}
	
}
