package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngTestcases  extends BaseClass{
  
  @Test
  public void test1() {
	  System.out.println("test1");
	  
  }
  
   
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod for test1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod for test1");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass for test1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass for test1");
  }

	/*
	 * @BeforeTest public void beforeTest() { System.out.println("beforeTest"); }
	 * 
	 * @AfterTest public void afterTest() { System.out.println("afterTest"); }
	 * 
	 * @BeforeSuite public void beforeSuite() { System.out.println("beforeSuite"); }
	 * 
	 * @AfterSuite public void afterSuite() { System.out.println("afterSuite"); }
	 */
}
