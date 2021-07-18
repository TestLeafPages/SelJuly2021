package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		// Locate the web element first
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		// Associate the select class to the dropdown element
		Select drp1 = new Select(dd1);
		//Select the option based on index
		drp1.selectByIndex(2);
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select drp2 = new Select(dd2);
		//Select the option based on visible text in the DOM
		drp1.selectByVisibleText("Appium");
		
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select drp3 = new Select(dd3);
		//Select the option based on value
		drp3.selectByValue("3");
		
		// Get the options size
		WebElement dd4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select drp4 = new Select(dd4);
		System.out.println("Options size is:" + drp4.getOptions().size());
		
		
		
		
		//	
	}

}
