package week5.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeafTapsTestcases extends BaseClass {
	
	@Test
	public void createLead() {
		System.out.println("CreateLead");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method for Create Lead");

	}

}
