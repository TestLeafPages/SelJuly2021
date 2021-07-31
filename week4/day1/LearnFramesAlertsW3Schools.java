import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFramesAlertsW3Schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 1. Load https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//2. click Try it button
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//3. Enter your name in the prompt alert
		String text = "Sheriba";
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		
		//4. Click Ok in the alert
		alert.accept();
		
		//5. Verify the text below Try it button contains your name
		String text1 = driver.findElement(By.id("demo")).getText();
		System.out.println("Text : " + text1);
		if(text1.contains(text)) {
			System.out.println(" Same text");
		}
	}

}
