package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BasicMethods {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions action;
	Properties prop;

	public BasicMethods() {
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("../PracticeSelenium/variables.properties");
			prop.load(fis);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialize() {
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../PracticeSelenium/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../PracticeSelenium/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void tearDownTest() {
		driver.quit();
		driver = null;
	}
}
