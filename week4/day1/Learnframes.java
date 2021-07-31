import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement frame1 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();

		// Nested Frames

		WebElement frame2 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		driver.switchTo().frame(frame2);

		// into the nested frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[3]"));
		driver.switchTo().frame(frame3);
		// Nested frame
		driver.switchTo().frame("frame2");

		// driver.switchTo().parentFrame();

		// Frame1
		    // click button

		// Frame2

		// Frame
		   // Click1 button
		   // defaultContent()
		   // parentFrame()

		// Frame3
		    // frame = id frame2

	}

}
