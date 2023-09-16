package Unit_Testing_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstProgram {
	WebDriver driver;
	@Test
	public void Swiggy() {
		 driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("swiggy page is launched");
	   driver.quit();
		
	}
	@Test
	public void Zomato() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("zomato page is launched");
		driver.quit();
		
	}

}
