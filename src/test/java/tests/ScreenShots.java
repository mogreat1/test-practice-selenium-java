package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class ScreenShots extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("http://google.com");

	}

	@Test
	public void verifyAllDropDownValuesTest() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("D://screenshot.png"));

	}
}
