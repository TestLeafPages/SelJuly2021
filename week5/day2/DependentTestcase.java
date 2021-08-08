package week5.day2;

import org.testng.annotations.Test;

public class DependentTestcase {
							//packageName.ClassName.methodName
	@Test(dependsOnMethods="week5.day2.LearnDependency.createLead")
	public void duplicateLead() {
		System.out.println("Duplicate Lead");

	}

}
