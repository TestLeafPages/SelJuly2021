package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = {"src/test/java/features"}, 
				glue = "steps", 
				monochrome = true,
				publish = true,
				//tags = "@functional" //to run only @functional scenarios
				//tags = "@functional or @smoke" // to execute all test scenarios with @functional or @smoke
				//tags = "@smoke and @regression" // to execute the scenarios with both @smoke and @regression
				//tags = "not @functional " //to execute all the scenarios except @functional
				tags = "not @functional and @regression" // to execute non functional regression test cases
				)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
