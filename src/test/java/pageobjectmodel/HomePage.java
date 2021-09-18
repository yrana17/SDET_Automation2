package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	WebDriver driver;

	By adminTab = By.xpath("//*[@id='menu_admin_viewAdminModule']/b");
	By adminJob = By.xpath("//*[@id='menu_admin_Job']");
	By adminJobPayGrades = By.xpath("//*[@id='menu_admin_viewPayGrades']");

	By directoryTab = By.xpath("//*[@id='menu_directory_viewDirectory']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void moveToAdminJobGrades() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(adminTab)).moveToElement(driver.findElement(adminJob))
				.moveToElement(driver.findElement(adminJobPayGrades)).build().perform();
		act.click();
	}
	
	public void clickOnDirectoryTab()
	{
		driver.findElement(directoryTab).click();
	}

}
