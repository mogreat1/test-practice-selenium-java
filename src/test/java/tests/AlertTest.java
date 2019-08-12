package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class AlertTest extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void selectCurrencyTest() {

		js.executeScript("window.scrollBy(0, 800);");
		driver.findElement(By.xpath("//*[@value='Confirmation Alert']")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);

		driver.switchTo().alert().accept();

	}

}
