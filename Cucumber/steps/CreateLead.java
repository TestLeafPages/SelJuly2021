package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	
	@When("Click on {string} link")
	public void clickLink(String link) {
		driver.findElementByXPath("//a[contains(text(),'"+link+"')]").click();

	}
	
	@Then("{string} Page should be displayed")
	public void verifyPageName(String pageName) {
		System.out.println(pageName);

	}
	
	
	
	
	

}
