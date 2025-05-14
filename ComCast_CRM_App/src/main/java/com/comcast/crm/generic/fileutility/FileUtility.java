package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {

	public String  getDataFromPropertiesFile(String key) throws Throwable {
		
		FileInputStream fIs = new FileInputStream("C:\\Users\\T470\\eclipse-workspace\\ComCast_CRM_App\\confgAppData\\commondata.properties");
		Properties pObj = new Properties();
		pObj.load(fIs);
		String data = pObj.getProperty(key);
		return data;
		
	}

}
