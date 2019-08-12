package advanced;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class JSWindowSize extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		js = (JavascriptExecutor) driver;

	}

	@Test
	public void test() {
		// Navigation
		js.executeScript("window.location='https://learn.letskodeit.com/p/practice';");

		// Size of window
		//long height = (long) js.executeScript("return window.innerHeight;");
		//long width = (long) js.executeScript("return window.innerWidth;");

		//System.out.println("Height is: " + height);
		//System.out.println("Width is: " + width);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
