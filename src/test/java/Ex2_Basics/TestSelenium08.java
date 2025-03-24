package Ex2_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium08 {

    @Description("Open URL and Maximize screen")
    @Test
    public void testSelenium08() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");

        driver.manage().window().maximize();
        //Thread.sleep(5000);
        driver.manage().window().minimize();
        //Thread.sleep(3000);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


    }
}
