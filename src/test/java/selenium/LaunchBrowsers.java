package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {

	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.close();
		
	}
	
}
