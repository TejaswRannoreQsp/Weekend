package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Singara seriye kannada song");
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("(//*[text()=\"JAILER - Kaavaalaa Lyric Video |
		// Superstar Rajinikanth | Sun Pictures | Anirudh | Nelson |
		// Tamannaah\"])[1]")).click();
		// driver.findElement(By.xpath("//*[text()=\"Tom & Jerry | Getting Ready for
		// Spring | Classic Cartoon Compilation | @wbkids\"]")).click();
		driver.findElement(By.xpath(
				"(//*[text()='Kantara - Singara Siriye |Vijay Prakash|Ananya Bhat |Ajaneesh Loknath |Rishab Shetty|Hombale Films'])[1]"))
				.click();
	}

}
