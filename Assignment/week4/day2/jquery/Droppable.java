package jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
		  
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://jqueryui.com/selectable/"); 
		  Actions actions =new Actions(driver);
		  
		  driver.switchTo().frame(0);
		  WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		  WebElement item2 = driver.findElement (By.xpath("//li[text()='Item 2']"));
		  WebElement item3 = driver.findElement (By.xpath("//li[text()='Item 3']"));
		  WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		  WebElement item5=driver.findElement(By.xpath("//li[text()='Item 5']"));
		  WebElement item7= driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		  actions.clickAndHold(item1).moveToElement(item5).release().perform();
		  actions.keyDown(Keys.CONTROL).click(item5).clickAndHold(item7).perform();
		 
       	}

}
