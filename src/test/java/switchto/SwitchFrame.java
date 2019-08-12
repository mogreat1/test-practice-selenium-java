package switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class SwitchFrame extends BasicMethods {
	String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		driver.get(url);
		js = (JavascriptExecutor) driver;

	}

	@Test
	public void test1() throws InterruptedException {
		// Scroll down
		js.executeScript("window.scrollBy(0,1200);");
		// Switch to iframe
		driver.switchTo().frame(0); // or
		// driver.switchTo().frame("courses-iframe");

		WebElement searchBox = driver.findElement(By.xpath("//*[@id='search-courses']"));
		searchBox.sendKeys("python");
		Thread.sleep(2000);
		// switch back to the parent
		driver.switchTo().defaultContent();
		// scroll up
		js.executeScript("window.scrollBy(0, -1200);");

		driver.findElement(By.id("name")).sendKeys("Hi");
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
