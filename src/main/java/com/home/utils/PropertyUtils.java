package com.home.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.home.constants.FrameworkConstants;

public class PropertyUtils {

	private static final Properties properties = new Properties();
	private static Map<String,String> propsMap = new HashMap<String, String>();
	
	
	static 
	{
		FileInputStream fileInputStream = null;
		try {
			
			fileInputStream = new FileInputStream(FrameworkConstants.getConfigfilepath());
			properties.load(fileInputStream);			
			for(Map.Entry<Object, Object> entry: properties.entrySet())
			{
				String key = String.valueOf(entry.getKey());
				String value = String.valueOf(entry.getValue());
				propsMap.put(key, value);
			}			
			
		}  catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static String getValue(String key)
	{
		return propsMap.get(key);
	}
	
	
}

