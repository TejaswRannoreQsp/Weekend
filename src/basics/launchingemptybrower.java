package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingemptybrower {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

	}

}
