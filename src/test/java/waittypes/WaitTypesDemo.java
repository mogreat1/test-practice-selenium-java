package waittypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class WaitTypesDemo extends BasicMethods {
	WaitTypes wt;

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		wt = new WaitTypes(driver);

	}

	@Test
	public void test() {
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.partialLinkText("Login")).click();

		WebElement emailField = wt.waitForElement(By.id("user_email"), 3);

		emailField.sendKeys("tests");

		wt.clickWhenReady(By.name("commit"), 3);

	}

	@AfterMethod
	public void tearDown() throws Exception {

		tearDownTest();
	}
}
