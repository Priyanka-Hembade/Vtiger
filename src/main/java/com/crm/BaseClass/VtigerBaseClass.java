package com.crm.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.FileUtility.ReadProperties;
import com.crm.Pom.VtigerLogin;
import com.crm.Pom.VtigerLogout;



public class VtigerBaseClass {

	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("From beforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("from beforetest");
	}
	
	@BeforeClass
	public void precondition() throws IOException
	{
		String browser = ReadProperties.property("browser");
		String url = ReadProperties.property("url");
		String user = ReadProperties.property("user");
		String password = ReadProperties.property("password");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver  = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else {
			  driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
//		FileInputStream fis = new FileInputStream("D:\\Selenium\\Vtigerlogin.xlsx");
//		  Workbook wb = WorkbookFactory.create(fis);
//		  Sheet sheet = wb.getSheet("Sheet1");
//		  String user = sheet.getRow(0).getCell(0).toString();
//		  String password = sheet.getRow(0).getCell(1).toString();
//		  driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("user");
//		  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
//		  driver.findElement(By.id("submitButton")).click();
		VtigerLogin vt= new VtigerLogin(driver);
		vt.signIn("admin" , "root");
		
	}
	@AfterMethod
	public void logout()
	{
//		Actions act = new Actions(driver);
//		WebElement admin = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
//		act.moveToElement(admin).perform();
//		driver.findElement(By.linkText("Sign Out")).click();
		
		VtigerLogout vt= new VtigerLogout(driver);
		vt.signOut();
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("from aftertest");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("From afterSuite");
	}
}
