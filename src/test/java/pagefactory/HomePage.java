package pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']/b")
	WebElement adminTab;

	@FindBy(xpath = "//*[@id='menu_admin_Job']")
	WebElement adminJob;

	@FindBy(xpath = "//*[@id='menu_admin_viewPayGrades']")
	WebElement adminJobPayGrade;

	@FindBy(tagName="a")
	List<WebElement> lnk;
	
	@FindBys({@FindBy(id="txtUsername"),@FindBy(name ="txtPassword")})
	List<WebElement> bothCriteria;
	
	@FindAll({@FindBy(id="txtUsername"),@FindBy(name ="txtPassword")})
	List<WebElement> eitherCriteria;
	
	
	By directoryTab = By.xpath("//*[@id='menu_directory_viewDirectory']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void moveToAdminJobGrades() {
		Actions act = new Actions(driver);
		act.moveToElement(adminTab).moveToElement(adminJob).moveToElement(adminJobPayGrade).build().perform();
		act.click();
	}

	public void clickOnDirectoryTab() {
		driver.findElement(directoryTab).click();
	}
}
