package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class ElementDisplayed extends BasicMethods {
	String url1 = "https://learn.letskodeit.com/p/practice";
	String url2 = "https://www.expedia.ie/";

	@BeforeMethod
	public void setUp() throws Exception {

		initialize();
	}

	@Test
	public void testLetsKodeIt() {
		driver.get(url1);
		WebElement textBox = driver.findElement(By.xpath("//*[@id='displayed-text']"));
		System.out.println("Text Displayed: " + textBox.isDisplayed());

		driver.findElement(By.id("hide-textbox")).click();
		System.out.println("Clicked on the Hide button");
		System.out.println("Text Displayed: " + textBox.isDisplayed());

		driver.findElement(By.id("show-textbox")).click();
		System.out.println("Clicked on the Show button");
		System.out.println("Text Displayed: " + textBox.isDisplayed());
	}

	@Test
	public void testExpedia() {
		driver.get(url2);

		WebElement ageDropdown = driver.findElement(By.id("package-1-age-select-1-hp-package"));
		System.out.println("Child Dropdown displayed: " + ageDropdown.isDisplayed());
		WebElement childDropdown = driver.findElement(By.id("package-1-children-hp-package"));
		Select sel = new Select(childDropdown);
		sel.selectByValue("1");
		System.out.println("Child Dropdown displayed: " + ageDropdown.isDisplayed());

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
