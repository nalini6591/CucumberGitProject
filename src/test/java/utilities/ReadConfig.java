package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties properties;  //declare
	
	String path="config.properties";  //store confiq.properties in path
	
	public ReadConfig() throws Exception {  //constructor
		
		properties=new Properties();	
		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
	}
	
	//user defined method
	public String getBrowser() {
		
		String value=properties.getProperty("browser");  //value = chrome..... browser is key which store chrome
		
		if(value!=null)  			//value=chrome !=null
			return value;
		else
			throw new RuntimeException("url not found in config file");
		
	}

}
