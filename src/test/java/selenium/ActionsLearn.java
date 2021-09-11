package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * WebElement we = driver.findElement(By.id("txtUsername"));
		 * we.sendKeys("Admin");
		 * 
		 * driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.id("btnLogin")).click();
		 */

		Actions act = new Actions(driver);

		/*
		 * act.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id='menu_admin_viewAdminModule']/b")))
		 * .moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_Job']")))
		 * .moveToElement(driver.findElement(By.xpath(
		 * "//*[@id='menu_admin_viewPayGrades']"))).build().perform();
		 * 
		 * act.click().perform();
		 */

		driver.findElement(By.xpath("/html/body/app-root/app-home/div/div[4]/mat-card[3]/div/i")).click();

		act.moveToElement(driver.findElement(By.xpath("//*[@id='w3e4']"))).build().perform();

		//act.doubleClick();

		
		driver.get("https://devlabs-860f0.web.app/aui");
		act.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']/p")),
				driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
		;

		driver.get("https://devlabs-860f0.web.app/contextmenu");
		WebElement w =driver.findElement(By.xpath("/html/body/app-root/app-context-menu/div/div/div/div/div/button/mat-list/mat-list-item/div"));
		
		act.contextClick(w).perform();
		
		driver.findElement(By.xpath("//*[@id='mat-menu-panel-0']/div/div/button")).click();
		
		
	}

}
