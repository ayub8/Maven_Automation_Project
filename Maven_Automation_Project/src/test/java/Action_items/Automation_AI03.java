package Action_items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_AI03
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
        //setting your driver as headless (running on background )
        //option.addArguments("headless");
        //for mac use full screen
        option.addArguments("start-fullscreen");
        //define the web-drive I am going to use
        WebDriver driver = new ChromeDriver(option);

        // This is creating an array list of hobby and adding the hobby to the array list.
        ArrayList<String> hobby = new ArrayList<>();
        hobby.add(" hunting"); //this is index 0
        hobby.add(" soccer"); //this is index 1
        hobby.add(" rock climbing");
        hobby.add(" gardening");
        hobby.add(" mountain biking");


        for (int i = 0; i < hobby.size(); i++)
        {
            //go to bing home page
            driver.navigate().to("https://www.bing.com");
            //giving the page a little break before running it .
            Thread.sleep(2500);

            //locate elements for the search filed and type keyboard "Hobby"
            //("//*[@name='q']") all it doing is going to bing and selecting the search button and ready to type.
            //.sendKeys(hobby.get(i)) all this doing is typing jobs in the search buttons.
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobby.get(i));

            //submit on bing search button
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();

            //giving the page a little break before running it .
            Thread.sleep(4500);

            //capture the bing search and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='b_tween']" )).getText();

            //System.out.println("Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");

            //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
            //String replacePara nth = arrayResult[3].replace("(","").replace(")","");

            //print out the statement.
            System.out.println(" " + hobby.get(i) + " has " + arrayResult[0] + " Search result on Bing.com ");
        }// end of the loop

        driver.quit();

    }
}

