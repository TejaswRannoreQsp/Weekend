package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		driver.manage().window().setSize(new Dimension(300,600));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(0,0));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(200,500));
		

	}

}
