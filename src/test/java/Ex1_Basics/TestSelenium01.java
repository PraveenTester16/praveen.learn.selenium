package Ex1_Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestSelenium01 {

    @Test
    public void test_VerifyVWOLogin() throws IOException {
        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        File sourceImg = driver.getScreenshotAs(OutputType.FILE);
        File destinationImg = new File("./Screenshots/Img2.png");
        try {
            FileHandler.copy(sourceImg,destinationImg);
        } catch (IOException e) {
            throw new RuntimeException("Image copy failed! Reason: " + e.getMessage(),e);
        }

        WebElement vwoImg = driver.findElement(By.xpath("//img[@data-qa='cemaxumuwu']"));
        File vwoImgsrc = vwoImg.getScreenshotAs(OutputType.FILE);
        File vwoimgDest = new File("./Screenshots/Img3.png");
        FileHandler.copy(vwoImgsrc , vwoimgDest);

        WebElement loginDiv = driver.findElement(By.xpath("//div[@data-qa='tibogaquxi']"));
        vwoImgsrc = loginDiv.getScreenshotAs(OutputType.FILE);
        vwoimgDest = new File("./Screenshots/Img4.png");
        FileHandler.copy(vwoImgsrc , vwoimgDest);



        driver.quit();
    }
}
