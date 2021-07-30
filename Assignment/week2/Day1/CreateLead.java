package seleniumSample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// Setting up the browser
		
		WebDriverManager.chromedriver().setup();
		//create the instance 
		ChromeDriver driver=new ChromeDriver();
		
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the webpage
		driver.manage().window().maximize();
		
        //Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		//click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
	
		//Click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click the lead tab
		driver.findElement(By.linkText("Leads")).click();
		//click the create lead tab
		driver.findElement(By.linkText("Create Lead")).click();

		//Fill the mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aksan");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("JR");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
	    Select src=new Select(source);
	    
	    src.selectByVisibleText("Cold Call");
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("11");
	    
	    
	    WebElement stateid = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select province =new Select(stateid);
	    province.selectByIndex(6);
	    
	   		
		//click create lead button
		
		driver.findElement(By.name("submitButton")).click();
		//Get and verify the title of the landing page
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View Lead"))
		{
			System.out.println("Lead created Sucessfully") ;
			
		}
		else
			System.out.println("Lead Creation is unsuccessful");
		}
		
		
	}


