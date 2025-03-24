package Ex2_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class TestSelenium09 {


    @Description("Open URL and do assertion")
    @Test
    public void testSelenium09() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");

        // testNG assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.co.in/");

        // AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.co.in/");

        driver.quit();
    }
}
