package interviewquestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class AutoComplete extends BasicMethods {
	String url = "https://www.expedia.com/";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();

	}

	@Test
	public void test1() throws InterruptedException {
		// get url
		driver.get(url);
		String searchingText = "(LGA) LaGuardia (10 miles away)";
		driver.findElement(By.xpath("//span[@class='uitk-icon uitk-icon-flights']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 2);

		WebElement textField = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='flight-origin-hp-flight']")));
		textField.click();
		textField.sendKeys("New York");

		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='autocomplete-dropdown']")));
		List<WebElement> results = element.findElements(By.tagName("li"));
		int size = results.size();

		for (int i = 0; i < size; i++) {
			System.out.println(results.get(i).getText());
		}

		for (WebElement result : results) {
			if (result.getText().equals(searchingText)) {
				result.click();

				System.out.println("***********************************");
				System.out.println("Aeroport " + searchingText + " is chosen");
				break;

			}
		}

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();

	}

}
