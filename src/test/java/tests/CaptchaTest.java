package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class CaptchaTest extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("http://www.lasth.com/login-2/?redirect_to=http%3A%2F%2Fwww.lasth.com%2Fjanuary-04-2018%2F");
	}

	@Test
	public void reCaptchaTest() throws InterruptedException {

		int number = findFrameNumber(driver, By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
		System.out.println("Number of a frame is: " + number);
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();

	}

	public static int findFrameNumber(WebDriver driver, By by) {
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Count of frames: " + frameCount);

		for (i = 0; i < frameCount; i++) {

			driver.switchTo().frame(i);
			System.out.println("Switched to frame number: " + i);

			int count = driver.findElements(by).size();
			System.out.println("count of elements: " + count + " on the frame number: " + i);
			if (count > 0) {

				break;

			}

		}
		System.out.println("Return the frame number: " + i);
		driver.switchTo().defaultContent();
		return i;

	}

}
