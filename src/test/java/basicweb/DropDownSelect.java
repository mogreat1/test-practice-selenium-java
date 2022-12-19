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

public class DropDownSelect extends BasicMethods {
	String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		driver.get(url);
	}

	@Test
	public void test() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@id='carselect']"));
		Select sel = new Select(element);
		sel.selectByValue("benz");
		Thread.sleep(200);
		sel.selectByIndex(2);
		Thread.sleep(200);
		sel.selectByVisibleText("BMW");
		Thread.sleep(200);

		List<WebElement> cars = sel.getOptions();
		for (int i = 0; i < cars.size(); i++) {
			String car = cars.get(i).getText();
			System.out.println(car);

		}

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();

	}

}
