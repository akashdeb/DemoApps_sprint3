package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// Convert the physical representation of the property file into Java Representation
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_Jan_10AM_Batch\\demoApps\\src\\test\\resources\\testData\\commonData.properties");

		Properties prop = new Properties();
		//Reading the the key value pair
		prop.load(fis);

		//Fetching the value using the key
		String browserVar = prop.getProperty("browser");

		System.out.println(browserVar);

		String urlVar = prop.getProperty("url");

		System.out.println(urlVar);

		String emailVar = prop.getProperty("email");

		System.out.println(emailVar);

		String passwordVar = prop.getProperty("password");

		System.out.println(passwordVar);

	}

}
