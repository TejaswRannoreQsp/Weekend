package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//alert popup
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.switchTo().frame("login_page");
//		driver.findElement(By.linkText("CONTINUE")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		//confirmation popup
//		driver.get("https://licindia.in/");
//		driver.findElement(By.partialLinkText("Login")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		//prompt
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Tejaswi");
		alert.accept();
		

	}

}
