package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class AutoSuggestive extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		js = (JavascriptExecutor) driver;

	}

	@Test(enabled = false)
	public void departuCityTest() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		WebElement fromDropdown = driver.findElement(By.id("hp-widget__sfrom"));

		fromDropdown.clear();
		fromDropdown.sendKeys("mum");
		Thread.sleep(2000);
		fromDropdown.sendKeys(Keys.ENTER);

		WebElement toDropdown = driver.findElement(By.id("hp-widget__sTo"));

		toDropdown.sendKeys("del");
		Thread.sleep(2000);
		toDropdown.sendKeys(Keys.ARROW_DOWN);
		toDropdown.sendKeys(Keys.ENTER);

	}

	@Test(enabled = true)
	public void verifyAllDropDownValuesTest() throws InterruptedException {
		// Using JavaScript DOM we can identify element in Console of Browser
		driver.get("https://www.makemytrip.com/");
		WebElement fromDropdown = driver.findElement(By.id("hp-widget__sfrom"));

		fromDropdown.clear();
		fromDropdown.sendKeys("mum");
		fromDropdown.sendKeys(Keys.ARROW_DOWN);

		String script = "return document.getElementById(\"hp-widget__sfrom\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while (!text.equalsIgnoreCase(" Goa, India ")) {
			i++;
			fromDropdown.sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			if (i > 5) {
				System.out.println("Element not found");
				break;

			}

		}
		fromDropdown.sendKeys(Keys.ENTER);

	}
}
