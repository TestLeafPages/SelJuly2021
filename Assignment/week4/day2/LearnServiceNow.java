package SeleniumProj;

	import java.time.Duration;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LearnServiceNow {
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://dev68594.service-now.com/");
			driver.manage().window().maximize();
			driver.switchTo().frame("gsft_main");
			driver.findElementById("user_name").sendKeys("admin");
			driver.findElementById("user_password").sendKeys("India@123");
			driver.findElementById("sysverb_login").click();
			Thread.sleep(5000);
			driver.findElementById("filter").sendKeys("incident");
			Thread.sleep(5000);
			driver.findElementByXPath("(//div[text()='All '])[2]").click();
			driver.switchTo().frame("gsft_main");
			driver.findElementById("sysverb_new").click();
			driver.findElementByXPath("//span[@class='icon icon-search']").click();
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>(windowHandles);
			driver.switchTo().window(winList.get(1));
			driver.findElementByXPath("//input[@placeholder='Search']").sendKeys("ann", Keys.ENTER);
			driver.findElementByXPath("//a[@class='glide_ref_item_link']").click();
			driver.switchTo().window(winList.get(0));
			driver.switchTo().frame("gsft_main");
			driver.findElementByXPath("//span[@class='icon icon-lightbulb']").click();
			Set<String> windowHandles1 = driver.getWindowHandles();
			List<String> winList1 = new ArrayList<String>(windowHandles1);
			driver.switchTo().window(winList1.get(1));
			driver.findElementByLinkText("Issue with email").click();
			driver.switchTo().window(winList1.get(0));
			driver.switchTo().frame("gsft_main");
			String incidentnum = driver.findElementById("incident.number").getAttribute("value");
			driver.findElementById("sysverb_insert_bottom").click();
			// driver.switchTo().frame("gsft_main");
			driver.findElementByXPath("//input[@class='form-control']").sendKeys(incidentnum, Keys.ENTER);

			String text = driver.findElementByXPath("//a[@class='linked formlink']").getText();
			if (text.equals(incidentnum))

				System.out.println("Incident has been created");
			else
				System.out.println("Incident not created");
		}
	}


