package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMELogin {

	public static void main(String[] args) {

		// setting up the chromedriver
		WebDriverManager.chromedriver().setup();

		// create the instance for the driver
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://acme-test.uipath.com/login");

		// maximize the window
		driver.manage().window().maximize();

		// Enter the Emailid
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");

		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		// Click the login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Get and print the title of Homepage
		String title = driver.getTitle();
		System.out.println(title);

		// logged out of the webpage
		driver.findElement(By.linkText("Log Out")).click();

		// Close the browser
		driver.quit();

	}
}
