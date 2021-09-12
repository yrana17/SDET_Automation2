package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/**
		 * Simple ALert - OK
		 */
		driver.findElement(By.id("12345rtf")).click();

		Alert al = driver.switchTo().alert();
		al.accept();

		/**
		 * COnfirm ALert
		 */
		driver.findElement(By.id("zxcvbnm")).click();
		al = driver.switchTo().alert();
		al.dismiss();

		/**
		 * Prompt to enter
		 */
		driver.findElement(By.id("aswdefr")).click();
		al = driver.switchTo().alert();
		al.sendKeys("Automate");
		al.accept();

		/**
		 * Not an Alert
		 */
		driver.findElement(By.id("zxcvbhnj")).click();
		al = driver.switchTo().alert();
		al.accept();

	}

	public boolean isALertPresent(WebDriver driver) {
		boolean bflg = true;
		try {
			driver.switchTo().alert();
		} catch (Exception e) {
			bflg = false;
		}
		return bflg;
	}

}
