package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jai");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("J");
		// dropdown using sendkeys
		driver.findElement(By.xpath("//select[@name='industryEnumId']")).sendKeys("Telecommunications");
		driver.findElement(By.xpath("//select[@name='dataSourceId']")).sendKeys("Other");
		// dropdown using Select Class
		
		WebElement marketId = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select marketDrp = new Select(marketId) ;
		marketDrp.selectByVisibleText("Automobile");
		
		// Click on the CreateLead Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
}
