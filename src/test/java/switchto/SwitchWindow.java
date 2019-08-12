package switchto;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class SwitchWindow extends BasicMethods {
	String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		driver.get(url);

	}

	@Test
	public void test1() throws InterruptedException {

		// Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);

		// Find Open Window button
		WebElement switchWindow = driver.findElement(By.xpath("//fieldset//button[text()='Open Window']"));
		switchWindow.click();

		// Get all handles

		Set<String> handles = driver.getWindowHandles();

		// Swithcing between handles
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				// Thread.sleep(1000);
				WebElement searchBox = driver.findElement(By.xpath("//*[@id='search-courses']"));
				searchBox.sendKeys("python");
				driver.close();
				break;

			}
		}

		// Switch back to the parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Test Successful");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
