package usefulmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class GenericMethodsDemo extends BasicMethods {
	private String url = "https://learn.letskodeit.com/p/practice";
	private GenericMethods gm;

	@BeforeMethod
	public void setUp() throws Exception {
		initialize();
		gm = new GenericMethods(driver);
	}

	@Test
	public void test() {
		driver.get(url);
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("test");

		WebElement element2 = gm.getElement("//*[@value='Alert']", "xpath");
		System.out.println(element2.getTagName());

	}

	@AfterMethod
	public void tearDown() throws Exception {
		tearDownTest();
	}

}
