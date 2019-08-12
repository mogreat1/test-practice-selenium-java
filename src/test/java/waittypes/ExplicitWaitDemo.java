package waittypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class ExplicitWaitDemo extends BasicMethods {
	private WebDriver driver;
	private String url = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();

	}

	@Test
	public void test() {
		driver.get(url);
		driver.findElement(By.partialLinkText("Login")).click();

		WebDriverWait wait = new WebDriverWait(driver, 3);

		WebElement emailField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user_email']")));
		emailField.sendKeys("tests");

	}

	@AfterMethod
	public void tearDown() throws Exception {

		driver.quit();
	}
}
