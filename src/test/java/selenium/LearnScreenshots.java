package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File Src=srcShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("Table.png"));
		
		
	}
	
}
