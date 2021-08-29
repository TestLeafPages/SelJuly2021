package challenges;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		// chrome browser
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();

		// load the browser with url
		driver.get("https://www.naukri.com/");
		
		
		WebElement jobElement = driver.findElement(By.linkText("Create Job Alert"));
		

		//int y = driver.findElementByLinkText("Create Job Alert").getLocation().getY();
		
		//scroll till the given element is visible
		driver.executeScript("arguments[0].scrollIntoView();", jobElement);
		
		driver.executeScript("arguments[0].click();", jobElement);
		
		//scroll upto 1000 pixels vertically
		//driver.executeScript("scroll(0,1000); ");
		
		//Scroll upto 1000 pixels horizontally
		//driver.executeScript("scroll(1000,0)");
		
		
		//WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		
		//driver.executeScript("arguments[0].click();", loginButton);
		
		
		
		//driver.executeScript(script, args)
		
		//Way1						  //x,y
	//	driver.executeScript("scroll(0,"+y+");");

		

		// Way 2
		/*Actions builder = new Actions(driver);
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();	*/	
		
		

	}
}



