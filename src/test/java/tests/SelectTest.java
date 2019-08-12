package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class SelectTest extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("https://www.spicejet.com/");
	}

	@Test
	public void selectCurrencyTest() {
		Select sel = new Select(driver.findElement(By.xpath("//*[contains(@name,'DropDownListCurrency')]")));
		sel.selectByValue("USD");
		System.out.println("USD has been selected");
	}

	@Test
	public void departuCityTest() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='IXB']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	}

	@Test
	public void selectCurrentData() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
	}

}
