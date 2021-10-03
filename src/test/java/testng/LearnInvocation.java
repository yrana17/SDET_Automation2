package testng;

import org.testng.annotations.Test;

public class LearnInvocation {

	@Test(invocationCount = 5, timeOut = 2000)
	public void test1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Test 1......");
	}

	
	/**
	 * timeout is max no of milliseconds for each invocation of test and invocationtimeout is 
	 * max no of msec for all invocations together 
	 */
	@Test(invocationCount = 5, invocationTimeOut = 5000)
	public void test2() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Test 1......");
	}

	
	
	
	
	
}
