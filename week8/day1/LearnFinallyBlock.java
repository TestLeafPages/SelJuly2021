package week8.day1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class LearnFinallyBlock {

	public static void main(String[] args) throws InterruptedException {
		int x = 10;
		int y = 0;

		int z = 0;

	//	int[] nums = { 10, 20, 30 };

		try {
			z = x / y;
			System.out.println(" code after exception");
		//	driver.findElement(By.id("username123")).sendKeys("demosalesmanager");
		} 
		catch (NoSuchElementException e) {
			System.out.println(e);
			throw new RuntimeException();
		}
		finally {
			System.out.println(" finally code");
		}

		System.out.println(z);

		System.out.println("End of program");

	}

}
