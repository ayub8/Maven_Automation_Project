package Day_7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class fedilisCare_tabs
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

        //going to this page
        driver.navigate().to("https://www.fideliscare.org/");
        // Waiting for the page to load.
        Thread.sleep(1500);
        //click on shop for a plan
        //we are clicking on index 0 because there are twp elements for the xpath
        driver.findElements(By.xpath("//*[text() = 'Shop For a Plan']")).get(0).click();
        //wait a bit for a page to load
        Thread.sleep(1000);

        //click on a medicaid managed care
        driver.findElements(By.xpath("//*[text() = 'Medicaid Managed Care']")).get(0).click();
        //wait a bit for a page to load
        Thread.sleep(1000);

        //click on search under find a doctor card
        driver.findElement(By.xpath("//*[@href = '/findadoctor']")).click();
        //wait a bit for a page to load
        Thread.sleep(1000);

        //store new tabs in an array list, we use getWindowHandles method to get list of tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to a new tab, it should be at index 1
        driver.switchTo().window(tabs.get(1));

        //click on new search button
        driver.findElement(By.xpath("//*[@class = 'fal fa-search-plus']")).click();
        //wait a bit for a page to load
        Thread.sleep(1000);

        //close the new tab
        driver.close();
        //switch back to the default tab
        driver.switchTo().window(tabs.get(0));

        //then click on previous card
        driver.findElement(By.xpath("//*[@class = 'fal fa-stethoscope fa-fw']")).click();
        //wait until provider card is clicked on
        Thread.sleep(1000);

        driver.quit();


    }
}
