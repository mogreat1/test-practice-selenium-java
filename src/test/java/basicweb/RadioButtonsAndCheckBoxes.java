package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class RadioButtonsAndCheckBoxes extends BasicMethods{
	private String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception  {
		
		initialize();
		driver.get("https://learn.letskodeit.com/p/practice");
	}

	@Test
	public void test() throws InterruptedException {

		boolean isChecked = false;
		List<WebElement> radioButtons = driver
				.findElements(By.xpath("//*[contains(@name, 'cars' ) and contains(@type, 'radio')]"));
		int size = radioButtons.size();

		for (int i = 0; i < size; i++) {
			isChecked = radioButtons.get(i).isSelected();

			if (!isChecked) {
				radioButtons.get(i).click();
				System.out.println(isChecked);
				Thread.sleep(2000);
			}
		}
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
