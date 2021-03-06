package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicTags {
	@Test
	public void f() {

		System.out.println("Test Case 1..........");
	}

	@Test
	public void f1() {

		System.out.println("Test Case 2..........");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method Executed.....");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method Executed.....");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before TEst");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After TEst");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
