import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Alert.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// simple Alert
			driver.findElement(By.xpath("//button[text()='Alert Bo']")).click();
			Alert alert = driver.switchTo().alert();
			
			
			System.out.println("Text in the alert box:" + alert.getText() );
			// try accessing a webElement in the main window before closing the alert
			
			// clicks the OK of the simple alert
		    //driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
			alert.accept();
			
			driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
			alert.dismiss();
			
			// check if OK is pressed or CANCEL is pressed
			
			driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
			alert.sendKeys("Edu");
			Thread.sleep(3000);
			alert.accept();
			
	}

}
