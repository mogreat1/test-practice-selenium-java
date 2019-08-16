package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    RemoteWebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap=DesiredCapabilities.chrome();
        URL url=new URL("http://localhost:4444/wd/hub");
        driver=new RemoteWebDriver(url,cap);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
