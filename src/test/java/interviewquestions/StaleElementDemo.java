package interviewquestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class StaleElementDemo extends BasicMethods {
	String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		driver.get(url);

	}

	@Test
	public void test1() throws InterruptedException {
		WebElement checkboxElement = driver.findElement(By.id("bmwcheck"));
		driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());

		// Not find elements in advance, but when you just need them
		 checkboxElement = driver.findElement(By.id("bmwcheck"));
		checkboxElement.click();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		// driver.quit();

	}

}
