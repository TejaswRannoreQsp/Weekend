package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class particularwebelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		File f = driver.findElement(By.xpath("(//img[@alt='Udemy'])[1]")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("./Errorshots/image2.png"));

	}

}
