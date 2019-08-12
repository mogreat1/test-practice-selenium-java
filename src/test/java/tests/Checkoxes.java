package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class Checkoxes extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("https://www.spicejet.com/");
	}

	@Test
	public void departuCityTest() throws InterruptedException {
		WebElement citizenCheckbox = driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]"));
		Assert.assertFalse(citizenCheckbox.isSelected());
		citizenCheckbox.click();
		Assert.assertTrue(citizenCheckbox.isSelected());

		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkboxes.size();
		System.out.println(size);
	}

}
