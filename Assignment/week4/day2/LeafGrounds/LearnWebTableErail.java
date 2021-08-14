package week4.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTableErail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS", Keys.TAB);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("SRC", Keys.TAB);

		// TABLE
		WebElement webTable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		// access all the rows - To find the number of rows in a table
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		System.out.println(" Nymber of row in the table: " + tableRows.size());

		// To find the number of columns in a table by choosing any row
		WebElement webElement = tableRows.get(1);
	    List<WebElement> webCol = webElement.findElements(By.tagName("td"));
	    System.out.println(" Number of columns in the table: " + webCol.size());
	    
	    // To get  the list of train names
	    // Second column in the table (all the rows -- second col )
	    
	     //  access all the rows
	    // from each row get the sec col
	    
	    // 1. strike the first row, take the second col
	    // get (0) till get(12)
	    
	    for (int i = 0; i < tableRows.size(); i++) {
	    	WebElement allRows = tableRows.get(i);  // got the specific row
	    	List<WebElement> allCols = allRows.findElements(By.tagName("td"));
	    	String allRowsSecColumn = allCols.get(1).getText();
	    	System.out.println(allRowsSecColumn);
		}
	    
	    // alternative XpathSolution
	    
	    
	    
	    
	    
	    
	    
	    
	    	    
	    
	    
		
		

	}

}
