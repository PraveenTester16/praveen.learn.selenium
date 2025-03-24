package Ex2_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project2 {


    @Description("To check the URL changed ")
    @Test
    public void testSeleniumProject2() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        // id="btn-make-appointment"

        WebElement appointBtn = driver.findElement(By.id("btn-make-appointment"));
        appointBtn.click();

        // id="txt-username"
        WebElement userName = driver.findElement(By.id("txt-username"));
        userName.sendKeys("John Doe");

        //id="txt-password"
        WebElement passWord = driver.findElement(By.id("txt-password"));
        passWord.sendKeys("ThisIsNotAPassword");

        // id="btn-login"
        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();

        if (driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/#appointment")) {
            System.out.println("the link is correct");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }


    }
}
