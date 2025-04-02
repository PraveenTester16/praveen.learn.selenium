package Ex3_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Link_Text {


    @Description("To locate link text")
    @Test
    public void Link_Text(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        WebElement LinkText = driver.findElement(By.linkText("Images"));
        LinkText.click();

        driver.quit();
    }
}
