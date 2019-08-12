package keypressevents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class KeyPressDemo extends BasicMethods {
	String url1 = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
	String url2 = "https://learn.letskodeit.com/p/practice";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();

	}

	@Test
	public void test1() throws InterruptedException {
		driver.get(url1);

		driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);

		Thread.sleep(2000);
		driver.findElement(By.id("user_password")).sendKeys("1111");

		Thread.sleep(2000);
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);

	}

	@Test
	public void test2() throws InterruptedException {
		driver.get(url2);
		// driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
		// driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL,
		// "a"));

		String selecyAll = Keys.chord(Keys.CONTROL, "a");
		
		driver.findElement(By.id("openwindow")).sendKeys(selecyAll);
		Thread.sleep(2000);

	}

	@Test
	public void test3() throws InterruptedException {
		driver.get(url2);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();

	}

}
