package week7.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGAssertion {
	
	@Test
	public void login() {
		//String expTitle = "Leaftaps - TestLeaf Automation Platform";
		String expTitle = "TestLeaf Automation Platform";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		String actTitle = driver.getTitle();
		
		//Create object for SoftAssert
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actTitle, expTitle); //not matching
		
		//softAssert.assertFalse(displayed); //true
		
		
		//Hard Assert
		//Assert.assertEquals(actTitle, expTitle);
		//Assert.assertTrue(displayed);
		//Assert.assertFalse(displayed);
		
		System.out.println("End of program");
		
		//to consolidate the assertions - Mandatory
		softAssert.assertAll();
		
		
		/*
		 * if(actTitle.equals(expTitle)) { System.out.println("Matching"); } else {
		 * System.out.println("Not Matching"); }
		 */
		
		
		
		
		
		
		
		
		

	}

}
