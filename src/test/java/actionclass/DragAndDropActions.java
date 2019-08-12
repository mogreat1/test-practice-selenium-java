package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class DragAndDropActions extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		driver.get("https://jqueryui.com/droppable/");
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);

	}

	@Test
	public void test() throws InterruptedException {
		driver.switchTo().frame(0);
		WebElement fromElement = driver.findElement(By.id("draggable"));
		WebElement toElement = driver.findElement(By.id("droppable"));

		// Drag and drop
		// action.dragAndDrop(fromElement, toElement).build().perform();

		// Click and hold, move to element, release, build and perform
		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		Thread.sleep(2000);
	

	}

	@AfterMethod
	public void tearDown() {
		tearDownTest();
	}

}
