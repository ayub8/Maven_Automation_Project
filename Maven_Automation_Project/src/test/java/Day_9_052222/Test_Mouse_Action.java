package Day_9_052222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Test_Mouse_Action {
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

        driver.navigate().to("https://www.usps.com/");
        Thread.sleep(1500);

        //declaring the mouse move to the driver
        Actions mousemove = new Actions(driver);

        // Finding the element by xpath.
        WebElement SendButton = driver.findElement(By.xpath("//*[@id= 'mail-ship-width']"));
        // Moving the mouse to the element.
        //.Perform(); will only hover over the ara and not click
        mousemove.moveToElement(SendButton).perform();


        //click on tracking with mouse action
        WebElement TrackingButton = driver.findElement(By.xpath("//*[text()= 'Tracking']"));
        // Moving the mouse to the element and clicking on it.
        mousemove.moveToElement(TrackingButton).click().perform();

        //clicking on the search bar to type in the tracking number
        WebElement EnterNumber = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        mousemove.moveToElement(EnterNumber).click().sendKeys("123456789").perform();

driver.quit();
    }


}
