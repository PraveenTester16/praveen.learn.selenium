package Ex2_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium12 {

    @Description("Navigation methods")
    @Test
    public void testSelenium12(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");

        driver.navigate().to("https://www.bing.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();

    }
}
