package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Prompt_Alert {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().window().maximize();

        WebElement promtAlert = driver.findElement(By.id("prompt"));
        promtAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Praveen");
        alert.accept();
        String promTest = driver.findElement(By.id("myName")).getText();
        System.out.println(promTest);
    }
}
