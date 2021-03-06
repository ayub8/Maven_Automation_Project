package Day_4_050722;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest
{
    public static void main(String[] args)
    {
        //setup your chromedrive with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdrive I am going to use
        WebDriver driver = new ChromeDriver();

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

        //capture the google search and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

        System.out.println("Result is " + searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");

        //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
        String replaceParanth = arrayResult[3].replace("(","").replace(")","");

        //print out the statement.
        System.out.println("My search number is " + arrayResult[1]);

    }

}










