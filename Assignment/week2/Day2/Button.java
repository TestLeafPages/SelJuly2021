package week2_Day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {

// Open Browser		
		// System.setProperty("webdriver.chrome.driver","./driver/chromedriver_86.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

// Enter the url			
		driver.get("http://www.leafground.com/pages/Button.html");

// Click button to travel home page			
		driver.findElement(By.id("home")).click();
		Thread.sleep(2000);
		
// Click Button img
		driver.findElement(By.xpath("//a[@href='pages/Button.html']")).click();

// Find position of button (x,y)			
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		int xvalue = location.getX();
		int yvalue = location.getY();
		System.out.println("x :" + xvalue + "y :" + yvalue);

// Find button color			
		String Colour = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(Colour);

// Find the height and width			
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println(size);

	}

}
