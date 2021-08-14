package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElementById("src").sendKeys("C");
	Thread.sleep(2000);
	driver.findElementByXPath("//ul[@class='autoFill']/li[2]").click();

	// to disable notifications
	//ChromeOptions opt = new ChromeOptions();
	//opt.addArguments("--disable notifications--");
	//Thread.sleep(2000);

	driver.findElementById("dest").sendKeys("M");
	Thread.sleep(2000);
	driver.findElementByXPath("//li[@class='selected']").click();
	driver.findElementByXPath("//button[text()='>']").click();
	driver.findElementByXPath("//td[text()='7']").click();
	driver.findElementByXPath("//button[text()='Search Buses']").click();

	Thread.sleep(4000);   // Change 4000
	driver.findElementByXPath("//div[@class='close']").click();
	Thread.sleep(2000);

	String bus = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
	System.out.println("Total number of bus found is " + bus);
	Thread.sleep(4000);

	driver.findElementByXPath("(//label[@class='custom-checkbox'])[6]").click(); // Change Xpath
	Thread.sleep(2000);
	String sleeper = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
	Thread.sleep(2000);
	System.out.println("Total number of SleeperBus found is " + sleeper);
	Thread.sleep(2000);
	driver.findElementByXPath("//label[text()='AC']").click();
	Thread.sleep(2000);

	String ac = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
	System.out.println("Total number of Ac Bus found is " + ac);

}
}