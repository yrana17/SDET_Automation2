package testng;

import org.testng.annotations.Test;

public class PTest1 {

	@Test(invocationCount = 5, threadPoolSize = 5)
	public void test1() throws InterruptedException {
		System.out.println("Test1 Executed" + Thread.currentThread().getId());
		Thread.sleep(2000);
		System.out.println("FInish");
	}

	@Test(dataProvider = "dp", dataProviderClass = DataProviderClassDemo.class)
	public void test1(String userId, Integer empId) {
		System.out.println(userId + "==" + empId);
	}

}
