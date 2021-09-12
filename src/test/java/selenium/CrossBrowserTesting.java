package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// WebDriverManager.iedriver().setup();
		// driver= new InternetExplorerDriver();
		// WebDriverManager.edgedriver().setup();
		// driver= new EdgeDriver();
		driver.get("https://devlabs-860f0.web.app/hyperlink");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> lst = driver.findElements(By.tagName("a"));

		System.out.println(lst.size());
		for (WebElement we : lst) {

			String url = we.getAttribute("href");

			if (url.isEmpty() || url == null)
				System.out.println("Url:" + url + " is not working");
			else {
				try {

					HttpURLConnection hc = (HttpURLConnection) new URL(url).openConnection();
					hc.connect();

					int respCode = hc.getResponseCode();
					System.out.println(respCode);
					System.out.println(hc.getResponseMessage());

					if (respCode == 200)
						System.out.println("Working");
					else
						System.out.println("Not Working");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}

}
