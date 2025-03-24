package Ex2_Basics;

import io.qameta.allure.Description;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestSelenium11 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {


        ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
        driver1 = new EdgeDriver();
        driver1 = new SafariDriver();
        driver1 = new ChromeDriver();
    }
}