package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class ScopeTest extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("http://www.qaclickacademy.com/practice.php");
	}

	@Test
	public void ScopeTests() throws InterruptedException {
		// 1. Give me the count of links on the page
		// to count amount of links on the page necessary to get amount of a tags
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println(count);

		// 2. Count of links on the footer section on the page
		// to count amount of links on the footer of the page necessary to create local
		// webdriver to limit the scope
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int countOnFooter = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(countOnFooter);

		// 3. Count of links of only on column of the footer
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int x = columnDriver.findElements(By.tagName("a")).size();
		System.out.println(x);

		// 4. Click on each link in the column and check if pages are working
		for (int i = 1; i < x; i++) {

			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(2500);

		}

		// 5. Get titles of each opened link
		// what good have you done? we have some 20 links which were changing every day,
		// but still we needed to verify if they are opening and working, so I did this
		// istead of hardcoding and clicking each and every link and navigating back. And it decresed the time from 1 min to 15 seconds
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
