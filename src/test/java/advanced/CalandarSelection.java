package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class CalandarSelection extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		driver.get("https://www.expedia.com/");

	}

	@Test
	public void test1() {
		driver.findElement(By.xpath("//span[@class='uitk-icon uitk-icon-flights']")).click();
		driver.findElement(By.xpath("//*[@id='flight-departing-hp-flight']")).click();
		WebElement dataToSelect = driver.findElement(By.xpath("//*[@data-month='10'][@data-day='30']"));
		dataToSelect.click();
	}

	@Test
	public void test2() {
		driver.findElement(By.xpath("//span[@class='uitk-icon uitk-icon-flights']")).click();
		driver.findElement(By.xpath("//*[@id='flight-departing-hp-flight']")).click();

		WebElement calMonth = driver.findElement(By.xpath("//*[@class='datepicker-cal-month'][position()=1]"));

		List<WebElement> allValidDates = calMonth.findElements(By.tagName("a"));

		for (WebElement date : allValidDates) {
			if (date.getText().equals("30")) {

				date.click();
				break;
			}
		}

	}

	@AfterMethod
	public void tearDown() throws Exception {
		tearDownTest();
	}

}
