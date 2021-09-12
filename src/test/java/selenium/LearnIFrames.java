package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnIFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> el = driver.findElements(By.tagName("iframe"));
		System.out.println(el.size());

		for (int i = 0; i < el.size(); i++) {
			System.out.println(el.get(i).getAttribute("name"));
			System.out.println(el.get(i).getAttribute("id"));
		}

		String txt = driver.findElement(By.xpath("/html/body/app-root/app-frame/body/div/div/div/div/div/h1"))
				.getText();
		System.out.println(txt);

		driver.switchTo().frame("loginFrame");
		
		driver.findElement(By.id("username")).sendKeys("testUser");
		driver.findElement(By.id("password")).sendKeys("testPswd");

		driver.switchTo().parentFrame();

		txt = driver.findElement(By.xpath("/html/body/app-root/app-frame/body/div/div/div/div/div/h1")).getText();
		System.out.println(txt);
	}

}
