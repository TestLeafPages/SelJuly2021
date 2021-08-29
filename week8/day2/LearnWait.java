package week8.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Explicitly Wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("http://leafground.com/pages/disapper.html");
		
		WebElement eleToDisappear = driver.findElement(By.xpath("//button[@id='btn']/b"));
			
		wait.until(ExpectedConditions.invisibilityOf(eleToDisappear));
		
		String text = driver.findElement(By.tagName("strong")).getText();
		System.out.println(text);
		

	}

}
