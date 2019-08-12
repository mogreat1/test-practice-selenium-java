package usefulmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class GenericElementList extends BasicMethods{
	private String url = "https://learn.letskodeit.com/p/practice";
	private GenericMethods gm;

	@BeforeMethod
	public void setUp() throws Exception {
		gm = new GenericMethods(driver);
	}

	@Test
	public void test() {
		driver.get(url);
		List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");

		int size = elementList.size();
		System.out.println(size);

		List<WebElement> cars = gm.getElementList("//*[@name='cars' and @type='checkbox']", "xpath");
		for (WebElement car : cars) {
			System.out.println(car.getAttribute("id"));
		}

	}

	@AfterMethod
	public void tearDown() throws Exception {
		tearDown();
	}

}
