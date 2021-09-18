package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDriver {

	public static void main(String[] args) {

		WebDriver driver;
		LoginPage loginPage;
		HomePage homePage;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		loginPage = new LoginPage(driver);
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickOnLoginBtn();
		//loginPage.driver.findElement(loginPage.userName).isEnabled();
		
		homePage = new HomePage(driver);
		homePage.moveToAdminJobGrades();

	}

}
