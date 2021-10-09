package testnglisteners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestRetryANalyzer {

	
	@Test(retryAnalyzer = testnglisteners.LearnIRetryAnalyzer.class)
	public void test1()
	{
		Assert.assertEquals(true, false);
	}
	
	
	@Test
	public void test2()
	{
		throw new SkipException("Test not ready for execution.....");
	}
	
}
