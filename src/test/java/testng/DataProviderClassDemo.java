package testng;

import org.testng.annotations.DataProvider;

public class DataProviderClassDemo {

	
	@DataProvider(parallel = true)
	public static Object[][] dp() {

		return new Object[][] {

				new Object[] { "user1", 001 }, new Object[] { "user2", 002 }, new Object[] { "user3", 003 },
				new Object[] { "user4", 004 } };
	}
	
	
}
