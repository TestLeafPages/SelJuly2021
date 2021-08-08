package week5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");

	}
	
	@Test
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("Delete Lead");

	}

}
