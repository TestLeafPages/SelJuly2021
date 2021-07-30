package leafGrounds;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/home.html");
		
		/*
		 * Step-1 
		 * Go to the Home Page
		 */
		driver.findElement(By.xpath("\"(//ul[@class='wp-categories-list'])/li[3]\"")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		
		/*
		 * Step -2 
		 * Find where am supposed to go without clicking me?
		 */

		String redirect_pg = driver.findElement(By.partialLinkText("supposed to go without")).getAttribute("href");
		
		System.out.println(redirect_pg);
		
		/*
		 * Step-3 
		 * Verify am I broken?
		 */
        
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		if  (title.contains("HTTP Status 404 – Not Found"))
		{ System.err.println("Page is Error");
		}
		else {
			System.out.println("Page is Not Error");
		}

		driver.navigate().back();
		
		/*
		 * Step-4 
		 * Verifying whether both the Home page link are same
		 */
		
		String goToHomeLink1 = driver.findElement(By.xpath("//a[text()='Go to Home Page']")).getAttribute("href");
		Thread.sleep(1000);
		String goToHomeLink2 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).getAttribute("href");
		if (goToHomeLink1.equals(goToHomeLink2)) {
			driver.navigate().to(goToHomeLink1);
			System.out.println("Both the links are same and Clicked on the fiirst link");
		} else {
			System.out.println("Both the links are not same");
		}
		
		List<WebElement> TotalLinks = driver.findElementsByTagName("a");
		System.out.println(TotalLinks.size());


	}
}


