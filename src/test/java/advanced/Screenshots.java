package advanced;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class Screenshots extends BasicMethods {

	String url = "https://www.expedia.com/";

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
	}

	@Test
	public void test1() {
		driver.get(url);
		String searchingText = "(LGA) LaGuardia (10 miles away)";
		driver.findElement(By.xpath("//span[@class='uitk-icon uitk-icon-flights']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 2);

		// The first Aeroport
		WebElement textField = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='flight-origin-hp-flight']")));
		textField.click();
		textField.sendKeys("New York");

		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='autocomplete-dropdown']")));
		List<WebElement> results = element.findElements(By.tagName("li"));

		for (WebElement result : results) {
			if (result.getText().equals(searchingText)) {
				result.click();

				System.out.println("***********************************");
				System.out.println("The first Aeroport " + searchingText + " is chosen");
				break;

			}
		}
		// The second Aeroport

		WebElement textField2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='flight-destination-hp-flight']")));
		textField2.click();
		textField2.sendKeys("New York");

		WebElement element2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='typeaheadDataPlain']")));
		List<WebElement> results2 = element2.findElements(By.tagName("li"));

		for (WebElement result2 : results2) {
			if (result2.getText().equals(searchingText)) {
				result2.click();

				System.out.println("***********************************");
				System.out.println("The second Aeroport " + searchingText + " is chosen");
				break;

			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn-primary btn-action gcw-submit']")))
				.click();

	}

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abc";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters).charAt(index);
		}
		return sb.toString();
	}

	@AfterMethod
	public void tearDown() throws Exception {

		String fileName = getRandomString(2) + ".png";
		String directory = "D:\\eclipse-workspace\\SeleniumUdemy\\screenshots";

		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		driver.quit();
	}

}
