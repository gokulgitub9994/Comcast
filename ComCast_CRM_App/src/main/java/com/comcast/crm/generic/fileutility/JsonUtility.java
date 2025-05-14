package com.comcast.crm.generic.fileutility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
	
	public String getDataFromJsonFile(String key) throws IOException, ParseException {
		
		FileReader file = new FileReader("C:\\\\Users\\\\T470\\\\eclipse-workspace\\\\ComCast_CRM_App\\\\confgAppData\\\\commondata.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(file);
		JSONObject map = (JSONObject)obj;
		
		String data = map.get(key).toString();
		return data;
	}
}
