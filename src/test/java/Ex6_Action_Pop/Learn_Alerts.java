package Ex6_Action_Pop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learn_Alerts {

    public static void main(String[] args) {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement jspromptBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jspromptBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
