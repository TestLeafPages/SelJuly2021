package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginNegativeScenario extends BaseClass {
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test(dataProvider = "fetchData")
	public void runLoginForNegative(String username, String password) {
		
		if(username.equalsIgnoreCase("null")) {
			driver.findElement(By.id("password")).sendKeys(password);
		}
		else if(password.equalsIgnoreCase("null")) {
			driver.findElement(By.id("username")).sendKeys(username);	
		}
		else {
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			
		}
		
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		//create object for ReadExcel
		ReadExcel re = new ReadExcel();
		//String[][] data = re.readData();
		
		return re.readData("LoginNegative");
	}

}
