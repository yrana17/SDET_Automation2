package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnGroups {

	@Test(groups = { "Smoke", "Sanity" })
	public void test1() {
		System.out.println("Smoke & Sanity.......");
	}

	@Test(groups = { "Functional" })
	public void test2() {
		System.out.println("Functional.......");
	}

	@Test(groups = { "Smoke", "Regression" },description = "This is to test smoke & Regression")
	public void test3() {
		System.out.println("Smoke & Regression.......");
	}

	@Test(groups = { "Functional", "UAT" })
	public void test4() {
		System.out.println("Functional & UAT.......");
	}

	@Test(groups = { "Automation" })
	public void test5() {
		System.out.println("Automation.......");
		Assert.assertEquals(true, false);
	}

	@Test(dependsOnGroups = { "Automation" })
	public void test6() {
		System.out.println("Execute only when Automation group successfully execute.......");
	}

	@Test(dependsOnMethods = { "test5" }, alwaysRun = true)
	public void test7() {
		System.out.println("Execute only when test5 method successfully execute.......");
	}

}
