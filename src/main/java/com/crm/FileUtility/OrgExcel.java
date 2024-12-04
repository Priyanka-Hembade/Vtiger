package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.BaseClass.VtigerBaseClass;

public class OrgExcel extends VtigerBaseClass {

	public static String org_name;
	public static String factoryexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Vtigerlogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		org_name =sheet.getRow(1).getCell(1).toString();
		return org_name;
	}
}
