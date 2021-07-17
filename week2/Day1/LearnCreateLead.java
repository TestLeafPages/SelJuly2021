package SeleniumPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Gets the path of the driver.exe dowloaded by thw webdriver
		String property = System.getProperty("webdriver.chrome.driver", "path");
		System.out.println(property);
		
		// Launch the url in the chosen browser
		// Loads a new web page in the current browser window
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Maximise the screen
		driver.manage().window().maximize();
		
		// Locate the webeelemnt (DOM)
		// Enter the username
		WebElement webUsername = driver.findElement(By.id("username"));
		webUsername.sendKeys("demosalesmanager");
		
		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Enter the password
		WebElement webPassword = driver.findElement(By.id("password"));
		webPassword.sendKeys("crmsfa");
		
		// Click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Verification if it has landed in the correct Page
		String orgTitle = "Leaftaps - TestLeaf Automation Platform";
		// get the title of the current window
		String title = driver.getTitle();
		
		if(orgTitle.equals(title)) 	{	
			System.out.println(" Page landed up correctly");
			System.out.println("1");
		}
		else 
			System.out.println("Page Not landed up correctly ");
		
		
		// <a> + text
		// Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		// Click on the Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Enter the first name
		String nameToEnter = "sheriba";
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(nameToEnter);
		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		
		// Clear and Enter the country code
	    WebElement webCountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		// 1. clear
		// 2. sendKeys
		webCountryCode.clear();
		Thread.sleep(2000);
		webCountryCode.sendKeys("2");
	
		// Click on the CreateLead submit button
		driver.findElement(By.className("smallSubmit")).click();
		
		// View lead is the current window now
		// Get the first name and check if it is the same as the one entered previously in create lead page
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Name :" + text);
		
		if(nameToEnter.equals(text)) {
			System.out.println(" correct name");
		}

		
	}

}
