package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnTimeOutPriority {

	@Test(priority = 2)
	public void test1() {
		System.out.println("Test 1.............");
	}

	@Test(priority = 3)
	public void atest1() {
		System.out.println("aTest 1.............");
	}

	@Test(priority = 0)
	public void ctest1() {
		System.out.println("cTest 1.............");
	
	}

	@Test(priority = 1, timeOut = 3000)
	public void btest1() {

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("bTest 1.............");
	}

	@Test(enabled = false)
	public void test4() {
		System.out.println("Test 4..........");
	}

}
