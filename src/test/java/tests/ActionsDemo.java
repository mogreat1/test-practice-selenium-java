package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basics.BasicMethods;

public class ActionsDemo extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("http://www.amazon.com/");
		action = new Actions(driver);
	}

	@Test
	public void ActionsTest() {

		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hi").doubleClick().build().perform();

		action.moveToElement(move).contextClick().build().perform();
		
	}

}
