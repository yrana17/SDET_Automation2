package testnglisteners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnIRetryAnalyzer implements IRetryAnalyzer {

	private int retryCnt = 0;
	private int maxRetryCnt = 2;

	public boolean retry(ITestResult result) {
		if (retryCnt <= maxRetryCnt) {
			System.out.println("Retrying " + result.getName() + " again and count is " + (retryCnt + 1));
			retryCnt++;
			return true;
		} else
			return false;
	}

}
