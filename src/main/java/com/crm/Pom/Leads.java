package com.crm.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Leads {
	 	public Leads(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	 	
	 	@FindBy(linkText = "Leads")
	 	 private WebElement leads;
	 	
	 	@FindBy(xpath = "//img[@title='Create Lead...']")
	 	private WebElement create_lead;
	 	
	 	@FindBy(xpath = "//select[@name='salutationtype']")
	 	private WebElement salute;
	 	
	 	@FindBy(xpath = "//input[@name='firstname']")
	 	private WebElement first_name;
	 	
	 	@FindBy(xpath = "//input[@name='lastname']")
	 	private WebElement last_name;
	 	
	 	@FindBy(xpath = "//input[@name='company']")
	 	private WebElement company;
	 	
	 	@FindBy(xpath = "//input[@value='T']")
	 	private WebElement group;
	 	
	 	@FindBy(xpath = "//select[@name='assigned_group_id']")
	 	private WebElement assign_grpid;
	 	
	 	@FindBy(xpath = "//input[@type='submit']")
	 	private WebElement save;
	 	
	 	public void firstName(String data)
		{
			first_name.sendKeys(data);
		}
	 	public void createLead(String name1,String name2,String company,String assign)
	 	{
	 		leads.click();
	 		create_lead.click();
	 	
			Select sel = new Select(salute);
			sel.selectByVisibleText("Ms.");
			
			firstName(name1);
	 	}
	 	
}
