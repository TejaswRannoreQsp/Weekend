package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Downloads/select.html");
		WebElement element = driver.findElement(By.id("Empire"));
		Select s=new Select(element);
		s.selectByIndex(0);
		s.selectByValue("c");
		s.selectByVisibleText("Dal");
		s.deselectByValue("d");
		System.out.println("The first selected option:"+s.getFirstSelectedOption().getText());
		List<WebElement> multiple = s.getAllSelectedOptions();
		for(WebElement multi:multiple) {
			System.out.println(multi.getText());
		}
		System.out.println("Checking is it multiple or not:"+s.isMultiple());
		s.deselectAll();

	}

}
