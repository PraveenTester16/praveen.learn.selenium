package Ex2_Basics;

import io.qameta.allure.Description;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


//        Thread.sleep(5000);
//        driver.close();

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null


        Thread.sleep(5000);

//        driver.quit();
        // It will close all the tabs. - session id == null
    }
}
