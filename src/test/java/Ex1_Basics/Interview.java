package Ex1_Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.reporters.jq.Main;

import java.util.Set;

public class Interview {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        dropdown.click();

        Thread.sleep(3000);

        Select allDropdown = new Select(dropdown);
        allDropdown.selectByVisibleText("Books");
        WebElement myBooks = driver.findElement(By.xpath("//Option[@Value ='search-alias=stripbooks']"));
        myBooks.click();

        WebElement amazonSearch = driver.findElement(By.id("twotabsearchtextbox"));;
        amazonSearch.sendKeys("Machines");
        amazonSearch.sendKeys(Keys.ENTER);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");

        WebElement firstBook = driver.findElement(By.partialLinkText("Scikit-Learn, Keras, and TensorFlow"));
        firstBook.click();

        // Step 2: Store the parent window handle
        String parentWindow = driver.getWindowHandle();

// Step 3: Get all open window handles
        Set<String> allWindows = driver.getWindowHandles();

// Step 4: Switch to the new window (only one other window expected)
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                Thread.sleep(3000);
                break;
            }

            driver.manage().window().maximize();

            WebElement addToCart = driver.findElement(By.id("submit.add-to-cart-announce"));
            addToCart.click();


            driver.quit();


        }









    }
}
