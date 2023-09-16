package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpop_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.freshersworld.com/user/register");
		driver.findElement(By.id("file-upload")).sendKeys("‪C:\\Users\\LENOVO\\OneDrive\\Documents\\Tejaswi(Experienced).pdf");

	}

}
