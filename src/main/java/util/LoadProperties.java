package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {

	public static void main(String[] args) {

		        Properties properties = new Properties();

		       
		        try {
		        	 InputStream inputStream = LoadProperties.class.getClassLoader()
		                        .getResourceAsStream("test.properties");
		        	 properties.load(inputStream);

		            System.out.println("Name :- " + properties.getProperty("name"));

		            // Display all the values in the form of key value
		            for (String key : properties.stringPropertyNames()) {
		                String value = properties.getProperty(key);
		                System.out.println("Key:- " + key + "Value:- " + value);
		            }

		        } catch (IOException e) {
		            System.out.println("Exception Occurred" + e.getMessage());
		        }

	  }
}
