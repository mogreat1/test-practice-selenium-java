package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class RadioButtonsTest extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
	}

	@Test
	public void selectCurrencyTest() {

		List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@name='group1']"));

		int size = radioButtons.size();
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			String radioButtonValue = radioButtons.get(i).getAttribute("value");
			System.out.println(radioButtonValue);
			if (radioButtonValue.equals("Cheese")) {
				radioButtons.get(i).click();
			}

		}

	}

}
