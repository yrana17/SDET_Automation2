package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement we = driver.findElement(By.id("txtUsername"));
		we.sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin1")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		
		
		
		
		
		
	}

}
