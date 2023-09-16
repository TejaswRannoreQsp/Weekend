package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		 WebElement text = driver.findElement(By.id("username"));
		 System.out.println(text.getCssValue("border"));
		 System.out.println(text.getCssValue("color"));
		 System.out.println(text.getLocation());
		 System.out.println(text.getSize());
		 System.out.println(text.getAttribute("value"));
		
//		username.clear();
//		Thread.sleep(2000);
//		username.sendKeys("Weekend");
		System.out.println(text);
		
	}

}
