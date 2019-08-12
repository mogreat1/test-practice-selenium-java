package basicweb;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class MultipleSelect extends BasicMethods {
	private String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		driver.get(url);

	}

	@Test
	public void test() throws InterruptedException {
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		sel.selectByValue("orange");

		Thread.sleep(1000);
		sel.selectByIndex(2);

		Thread.sleep(1000);
		sel.selectByVisibleText("Apple");

		List<WebElement> fruits = sel.getAllSelectedOptions();

		for (WebElement fruit : fruits) {
			System.out.println(fruit.getText());
		}

		Thread.sleep(1000);
		sel.deselectByValue("orange");

		Thread.sleep(1000);
		sel.deselectByIndex(2);

		Thread.sleep(1000);
		sel.deselectByVisibleText("Apple");

		List<WebElement> fruitsAfter = sel.getAllSelectedOptions();

		for (WebElement fruit : fruitsAfter) {
			System.out.println(fruit.getText());
		}

	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

}
