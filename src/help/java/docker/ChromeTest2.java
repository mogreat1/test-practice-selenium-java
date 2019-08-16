package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest2 extends BaseTest{

    @Test
    public void test4() throws MalformedURLException
    {

        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());

    }

    @Test
    public void test5() throws MalformedURLException
    {

        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());

    }

    @Test
    public void test6() throws MalformedURLException
    {

        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());

    }

}
