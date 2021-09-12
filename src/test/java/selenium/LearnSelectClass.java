package selenium;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectClass {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement we = driver.findElement(By.xpath("//*[@id='Index']"));

		Select sel = new Select(we);

		// to check if select dropdown allow multiple select
		System.out.println(sel.isMultiple());

		sel.selectByIndex(1);
		sel.selectByValue("2");
		sel.selectByVisibleText("Orange");

		System.out.println(sel.getFirstSelectedOption().getText());

		we = driver.findElement(By.xpath("//*[@id='dropdownBasic1']"));
		we.click();


		List<WebElement> lst=driver.findElements(By.xpath("//*[@id='bsdd']/button"));
		System.out.println(lst.size());
		//lst.get(1).click();
		
		for (int i = 1; i <= lst.size(); i++) {
			if(lst.get(i).getText().equals("Sleep"))
			{
				lst.get(i).click();
				break;
			}
		}
		
		// to check if select dropdown allow multiple select
		System.out.println(sel.isMultiple());


}
}