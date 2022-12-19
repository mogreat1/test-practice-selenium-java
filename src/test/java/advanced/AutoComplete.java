package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class AutoComplete extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		driver.get("https://www.expedia.com/");
	}

	@Test
	public void test1() {
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

		for (WebElement webElement : results) {
			System.out.println(webElement.getText());
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
