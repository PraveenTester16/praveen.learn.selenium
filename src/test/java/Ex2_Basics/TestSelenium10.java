package Ex2_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10 {

    @Description("To test CURA Health page source ")
    @Test
    public  void testSelenium10() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().minimize();

        // Requirement is go to CAUR website and find "CURA Healthcare Service" text is present or not
        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is present");
            Assert.assertTrue(true);
        }else
        {
            //Assert.assertTrue(false);
            throw new Exception("CURA Healthcare Service is not visible");
        }

        driver.quit();



    }
}
