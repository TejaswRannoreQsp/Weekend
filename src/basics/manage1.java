package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		Dimension beforemaximising = driver.manage().window().getSize();
		System.out.println(beforemaximising.getHeight());
		System.out.println(beforemaximising.getWidth());
		
		driver.manage().window().maximize();
		
		Dimension aftermaximising = driver.manage().window().getSize();
		System.out.println(aftermaximising.getHeight());
		System.out.println(aftermaximising.getWidth());

	}

}
