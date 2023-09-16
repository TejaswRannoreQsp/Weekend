package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyfile {
	public static void main(String[] args) throws IOException   {
		//Path of the file
		FileInputStream fis=new FileInputStream("./TestData/Testdata.properties");
		
		//object for properties
		Properties prop=new Properties();
		
		//load or fetch values
		prop.load(fis);
		String testdata = (String) prop.get("url");
		
		WebDriver driver=new ChromeDriver();
		driver.get(testdata);
		
	}

}
