package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class MouseHoverActions extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		driver.get("https://learn.letskodeit.com/p/practice");
		js = (JavascriptExecutor) driver;

	}

	@Test
	public void test() throws InterruptedException {
		// scroll down
		js.executeScript("window.scrollBy(0, 700);");

		// find webelement mousehover
		WebElement mainElement = driver.findElement(By.id("mousehover"));

		// initialize action
		Actions action = new Actions(driver);

		// move mouse to mousehover webelement
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);

		// find top button
		WebElement top = driver.findElement(By.xpath("//*[text()='Top']"));

		// move to top button and click it
		action.moveToElement(top).click().perform();

	}

	@AfterTest
	public void tearDown() throws Exception {
		tearDownTest();
	}

}
