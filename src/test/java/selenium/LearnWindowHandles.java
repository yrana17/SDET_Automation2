package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {

	public static void main(String[] args) {

		WebDriver driver;

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.open('https://www.flipkart.com')");
		js.executeScript("window.open('https://www.amazon.com')");

		System.out.println(driver.getTitle());

		String currrentWindow = driver.getWindowHandle();
		System.out.println(currrentWindow);

		
		ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
			
		for(int i=0;i<win.size();i++)
		{
			driver.switchTo().window(win.get(i));
			System.out.println(driver.getTitle());
		}
			
		driver.switchTo().window(currrentWindow);
		
		
		/*
		 * Set<String> str = driver.getWindowHandles();
		 * 
		 * System.out.println(str.size());
		 * 
		 * Iterator<String> itr = str.iterator();
		 * 
		 * while (itr.hasNext()) {
		 * 
		 * String childwindow = itr.next();
		 * 
		 * if (driver.switchTo().window(childwindow).getTitle().
		 * equals("Amazon.com. Spend less. Smile more.")) {
		 * System.out.println(driver.getTitle()); driver.close(); }
		 * 
		 * }
		 */

	}

}
