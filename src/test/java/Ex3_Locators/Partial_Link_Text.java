package Ex3_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Partial_Link_Text {



    @Description("To locate Partial Link")
    @Test
    public void Learn_Partial_LinkText(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

        WebElement imageLink = driver.findElement(By.partialLinkText("Imag"));
imageLink.click();

driver.quit();
    }
}
