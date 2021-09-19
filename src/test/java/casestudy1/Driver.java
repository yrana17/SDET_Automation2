package casestudy1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		TestDataHandling obj1 = new TestDataHandling();
		TestData.hmInput = obj1.readInputs(TestData.EXCEL_INPUT_FILE, TestData.dataSheet);
		Properties p = obj1.getProperties(TestData.CONFIG_PROP_FILE);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(p.getProperty("url").toString());
		driver.manage().window().maximize();

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage= new HomePage(driver);

		loginPage.setUserName(p.getProperty("user"));
		loginPage.setPassword(p.getProperty("pswd"));
		loginPage.clickOnLoginBtn();
		homePage.moveToAdminOrganizationGeneralInfo();
		
		OrganizationPage organizationPage= new OrganizationPage(driver);
		HashMap<String, String> h= new HashMap<String, String>();
		h.put("Org Name",organizationPage.driver.findElement(organizationPage.organizatioName).getAttribute("value"));
		h.put("No Of Emp",organizationPage.driver.findElement(organizationPage.noOfEmp).getText());
		h.put("Org Email",organizationPage.driver.findElement(organizationPage.orgEmail).getAttribute("value"));
		
	
		TestData.listGeneralInfoDataUI.add(h);
		
		
		obj1.writeData(TestData.EXCEL_INPUT_FILE, "TestOutput1", TestData.listGeneralInfoDataUI);
		
		
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File Src=srcShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("Organization_GeneralInfo.png"));
		
		
		homePage.moveToAdminOrganizationLocation();

		
		
		
	}
}
