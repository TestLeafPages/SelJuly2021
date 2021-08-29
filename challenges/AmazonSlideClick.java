package challenges;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSlideClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		WebElement imageEle = driver.findElement(By.xpath("//li[@class='a-carousel-card' and @aria-hidden='false']//img[@alt='Mobiles']"));

		driver.executeScript("arguments[0].click();", imageEle);
		//driver.quit();

	}

}
