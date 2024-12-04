package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static String property(String key) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\qspiders\\com.crm.vtigerE4\\src\\test\\resources\\vtigerProperty");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}

}
