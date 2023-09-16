package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("Tejaswi");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Tejaswi@123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	}

}
