package docker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://test-ui-je03.simba.transactorhosting.com/");
        driver.findElement(By.id("userNameInput")).sendKeys("ogi_mosipa@islands.it");
        driver.findElement(By.id("passwordInput")).sendKeys("!1drowssaP");
        driver.findElement(By.id("submitButton")).click();

    }
}
