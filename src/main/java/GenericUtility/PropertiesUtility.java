package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	private String filePath; 
	private FileInputStream fis;
	
	public PropertiesUtility(String filePath) {
		this.filePath = filePath;
	}
	
	public String readDataFromProperty(String key)  {
		
		
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e1) {
			
		}
		Properties pobj = new Properties();
		try {
			pobj.load(fis);
		} catch (IOException e) {
			
		}
		String value = pobj.getProperty(key);
		return value;
	}
}
