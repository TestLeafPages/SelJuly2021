package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		//step1: set the path of the properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		//step2: Create object for Properties
		Properties prop = new Properties();
		//step3: Load the properties
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8884151543");
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadId = text.replaceAll("\\D", "");
		System.out.println(leadId);
		
		//setup the file path to set the value
		FileOutputStream fos = new FileOutputStream("./src/main/resources/config.properties");
		
		//to write the value for a key
		prop.setProperty("LeadId", leadId);
		
		//to save the file
		prop.store(fos, null);
		
		
		
	


	}

}
