package dockerManual;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

 class BaseDocker {

    public static void main(String[] args) throws MalformedURLException {
        BaseDocker baseDocker = new BaseDocker();
        baseDocker.initRemoteDriver("chrome");


    }

    public void initRemoteDriver(String browserType) throws MalformedURLException {
        URL url = null;
        DesiredCapabilities capabilities =null;

        if (browserType.equals("chrome")) {
            capabilities = DesiredCapabilities.chrome();
            url = new URL("http://localhost:4444/wd/hub");
        } else if (browserType.equals("firefox")) {
            capabilities = DesiredCapabilities.firefox();
            url = new URL("http://localhost:4445/wd/hub");
        }
        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, capabilities);
        remoteWebDriver.get("http://google.com");
        System.out.println(remoteWebDriver.getTitle());
    }

}
