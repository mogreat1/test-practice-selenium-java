package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class JSClick extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void test1() {
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement checkBox = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click();", checkBox);
	}

	@Test
	public void test2() {
		driver.get("https://secure.retailmenot.com/accounts/register?returnTo=https%3A%2F%2Fwww.retailmenot.com%2F%2F");
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='subscribe']"));
		System.out.println("Displayed " + checkBox.isDisplayed());
		System.out.println("Selected " + checkBox.isSelected());

		js.executeScript("arguments[0].click();", checkBox);
		// checkBox.click();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		tearDownTest();
	}

}
