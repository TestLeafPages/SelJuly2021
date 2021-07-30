package seleniumSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://erail.in/");

		driver.manage().window().maximize();

		driver.findElement(By.id("chkSelectDateOnly")).click();

		driver.findElement(By.id("txtStationFrom")).clear();

		driver.findElement(By.id("txtStationFrom"))
		           .sendKeys("Chennai Beach JN", Keys.ARROW_DOWN, Keys.TAB);

		driver.findElement(By.id("txtStationTo")).clear();

		driver.findElement(By.xpath("//input[@title='Enter DESTINATION station code or name']"))
				.sendKeys("Bangalore Cant", Keys.ARROW_DOWN, Keys.TAB);

		driver.findElement(By
				.xpath("//input[@title='Trains between Chennai Beach Jn and Bangalore Cant']")).getText();

		//List<WebElement> table = driver.findElements(By.xpath("//*[@id='divTrainsList']/table[1]"));

		List<WebElement> tablecol = driver
				.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//td[2]"));
		//int rowsize = tablecol.size();

		/*
		 * String clickHereTo =
		 * driver.findElement(By.xpath("//a[@title='Click here to sort on Train Name']")
		 * ).getText(); System.out.println(clickHereTo);
		 */

		for (int index = 0; index < tablecol.size(); index++) {
			String Trainlist = tablecol.get(index).getText();

			System.out.println(Trainlist);
		}
		List<WebElement> trainName = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		ArrayList<String> tname = new ArrayList<String>();
		for (WebElement we : trainName) {
			tname.add(we.getText());
		}
		Collections.sort(tname);
		System.out.println("The Sorted List");
		System.out.println(tname);

	}
}
