package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions {

	@Test
	public void test1() {
		// Hard Assertions
		System.out.println("############");
		Assert.assertNotEquals(true, false);
		System.out.println("..............");
		Assert.assertEquals(true, false);

		System.out.println("Test 1.............");
	}

	@Test
	public void test2() {
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(true, false);
		System.out.println("Test 2..................");
		obj.assertEquals(true, true);
		obj.assertAll();
	}

	@Test
	public void test3() {
		System.out.println("Test 3............");
	}
}
