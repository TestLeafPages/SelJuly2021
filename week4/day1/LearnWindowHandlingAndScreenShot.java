import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandlingAndScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("home")).click();
		System.out.println(driver.getTitle()); // control is still in the main window

		// How do I get into the new window
		// Step1 : Get all the window handles in a set
		Set<String> windowHandlesSet = driver.getWindowHandles();

		System.out.println(windowHandlesSet.size());
		for (String eachString : windowHandlesSet) {
			System.out.println(eachString);
		}
		// Window handles
		// CDwindow-84C47441F2E5DA46286766F1DA23884B win1
		// CDwindow-C5E440DB7614FB5C3E27643E2792CE01 win2
		
		
		// Step 2: Move the Set of window handles into a list so that each of the window handle
		//         can be accessed using the index value which is not possible with the set
		List<String> winList = new ArrayList<String>(windowHandlesSet);
		// winList.get(1); // window handle of the second window

		// Step 3:
        // Switch the control to the specific window by selecting the required window handle
		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);

		driver.switchTo().window(winList.get(0));
		driver.findElement(By.id("home")).click();

		// Take the screenshot of the current page
		File src1 = driver.getScreenshotAs(OutputType.FILE); // the page that has to be taken screen shot
		File dst = new File("./snaps/seat.png");
		FileUtils.copyFile(src1, dst);
		
		// driver.close(); // closes the current active window
		// driver.quit();  // closes all the windows in the list
	}
}
