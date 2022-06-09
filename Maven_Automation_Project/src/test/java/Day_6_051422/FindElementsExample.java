package Day_6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsExample
{
    public static void main(String[] args) throws InterruptedException {
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


        //navigate to bing home
        driver.navigate().to("https://www.bing.com");
        //put the tab to sleep for a sec
        Thread.sleep(3000);
        //click on the Image using class property with index of 1
        //to ignore wite space in the property value we can use contains
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();

        driver.quit();
    }//end of main
}//end of class
