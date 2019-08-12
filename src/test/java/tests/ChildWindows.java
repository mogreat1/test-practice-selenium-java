package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class ChildWindows extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("http://accounts.google.com/signup");
		action = new Actions(driver);
	}

	@Test
	public void childWindowsTest() {
		driver.findElement(By.xpath("//*[contains(text(),'Pomoc')]")).click();
		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		String parentId = id.next();
		String childId = id.next();

		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());

	}

}
