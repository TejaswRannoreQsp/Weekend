package Pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.meesho.com/");
//		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
//		Navigation nav = driver.navigate();
//		nav.refresh();
//		cart.click();
        WebElement sreach = driver.findElement(By.xpath("//input[contains(@placeholder,'Try Saree')]"));
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
		
		

	}

}
