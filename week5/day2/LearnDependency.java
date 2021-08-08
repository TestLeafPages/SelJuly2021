package week5.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnDependency {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();

	}
	
	@Test//(dependsOnMethods="createLead")
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test//(dependsOnMethods= {"createLead","editLead"})
	public void deleteLead() {
		System.out.println("Delete Lead");

	}

}
