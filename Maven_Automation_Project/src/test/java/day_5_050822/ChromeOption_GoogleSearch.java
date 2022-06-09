package day_5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption_GoogleSearch
{
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedrive with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome option arguments
        ChromeOptions option = new ChromeOptions();
        //set the condition to incognito mode
        option.addArguments("incognito");
        //set the condtion to max/min your driver
        option.addArguments("start-maximized");
        //setting your driver as healdess (running on background )
        //option.addArguments("headless");
        //for mac use full screen
        option.addArguments("start-fullscreen");
        //define the webdrive I am going to use
        WebDriver driver = new ChromeDriver(option);

        //go to google home page
        driver.navigate().to("https://www.google.com");
        //maximine the driver
        //for mac use window().fullscreen();
        //for windowns window().maximize();
        driver.manage().window().fullscreen();

        //locate elecments for the search filed and type keyboard "cars"
        //("//*[@name='q']") all it doing is going to goolege and selecting the search button and ready to type.
        //.sendKeys("jobs") all this doing is typing jobs in the search buttons.
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //giving the page a little break before running it .
        Thread.sleep(2500);


        //capture the google search and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

        System.out.println("Result is " + searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");

        //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
        String replaceParanth = arrayResult[3].replace("(","").replace(")","");

        //print out the statement.
       // System.out.println("My search number is " + arrayResult[1]);

    }
}
