package Frames_Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learn_Frame {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();

        WebElement myFrame = driver.findElement(By.xpath("//iframe[@src='frameui']"));
        driver.switchTo().frame(myFrame);

        driver.findElement(By.name("fname")).sendKeys("Praveen");
        WebElement lName = driver.findElement(By.name("lname"));
                lName.sendKeys("Raghu");
                Thread.sleep(3000);

        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("email");
        driver.switchTo().parentFrame();
        lName.clear();
        driver.findElement(By.name("lname")).sendKeys("Kumar");

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//h1[@class='title has-text-centered is-pulled-left']")).getText();





    }
}
