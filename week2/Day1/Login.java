package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
// Selenium Internal Architecture
// Selenium-Java code --> Rest API -->  driver(local system)
//                    -->  Browser( remote server)
//                    ( Application Program Interface)	
// Driver version and the browser version has to be the same
	
// driver version : ChromeDriver 91.0.4472.101
// Browser version : ChromeDriver 91.0.4472.101
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Manually checked the browser version
		// Downloaded the driver .exe
		// Craeted a folder and pasted the driver .exe
		// If it had matched -- successful run
		
		// Atfer 2 days, browser verion is changed
		// Does your existing ocde run?
		
		 */
		
		// Step 1: Set up the chrome driver
		WebDriverManager.chromedriver().setup();
//	String property = System.getProperty("webdriver.chrome.driver", "path");
//	System.out.println(property);
		
		// Step2: Instatntiate the ChromeDriver
		// Lauch the browser
        ChromeDriver driver =new ChromeDriver();
        
        // Step3: Load the URL in the current browser
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        // Step 4: Locate the webElement - username
        // driver.findElementById(null) - deprecated 
        
        WebElement webUserName = driver.findElement(By.id("username"));	
        // Entered the text in the web element
        webUserName.sendKeys("demosalesmanager");
        
       // WebElement webPassWord = driver.findElement(By.id("password"));
      //  webPassWord.sendKeys("crmsfa");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        
        
        
        
        
        
        
		
		
		
		
		
			
		
		
		
		
		
		
		
	}

}
