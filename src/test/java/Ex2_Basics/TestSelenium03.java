package Ex2_Basics;

import io.qameta.allure.Description;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TestSelenium03 {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() throws IOException {

        // Selenium 3
        // You need to setup the Driver(browser)
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        File firstSrc = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshots/img.png");
        FileHandler.copy(firstSrc,dest);
        driver.quit();

    }
}
