package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class SliderActions extends BasicMethods {

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		driver.get("https://jqueryui.com/slider/");
		js = (JavascriptExecutor) driver;

	}

	@Test
	public void test() throws InterruptedException {
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']//span"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 500, 0).perform();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
