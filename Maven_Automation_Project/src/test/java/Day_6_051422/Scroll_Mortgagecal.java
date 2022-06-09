package Day_6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Mortgagecal
{
    public static void main(String[] args) throws InterruptedException
    {
        //set up your chrome-drive with web-driver-manager
        WebDriverManager.chromedriver().setup();
        //set chrome option arguments
        ChromeOptions option = new ChromeOptions();
        //set the condition to incognito mode
        option.addArguments("incognito");
        //set the condition to max/min your driver
        option.addArguments("start-maximized");
        //for mac use full screen
        option.addArguments("start-fullscreen");
        //define the web-drive I am going to use
        WebDriver driver = new ChromeDriver(option);

        //going to this page
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(1500);

        JavascriptExecutor jsc = (JavascriptExecutor) driver;
        //scroll to pixel 400 on mortage calc website
        jsc.executeScript("scroll(0,800)");
        //wait a bit for browser to perform scrolling
        Thread.sleep(3000);
        //declare a webelment variable that we want to scroll into
        WebElement shareButton = driver.findElement(By.xpath("//*[@id = 'share_button']"));
        //scroll into share this calcultor button
        jsc.executeScript("arguments[0].scrollIntoView(true);", shareButton);
        Thread.sleep(2000);
        //click on the share this calculator button
        shareButton.click();
        Thread.sleep(2000);
        //scroll back up
        jsc.executeScript("scroll(0,-400)");
        Thread.sleep(2000);
        //quit the chrome driver
        driver.quit();

    }
}
