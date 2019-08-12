package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class ElementNotClickableDemo extends BasicMethods {
	String url = "https://www.freecrm.com/index.html";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
		driver.get(url);

	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("testing");

		WebDriverWait wait = new WebDriverWait(driver, 3);

		boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		if (invisible) {
			WebElement loginButton = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
			loginButton.click();
		}
		Thread.sleep(2000);

	}

	// OR
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("testing");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement loginButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginButton);
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();

	}

}
