package Day_9_052222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        // Maximizing the browser window.
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to usps homepage
        driver.navigate().to("https://www.usps.com/");
        Thread.sleep(3000);

        //declare and define mouse action
        Actions mouseActions = new Actions(driver);

        //hover to send tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
        // Moving the mouse to the element.
        mouseActions.moveToElement(sendTab).perform();

        //click on tracking using mouse action
        WebElement tracking = driver.findElement(By.xpath("//*[text()='Tracking']"));
        // Moving the mouse to the element and then clicking on it.
        mouseActions.moveToElement(tracking).click().perform();


        Thread.sleep(3000);
        //click on tracking using mouse action
        WebElement trackingField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        mouseActions.moveToElement(trackingField).click().perform();
        // Moving the mouse to the tracking field and then sending the keys "111234243242" to the field.
        mouseActions.moveToElement(trackingField).sendKeys("111234243242").perform();
    }
}
