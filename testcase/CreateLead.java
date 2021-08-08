package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String company,String firstName, String lastName, String phNo) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
	
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		//create object for ReadExcel
		ReadExcel re = new ReadExcel();
		//String[][] data = re.readData();
		
		return re.readData("CreateLead");
	}
	
	
	
	
	
	
	
	
	
}
