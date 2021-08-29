package challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractUsingJS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//to minimize the window
	//	driver.manage().window().minimize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//code to type or set value
		//driver.executeScript("document.getElementById('username').value='demosalesmanager';");
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	//	driver.executeScript("document.getElementById('username').value='Demosalesmanager';");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		
		//WebElement eleLeads = driver.findElementByXPath("//span[text()='Leads']");
		//to click
		driver.executeScript("arguments[0].click();", login);

	}

}
