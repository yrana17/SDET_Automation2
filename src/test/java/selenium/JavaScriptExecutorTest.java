package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.id("txtUsername"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Highlight Elements in Selenium
		js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", we);
		
		 driver.close();
		  
		 driver.quit();
		 
		
		
		
		
	}

}
