package utilities;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtils {

	public WebDriver driver;
	public WebElement wElement;
	public List<WebElement> wElements;

	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}

	public void openApplication(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void getWebElement(String locator) {
		String[] arrLocator = locator.split("=", 2);
		String locType = arrLocator[0];
		String locVal = arrLocator[1];
		if (locType.equalsIgnoreCase("xpath"))
			wElement = driver.findElement(By.xpath(locVal));

	}

	public void getWebElements(String locator) {
		String[] arrLocator = locator.split("=", 2);
		String locType = arrLocator[0];
		String locVal = arrLocator[1];
		if (locType.equalsIgnoreCase("xpath"))
			wElements = driver.findElements(By.xpath(locVal));
	}

	public int getRowCnt(String locator) {
		int rw = 0;
		try {
			locator = locator.concat("/tbody/tr");
			getWebElements(locator);
			rw = wElements.size();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rw;
	}

	public int getColCnt(String locator) {
		int col = 0;
		try {
			locator = locator.concat("/thead/tr/th");
			getWebElements(locator);
			col = wElements.size();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return col;
	}

	public List<String> getTableHeaders(String locator, int colCnt) {
		List<String> lst = new LinkedList<String>();
		for (int i = 0; i <= colCnt; i++) {
			getWebElement(locator + "/thead/tr/th[" + i + "]");
			lst.add(wElement.getText());
		}
		return lst;
	}

	public String getTableBodyData(String locator, int rwIdx, int colIdx) {
		String val = "";

		locator = locator + "/tbody/tr[" + rwIdx + "]/td[" + colIdx + "]";
		getWebElement(locator);
		if (wElement != null)
			val = wElement.getText();

		return val;

	}

	public List<HashMap<String, String>> getTableBodyData(String locator) {

		List<String> l = getTableHeaders(locator, getColCnt(locator));

		List<HashMap<String, String>> lst = new LinkedList<HashMap<String, String>>();

		for (int i = 1; i <= getRowCnt(locator); i++) {
			HashMap<String, String> hmp = new HashMap<String, String>();
			for (int j = 1; j <= getColCnt(locator); j++) {
				locator = locator + "/tbody/tr[" + i + "]/td[" + j + "]";
				getWebElement(locator);
				if (wElement != null)
					hmp.put(l.get(j - 1), wElement.getText());

			}
			lst.add(hmp);

		}
		return lst;
	}

	public static void main(String[] args) {
		String str = "Testing1234.57isfun753.inAutomation17world";
		test2(str);

	}

	
	public static void test1(String str)
	{
		int i = 0;
		int j = 0;

			for (i = 0; i < str.length(); i++) {
				if (partOf(str.charAt(i))) {
					break;
				}
			}

			for (j = i; j < str.length(); j++) {
				if (!partOf(str.charAt(j))) {
					break;
				}
			}

			System.out.println(str.substring(i, j));

	}
	
	
	public static boolean partOf(char c) {
		return ('0' <= c && c <= '9') || c == '.';
	}

	
	public static void test2(String str)
	{
		//String str = "Testing1234.57isfun753.inAutomation17world";
			for (int i = 0; i < str.length(); i++) {
				if(Character.isDigit(str.charAt(i)))
				{
					for(int j=i+1;j<str.length();j++)
					{
						if (!partOf(str.charAt(j)) )
						{
							System.out.println(str.substring(i, j));
							i=j;
							break;
						}
					}
				}
			}
	}
	
	
}
