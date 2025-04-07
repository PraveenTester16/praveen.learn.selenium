package Ex9_WebTables;

import io.qameta.allure.Description;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static Ex7_WaitHelper.WaitHelpers.waitJVM;

public class LearnWebTable {

    @Description("Find A Web Table")
    @Test
    public void testSeleniumProject2() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://letcode.in/table");
        driver.manage().window().maximize();
        waitJVM(5000);

        WebElement table = driver.findElement(By.id("simpletable"));
         List<WebElement> column = table.findElements(By.tagName("th"));
         int myCol = column.size();
        System.out.println("No of column :" + myCol);

         List<WebElement> row = driver.findElements(By.tagName("tr"));
         int myRow = row.size();
        System.out.println("No of rows :" + myRow);

    }
}