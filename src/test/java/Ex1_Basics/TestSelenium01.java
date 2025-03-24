package Ex1_Basics;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium01 {

    @Test
    public void test_VerifyVWOLogin() {
        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}
