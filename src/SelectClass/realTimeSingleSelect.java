package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class realTimeSingleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/signup");
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select s1=new Select(Day);
		Select s2=new Select(Month);
		Select s3=new Select(year);
		s1.selectByIndex(0);
		s2.selectByValue("3");
		s3.selectByVisibleText("1996");
		

	}

}
