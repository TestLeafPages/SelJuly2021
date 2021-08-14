package week3_Day2.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra_JacketsAndCoats {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// open https://www.myntra.com/
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Mouse over on Women
		Actions builder = new Actions(driver);
		Action women = builder.moveToElement(driver.findElementByXPath("(//a[text()='Women'])[1]")).build();
		women.perform();

		// Click jackets & coats
		driver.findElementByLinkText("Jackets & Coats").click();
		Thread.sleep(3000);

		// Find total count of item (Top)
		String Total = driver.findElementByXPath("//span[@class='title-count']").getText();
		Total = Total.replaceAll("\\D", "");
		int Totalcount = Integer.parseInt(Total);
		System.out.println("Total count of item:" + Totalcount);

		// Validate the sum of categories count matches
		String jacketscount = driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText();
		String coatscount = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText();
		jacketscount = jacketscount.replaceAll("\\D", "");
		coatscount = coatscount.replaceAll("\\D", "");
		int jcount = Integer.parseInt(jacketscount);
		int ccount = Integer.parseInt(coatscount);
		int jacketcoats = jcount + ccount;
		System.out.println("JacketsCount + CoatsCount =" + jacketcoats);
		if (Totalcount == jacketcoats)
			System.out.println("The Sum of jackets and coats matches with the total.");
		else
			System.out.println("Count not matched.");

		// Check coats
		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();

		// Click +more options
		driver.findElementByXPath("//div[@class='brand-more']").click();

		// Type MANGO and click CHECKBOX
		driver.findElementByXPath("(//input[@class='FilterDirectory-searchInput'])[1]").sendKeys("Mango");
		driver.findElementByXPath("//label[@class=' common-customCheckbox']/div").click();

		// Close the pop-up (x)
		driver.findElementByXPath("//div[@class='FilterDirectory-titleBar']/span").click();
		Thread.sleep(5000);

		// Confirm all the coats are of brand MANGO
		List<WebElement> brandList = driver.findElementsByXPath("//h3[@class='product-brand']");

		for (WebElement eachBrand : brandList) {
			String brand = eachBrand.getText();
			System.out.println("BrandName:" + brand);
		}

		// Sort by Better Discount
		WebElement sortBy = driver.findElementByXPath("//div[@class='sort-sortBy']");
		builder.moveToElement(sortBy).build().perform();
		driver.findElementByXPath("//label[text()='Better Discount']").click();
		Thread.sleep(5000);

		// Find the price of the first Dislayed item
		List<WebElement> priceList = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
		String price = priceList.get(0).getText();
		System.out.println("price of the first displayed item:" + price);
		Thread.sleep(2000);

		// Mouse over on size of the first item
		WebElement elesize = driver.findElementByXPath("(//div[@class='product-productMetaInfo'])[1]");
		builder.moveToElement(elesize).perform();
		Thread.sleep(2000);

		// Click on WhishList Now
		driver.findElementByXPath("(//span[text()='wishlist'])[1]").click();

		// Close the Browser
		driver.close();

	}

}
