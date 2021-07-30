package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundedit {

	public static void main(String[] args) {
		
    WebDriverManager.chromedriver().setup();
    
    ChromeDriver driver= new ChromeDriver();
    
    //Load the Url
    driver.get("http://www.leafground.com/pages/Edit.html");
    
    //Maximize the webpage
    driver.manage().window().maximize();
    
    //Enter the Emailid
    driver.findElement(By.id("email")).sendKeys("sanjay.av@gmail.com");
    
    //Append the text
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sanjay");
    
    //get the text from the 3rd text field
  String Text=  driver.findElement(By.xpath("//input[@name='username']")).getText();
    
    System.out.println(Text);
    
    //clear text in the field
    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
    
    
    //verify the textfield is disabled
    
    WebElement textdisabled=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
    
     if(textdisabled.isEnabled())
     {System.out.println("The textfield is enabled. Return " +textdisabled.isEnabled());
     
     }else {
    	 System.out.println("The textfield is disabled . Return " +textdisabled.isEnabled());
	}

}}
