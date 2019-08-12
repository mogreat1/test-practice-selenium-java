package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class HandlingCalenadarTest extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("https://www.path2usa.com/travel-companions/");
	}

	@Test
	public void ScopeTests() throws InterruptedException {
		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("April")) {
			driver.findElement(By.xpath("//th[@class='next']")).click();

		}

		List<WebElement> dates = driver.findElements(By.className("day"));
		System.out.println(dates.size());

		for (int i = 0; i < dates.size(); i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
	}

}
