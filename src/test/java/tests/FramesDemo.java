package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class FramesDemo extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("https://jqueryui.com/droppable/");
		action = new Actions(driver);
	}

	@Test
	public void FramesTest() {

		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, target).build().perform();

		driver.switchTo().defaultContent();
	}

}
