package switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class SwitchAlert extends BasicMethods {

	WebDriver driver;
	JavascriptExecutor js;
	String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		driver.get(url);
		js = (JavascriptExecutor) driver;

	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Max");
		WebElement alertButton = driver.findElement(By.id("alertbtn"));
		alertButton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

	}

	@Test
	public void test2() throws InterruptedException {
		WebElement confirmButton = driver.findElement(By.id("confirmbtn"));
		confirmButton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
