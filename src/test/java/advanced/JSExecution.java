package advanced;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class JSExecution extends BasicMethods {

	String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void test() {
		// driver.get(url);
		js.executeScript("window.location='https://learn.letskodeit.com/p/practice';");

		// WebElement textBox = driver.findElement(By.id("name"));
		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
		textBox.sendKeys("test");
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

}
