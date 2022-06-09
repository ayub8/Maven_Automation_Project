package Day_6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebElement_Mortgagecalc
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
        driver.navigate().to("https://www.mortgagecalculator.org/");
        Thread.sleep(1500);

        //click, clear and enter new values on home value field
        WebElement homevalue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homevalue.click();
        homevalue.clear();
        homevalue.sendKeys("450000");

        //click on %radio button
        driver.findElement(By.xpath("//*[@value='percent']")).click();

        //click, clear and enter new values on home value field
        WebElement downpayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        downpayment.click();
        downpayment.clear();
        downpayment.sendKeys("2");

        Thread.sleep(1500);




        driver.quit();
    }//end of main
}//end of class
