package MyCodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class nykaa {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
// 		Open https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

// 		2) Mouseover on Brands and Mouseover on Popular
		WebElement webBrands = driver.findElementByXPath("//a[text()='brands']");
		Actions builder = new Actions(driver);
		builder.moveToElement(webBrands).perform();

		WebElement webPopular = driver.findElementByXPath("//a[text()='Popular']");
		builder.moveToElement(webPopular).perform();

// 		3) Click L'Oreal Paris
		driver.findElementByXPath("(//li[@class='brand-logo menu-links' ])[5]//img").click();

//	     4) Go to the newly opened window and check the title contains L'Oreal Paris
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		driver.switchTo().window(winList.get(1));
		System.out.println(" Page Title is ;" + driver.getTitle());

//	     5) Click sort By and select customer top rated
		driver.findElementByXPath("//span[@class='pull-right']").click();
		driver.findElementByXPath("//span[text()='customer top rated']").click();

//	     6) Click Category and click Shampoo
		driver.findElementByXPath("(//div[@class='filter-sidebar__filter-title pull-left'])[1]").click();
		driver.findElementByXPath(" (//label[@for='chk_Shampoo_undefined'])[1]/span").click();

//	     7) check whether the Filter is applied with Shampoo
		String category = driver.findElementByXPath(" //ul[@class='pull-left applied-filter-lists']/li").getText();
		if (category.contains("Shampoo"))
			System.out.println("Category chosen is shampoo");

//	     8) Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElementByXPath(" //h2[contains(@title,'Paris Colour Protect Shampoo')]").click();

//	     9) GO to the new window and select size as 175ml	
		Set<String> winSet1 = driver.getWindowHandles();
		List<String> winList1 = new ArrayList<String>(winSet1);
		driver.switchTo().window(winList1.get(2));

		WebElement webDropDown = driver.findElementByXPath("//div[@class='select-style shade-select']/select");
		Select drp = new Select(webDropDown);
		drp.selectByValue("1");
		
		

//	     10) Print the MRP of the product
		String mrp = driver.findElementByXPath(" (//span[@class='post-card__content-price-offer'])[1]").getText();
		System.out.println(" MRP " + mrp);

//	     11) Click on ADD to BAG
		driver.findElementByXPath(" (//div[@class='pull-left'])[1]").click();

//	     12) Go to Shopping Bag 
		driver.findElementByXPath("//div[@class='AddToBagbox']").click();

//	     13) Print the Grand Total amount
		System.out.println(
				" Grand Total : " + driver.findElementByXPath(" //div[@class='value medium-strong']").getText());

//	     14) Click Proceed
		driver.findElementByXPath(" //div[@class='second-col']").click();

//	     15) Click on Continue as Guest
		driver.findElementByXPath("//button[@class='btn full big']").click();

//	     16) Print the warning message (delay in shipment)
		String warningMessage = driver.findElementByXPath(" //i[@class=\"warning-icon mr10\"]/following-sibling::div")
				.getText();
		System.out.println("warningMessage :" + warningMessage);

//	     17) Close all windows
		driver.quit();

	}

}
