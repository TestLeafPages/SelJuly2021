package SeleniumProj;

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
		// TODO Auto-generated method stub
		//String allRowsFirstCol;
//		Lunch the browser
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
//		Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		Uncheck the check box - sort on date
		WebElement checkBox = driver.findElementById("chkSelectDateOnly");
		if(checkBox.isSelected())
			checkBox.click();
		System.out.println(checkBox.isSelected());
		
		// Create an empty list
		List<String> arrListCol = new ArrayList<String>();
		
//		clear and type in the source station 
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);

//		clear and type in the destination station
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SRC",Keys.TAB);
		
//		Find all the train names using xpath and store it in a list
		//all rows first column
		// names -- multiple data 
		
		// table -> table.row--> row.coloumn

		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int size = rows.size();
		
		String text = table.findElements(By.tagName("tr")).get(0) .getText();
		
		for (int i = 0; i < size; i++) {
			String text2 = table.findElements(By.tagName("tr")).get(i).getText();
		}
			
		for (int i = 0; i < size; i++) {
			WebElement allRows = rows.get(i);
			List<WebElement> rowCol = allRows.findElements(By.tagName("td"));
			String allRowsFirstCol = rowCol.get(1).getText();
			//System.out.println(allRowsFirstCol);
			
			arrListCol.add(allRowsFirstCol);
			System.out.println(arrListCol.get(i));
		}
		
		Collections.sort(arrListCol);
		System.out.println("Sorted List");
		for(String eachCol : arrListCol)
		{
			
			System.out.println(eachCol);
		}
		
  		
//		List<WebElement> tdList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
//		System.out.println(tdList.size());
//		
//		driver.findElementByLinkText("Train Name").click();
//		Use Java Collections sort to sort it and then print it
		
	}

}
