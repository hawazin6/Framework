package piit.automationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("This is test before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }
@Test//4
public void test2() {
	System.out.println("This is test2 annotation");
}

  @AfterClass//
  public void afterClass() {
	  System.out.println("This is after class annotation ");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("This is bofore test annotation");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotatin");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is suite after annotation");
  }

}
