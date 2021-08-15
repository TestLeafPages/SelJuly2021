package week2.day1;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("91").setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		

	}

}
