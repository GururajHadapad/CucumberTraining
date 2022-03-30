package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtil {

	
	public static String getPropertyValue(String key) throws Throwable {
		
		FileInputStream	file=new FileInputStream(".\\src\\test\\resources\\commonData.properties");
		Properties	properties=new Properties();
		properties.load(file);
		return properties.getProperty(key);
	}
}
