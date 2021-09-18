package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/calender");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/app-root/app-calender/body/div/div/div/div/div[2]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")).click();
		driver.findElement(By.xpath("//*[@id='mat-datepicker-0']/div/mat-year-view/table/tbody/tr[3]/td[3]")).click();
		driver.findElement(By.xpath("//*[@id='mat-datepicker-0']/div/mat-month-view/table/tbody/tr[3]/td[1]")).click();
	}
	

}
