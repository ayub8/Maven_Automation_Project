package Day_9_052222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class USPS_Implicit_Explicit {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the web driver I am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to usps homepage
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(3000);

        //call mouse actions
        Actions actions = new Actions(driver);
        
        //declaring and define explicit wait
        WebDriverWait wait = new WebDriverWait(driver,8);

        //hover to quick tools
        WebElement quickTools = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Quick Tools']")));
        // Moving the mouse to the element.
        actions.moveToElement(quickTools).perform();

        //click on track a package
        WebElement Trackpackage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']")));
        // Moving the mouse to the element and then clicking on it.
        actions.moveToElement(Trackpackage).click().perform();

        //click and then type on track a package field
        WebElement packageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tracking-input']")));
        // Clicking on the field.
        packageField.click();
        packageField.sendKeys("12222322232");

    }
}
