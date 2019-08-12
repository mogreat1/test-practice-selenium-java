package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class NavigatingBetweenPages extends BasicMethods {
	public String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		baseUrl = "https://learn.letskodeit.com/";

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);

		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.navigate().back();

		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.navigate().forward();

		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.navigate().refresh();
		System.out.println("Refreshed");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
