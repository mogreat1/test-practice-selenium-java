package waittypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basics.BasicMethods;

public class WaitTypes extends BasicMethods {
	public WaitTypes(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;

		try {

			WebDriverWait wait = new WebDriverWait(driver, timeout);

			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

			System.out.println("Element appeared on the web page");

		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}

		return element;
	}

	public void clickWhenReady(By locator, int timeout) {

		try {
			WebElement element = null;

			WebDriverWait wait = new WebDriverWait(driver, timeout);

			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();

			System.out.println("Element clicked on the web page");

		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}

	}

}
