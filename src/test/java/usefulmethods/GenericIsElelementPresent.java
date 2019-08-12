package usefulmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class GenericIsElelementPresent extends BasicMethods {
	private String url = "https://learn.letskodeit.com/p/practice";
	private GenericMethods gm;

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		gm = new GenericMethods(driver);
	}

	@Test
	public void test() {
		driver.get(url);
		boolean result1 = gm.isElementPresent("name", "id");
		System.out.println("Element is present: " + result1);

		boolean result2 = gm.isElementPresent("name-not-present", "id");
		System.out.println("Element is present: " + result2);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		tearDownTest();
	}

}
