package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class NoSuchElementDemo extends BasicMethods {
	String url = "https://learn.letskodeit.com/";

	@BeforeMethod

	public void setUp() throws Exception {

		initialize();
		driver.get(url);

	}

	// They may ask you "What are different types of exception?
	// What is No Such Element Exception? How to handle it?

	@Test
	public void test1() throws InterruptedException {

		// 1. Timing Issues - using Implicit or Explicit Wait
		driver.findElement(By.partialLinkText("Login")).click();

		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		emailField.sendKeys("testing");
		Thread.sleep(2000);

		// 2. Incorrect locator or type of locator

		// 3. Element is in iFrame
		driver.get("http://learn.letskodeit.com/p/practice");
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.id("search-courses")).sendKeys("Java");
		driver.switchTo().defaultContent();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();

	}

}
