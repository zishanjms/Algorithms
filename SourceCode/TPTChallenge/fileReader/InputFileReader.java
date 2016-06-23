package fileReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class InputFileReader {

	public static void main(String[] args) {
		Properties prop = new Properties();
		InputFileReader inputFileReader = new InputFileReader();
		
		  InputStream inputStream = inputFileReader.getClass().getClassLoader().getResourceAsStream("override.properties");
	        
		  	if (inputStream == null)
	        {
	            throw new RuntimeException("Unable to find properties file");
	        }
	        try
	        {
	        	prop.load(inputStream);
	        }
	        catch (IOException e)
	        {
	            throw new RuntimeException("Unable to load properties file: " + e);
	        }
		/*Properties prop = new Properties();
		File file = new File("C:/Users/zsaiyed/Desktop/override.properties");
		FileInputStream fin;
		try {
			fin = new FileInputStream(file);
			
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Set<String> strSet = prop.stringPropertyNames();
		
		for(String s: strSet)
		{
			System.out.println("Property Name: " + s);
			System.out.println("Property Value: "+ prop.getProperty(s));
		}
		
	}

}
