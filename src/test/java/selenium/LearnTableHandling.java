package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTableHandling {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int headerCnt = driver.findElements(By.xpath("//*[@id='table']/thead/tr/th")).size();
		System.out.println(headerCnt);

		List<WebElement> l = driver.findElements(By.xpath("//*[@id='table']/thead/tr/th"));

		for (int i = 0; i < headerCnt; i++) {
			System.out.println("Header " + i);
			System.out.println(l.get(i).getText());
		}

		int rw = driver.findElements(By.xpath("//*[@id='table']/tbody/tr")).size();
		System.out.println("Rows Count:" + rw);

		for (int i = 1; i <= rw; i++) {
			System.out.println("Row " + i + "  Data----------");
			for (int j = 1; j <= headerCnt; j++) {

				String val = driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(val);

				if (j == headerCnt) {
					System.out.println(
							driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[" + j + "]/input"))
									.isSelected());
					driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[" + j + "]/input")).click();
					System.out.println(
							driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[" + j + "]/input"))
									.isSelected());
				}

			}

		}

	}

}
