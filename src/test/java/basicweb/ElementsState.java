package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsState {
	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void setUp() throws Exception {
		String baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void test() {

		WebElement e1 = driver.findElement(By.xpath("//*[@id='lst-ib']"));
		System.out.println(e1.isEnabled());
		System.out.println(e1.isSelected());
		System.out.println(e1.isDisplayed());
		System.out.println("********");

		WebElement e2 = driver.findElement(By.xpath("//*[@id='gs_sc0']"));
		System.out.println(e2.isEnabled());
		System.out.println(e2.isSelected());
		System.out.println(e2.isDisplayed());
		System.out.println("********");

		WebElement e3 = driver.findElement(By.xpath("//*[@id='gs_taif0']"));
		System.out.println(e3.isEnabled());
		System.out.println(e3.isSelected());
		System.out.println(e3.isDisplayed());
		System.out.println("********");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
