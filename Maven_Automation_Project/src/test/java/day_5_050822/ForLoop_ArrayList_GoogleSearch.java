package day_5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ForLoop_ArrayList_GoogleSearch
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
        //setting your driver as headless (running on background )
        //option.addArguments("headless");
        //for mac use full screen
        option.addArguments("start-fullscreen");
        //define the web-drive I am going to use
        WebDriver driver = new ChromeDriver(option);

        // This is creating an array list of cities and adding the cities to the array list.
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn"); //this is index 0
        cities.add("Manhattan"); //this is index 1
        cities.add("Queens");
        cities.add("Bronx");

        for (int i = 0; i < cities.size(); i++)
        {
            //go to google home page
            driver.navigate().to("https://www.google.com");
            //giving the page a little break before running it .
            Thread.sleep(2500);

            //locate elements for the search filed and type keyboard "cars"
            //("//*[@name='q']") all it doing is going to google and selecting the search button and ready to type.
            //.sendKeys("jobs") all this doing is typing jobs in the search buttons.
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities.get(i));

            //submit on Google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();

            //giving the page a little break before running it .
            Thread.sleep(4500);

            //capture the Google search and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            //System.out.println("Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");

            //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
            //String replacePara nth = arrayResult[3].replace("(","").replace(")","");

            //print out the statement.
             System.out.println("My search number for cities " + cities.get(i)+ " is " + arrayResult[1]);
        }// end of the loop

        driver.quit();

    }
}
