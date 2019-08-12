package usefulmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class GetTextDemo extends BasicMethods {
	String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
	}

	@Test
	public void test1() {
		driver.get(url);
		WebElement buttonElement = driver.findElement(By.xpath("//*[@id='opentab']"));
		String elementText = buttonElement.getText();
		System.out.println(elementText);

	}

	@Test
	public void test2() {
		driver.get(url);
		WebElement buttonElement = driver.findElement(By.xpath("//*[@id='name']"));
		String elementText = buttonElement.getAttribute("class");
		System.out.println(elementText);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
