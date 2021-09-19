package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static void main(String[] args) {

		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentTest.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("SDET Extent Report");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);

		ExtentTest test = extent.createTest("Validate Test Login Functionality");
		test.assignAuthor("yrana");
		test.assignCategory("smoke");
		test.info("Launch Url");
		test.info("Enter Credentials");
		test.pass("Successfully Logged into Application");

		test = extent.createTest("Validate Test Registration Functionality");
		test.assignAuthor("yrana");
		test.assignCategory("Regression");
		test.info("Launch Url");
		test.info("Click on Registration Link");
		test.pass("Enter details successfully");
		test.fail("I have not received email");
		test.log(Status.PASS, "Testing SnapShot", MediaEntityBuilder.createScreenCaptureFromPath("Frames.PNG").build());

		test = extent.createTest("Test for Nodes");
		ExtentTest nodes = test.createNode("Node1");
		nodes.pass("ABCCCCCCCCCCCCCCCCCC");
		nodes.pass("asdfg");

		nodes = test.createNode("Node2");
		nodes.pass("STep....................1");
		nodes.pass("Step..................2");

		extent.flush();

	}

}
