package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		childwindow.remove(parentwindow);
		for(String windowId:childwindow) {
			driver.switchTo().window(windowId);
			driver.findElement(By.linkText("Log in")).click();		}

	}

}
