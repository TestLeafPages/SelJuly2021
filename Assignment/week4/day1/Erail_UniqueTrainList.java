package week3_Day2.Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail_UniqueTrainList {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://erail.in/");

		driver.findElement(By.id("chkSelectDateOnly")).click();

		// Select From Station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Mgr Chennai Ctr");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER, Keys.TAB);

		// Select To Station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Delhi");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER, Keys.TAB);

		Thread.sleep(2000);

		List<WebElement> table = driver
				.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr/td[2]"));

		// Using Arraylist
		List<String> trainNames = new ArrayList<String>();

		for (int i = 0; i < table.size(); i++) {

			String eachTrainName = table.get(i).getText();

			trainNames.add(eachTrainName);

			System.out.println(eachTrainName);

		}
		System.out.println("*****************************");
		System.out.println(trainNames.size());

		// Add the list into a new Set

		Set<String> uniqueTrainNames = new LinkedHashSet<String>(trainNames);

		for (String eachTrain : trainNames) {

			uniqueTrainNames.add(eachTrain);
		}
		System.out.println(uniqueTrainNames);
	}
}
