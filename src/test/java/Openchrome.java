import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;


public class Openchrome {

    @Test
    public void test12() throws Exception{

        String hubURL = "http://127.0.0.1:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "/Users/ivaylo_kunev/Downloads/chtomedriver/chromedriver");
        WebDriver driver = new RemoteWebDriver(new URL(hubURL), capability);
        //WebDriver driver1 = new ChromeDriver();

    Thread.sleep(5000);
        driver.get("http://www.google.com");
       // driver.findElement(By.xpath("q")).click();
       //driver1.findElement()
        Thread.sleep(5000);


        driver.close();
    }

}