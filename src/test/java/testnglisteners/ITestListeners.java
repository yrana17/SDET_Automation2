package testnglisteners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListeners implements ITestListener,ISuiteListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test has started execution......"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is Passed:"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is Failed:"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is Skipped:"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Start Test"+context.getName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test has Finished execution......"+context.getName());
		
		
		System.out.println(context.getFailedTests());
		System.out.println(context.getSkippedTests());
		System.err.println(context.getPassedTests());
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	
	
}
