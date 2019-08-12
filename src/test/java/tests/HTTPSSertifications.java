package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HTTPSSertifications {

	WebDriver driver;

	@BeforeTest
	public void initializeBrowser() {
		// Desired capabilites
		DesiredCapabilities ch = new DesiredCapabilities().chrome();
		ch.acceptInsecureCerts();

		// Belongs to your own browser
		System.setProperty("webdriver.chrome.driver", "../PracticeSelenium/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		driver = new ChromeDriver(c);
	}

	@Test
	public void HTTPSSertificationsTest() {

	}

}
