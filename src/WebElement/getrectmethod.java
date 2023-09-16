package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrectmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		Rectangle emailtextfield = email.getRect();
		Rectangle passwordtextfield = password.getRect();
		System.out.println(emailtextfield.getDimension());
		System.out.println(passwordtextfield.getDimension());
		if(emailtextfield.getX()==passwordtextfield.getX()) {
			System.out.println("x allignment are same");
		}else {
			System.out.println("not same");
		}
		WebElement login = driver.findElement(By.id("loginbutton"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		System.out.println(login.isSelected());

	}

}
