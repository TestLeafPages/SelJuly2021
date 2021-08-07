package week5.day1;

import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	@BeforeMethod
	public void preCondition() {
		System.out.println("Common precondition");

	}

}
