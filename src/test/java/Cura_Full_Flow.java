import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cura_Full_Flow {

    EdgeDriver driver = new EdgeDriver();

    @Description("Open Cura website")
    @BeforeTest
    public void openBrowser() {

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

    }

    @Description("Automate booking page")
    @Test
    public void CuraAppointment() throws InterruptedException {

        WebElement makeAppointment = driver.findElement(By.id("btn-make-appointment"));
        makeAppointment.click();

        Thread.sleep(3000);

        WebElement userName = driver.findElement(By.id("txt-username"));
        userName.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();

        WebElement facilityDropdown = driver.findElement(By.id("combo_facility"));
        Select select = new Select(facilityDropdown);
        select.selectByIndex(0);

        WebElement readmissionCheck = driver.findElement(By.id("chk_hospotal_readmission"));
        readmissionCheck.click();

        WebElement madicadeRadio = driver.findElement(By.id("radio_program_medicaid"));
        madicadeRadio.click();

        WebElement commentText = driver.findElement(By.id("txt_comment"));
        commentText.sendKeys("New Appointment");

        WebElement bookAppointmentBtn = driver.findElement(By.id("btn-book-appointment"));
        bookAppointmentBtn.click();

        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
    }

    @Description("Close Browser")
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
