package Ex5_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


    public class Learn_Waits {



        @Description("Learn Xpaths")
        @Test
        public void LearnXpaths(){

            WebDriver driver = new EdgeDriver();
            driver.get("https://app.vwo.com/#/login");
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());

            // Implicit Wait
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
            // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
            //driver.manage().timeouts().getPageLoadTimeout();


            WebElement userName = driver.findElement(By.xpath("//input[@ id = 'login-username']"));
            userName.sendKeys("abc@gmail.com");

            WebElement passWord = driver.findElement(By.xpath("//input[@ id = 'login-password']"));
            passWord.sendKeys("12345");

            WebElement LoginBtn = driver.findElement(By.xpath("//button[@ id = 'js-login-btn']"));
            LoginBtn.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@ id = 'js-notification-box-msg']")));

            WebElement failMsg = driver.findElement(By.xpath("//div[@ id = 'js-notification-box-msg']"));

            Assert.assertEquals(failMsg.getText(),"Your email, password, IP address or location did not match");


        }
    }


