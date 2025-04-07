package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;

public class Simple_Alert {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().window().maximize();

        WebElement acceptBtn = driver.findElement(By.id("accept"));
                acceptBtn.click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert Text is :" + text);
        alert.accept();
    }
}
