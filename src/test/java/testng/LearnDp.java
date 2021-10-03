package testng;

import org.testng.annotations.Test;

public class LearnDp {

	@Test(dataProvider = "dp",dataProviderClass = DataProviderClassDemo.class)
	public void test1(String userId, Integer empId) {
		System.out.println(userId + "==" + empId);
	}

	
}