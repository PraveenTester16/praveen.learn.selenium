package Ex6_Action_Pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Awesome_QA_Mini {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        userName.sendKeys("Praveen");

        WebElement password = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        password.sendKeys("Raghu");

        driver.findElement(By.xpath("//input[@id = 'sex-0']")).click();
        driver.findElement(By.xpath("//input[@id = 'exp-6']")).click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("April-1");

        //Assert.assertEquals(date.getText(),"April-1");

        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("tool-2")).click();

        WebElement continentDropdown = driver.findElement(By.id("continents"));
        Select  selectCoontinents = new Select(continentDropdown);
        selectCoontinents.selectByIndex(0);

        driver.quit();


    }

}
