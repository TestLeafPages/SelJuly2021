package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static ChromeDriver driver;
	
	/*
	 * @BeforeMethod public void preCondition() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * driver.get("http://leaftaps.com/opentaps/control/main"); }
	 * 
	 * 
	 * @AfterMethod public void postCondition() { driver.close();
	 * 
	 * }
	 */
}
