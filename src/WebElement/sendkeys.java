package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Tejaswi");
		firstname.sendKeys(Keys.CONTROL+"a");
		firstname.sendKeys(Keys.CONTROL+"c");
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys(Keys.CONTROL+"v");
	}

}
