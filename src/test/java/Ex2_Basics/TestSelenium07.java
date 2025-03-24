package Ex2_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {

    @Description("Open the Google URL")
    @Test
    public void TestGoogle(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();

    }
}
