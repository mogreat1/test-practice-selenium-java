package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest3 extends BaseTest{

    @Test
    public void test7() throws MalformedURLException
    {

        driver.get("http://yahoo.com");
        System.out.println(driver.getTitle());

    }

    @Test
    public void test8() throws MalformedURLException
    {

        driver.get("http://yahoo.com");
        System.out.println(driver.getTitle());

    }

    @Test
    public void test9() throws MalformedURLException
    {

        driver.get("http://yahoo.com");
        System.out.println(driver.getTitle());


    }

}
