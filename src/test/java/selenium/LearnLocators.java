package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocators {

	public static void main(String[] args) {

		WebDriver driver;

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.id("txtUsername"));
		we.sendKeys("Admin-Id");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin-Name");

		driver.findElement(By.name("txtUsername")).clear();

		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Forgot")).click();

		driver.findElement(By.cssSelector("input#txtUsername"));
		
		driver.navigate().back();

		List<WebElement> lstWe = driver.findElements(By.tagName("a"));
		System.out.println("Total Links:" + lstWe.size());

		for (WebElement webElement : lstWe) {
			System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("href"));
		}

		// driver.findElement(By.className(""));

		driver.findElement(By.xpath("//input[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin-Xpath");

	}

}
