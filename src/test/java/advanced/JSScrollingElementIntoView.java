package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class JSScrollingElementIntoView extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		js = (JavascriptExecutor) driver;

	}

	@Test
	public void test() throws InterruptedException {
		// Navigation
		js.executeScript("window.location='https://learn.letskodeit.com/p/practice';");

		// Scroll Down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);

		// Scroll Up
		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(2000);

		// Scroll Element into View
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0, -90);");
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
