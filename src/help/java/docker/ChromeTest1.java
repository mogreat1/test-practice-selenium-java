package docker;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest1 extends BaseTest{

    @BeforeTest
    public void startDockerScale() throws IOException, InterruptedException
    {
        File fi =new File("output.txt");
        if(fi.delete())
        {
            System.out.println("file deleted successfully");
        }
        StartDocker s=new StartDocker();
        s.startFile();
    }

    @AfterTest
    public void stopDockerDeleteFile() throws IOException, InterruptedException
    {
        StopDocker d=new StopDocker();
        d.stopFile();

    }

    @Test
    public void test1() throws MalformedURLException
    {

        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }

    @Test
    public void test2() throws MalformedURLException
    {
        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }

    @Test
    public void test3() throws MalformedURLException
    {

        driver.get("http://google.com");
        System.out.println(driver.getTitle());


    }
}
