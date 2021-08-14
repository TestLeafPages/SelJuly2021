package week4_Day1.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc_Flights {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(" https://www.irctc.co.in/ ");
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		driver.findElementByXPath("//span[@class='allcircle circleone']").click();

		Set<String> wHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(wHandles);
		driver.switchTo().window(newWindow.get(1));
		String email = driver.findElementByXPath("(//div[@class='block-nav-right d-none d-md-block'])[2]").getText();
		System.out.println("Email :-" +email);

		driver.close();
		
		driver.switchTo().window(newWindow.get(0));
		
		String title = driver.getTitle();
		System.out.println("First Window :" +title);

	}

}
