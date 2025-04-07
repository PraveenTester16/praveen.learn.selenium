package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Confirm_Alert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().window().maximize();

        WebElement conalert = driver.findElement(By.id("confirm"));
        conalert.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.dismiss();
    }
}
