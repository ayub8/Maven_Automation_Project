package ReusableLibries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Automation_AI05_ReusableAction {

    //resuable function that allows you to return the methods from the Webdriver
    public static WebDriver UHCDriver() {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        return driver;//this will return the value
    }

    public static void clickAction(WebDriver driver,String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickAction

    // This is a method that is returning the text of the element.
    public static ArrayList<String> selectByText(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        ArrayList<String> BDMonth = new ArrayList<>();
        BDMonth.add("June");
        BDMonth.add("August");
        BDMonth.add("April");
        for (int i = 0; i < BDMonth.size(); i++) {
            try {
                WebElement startMonth = driver.findElement(By.xpath("//*[@autocomplete='bday-month']"));
                Select dropdown = new Select(startMonth);
                dropdown.selectByVisibleText(BDMonth.get(i));
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Start Month dropdown " + e);
            }//end of start month exception
            return BDMonth;

        }//end of forloop
        return BDMonth;
    }//end of SelectByText
    public static String captureByText(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        String result = null;
        try{
            WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
        }catch (Exception e)
        {
            System.out.println("unable to capture text on element"+ elementName+""+ e);
        }
        return result;
    }//end of captureByText

    // This is a method that is returning the title of the page.
    public static String varifyTitle(WebDriver driver, String xpath, String elementName)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //delcaring the string that will match the title
        String Title = driver.getTitle();
        //matching the title with the tile
        if (Title.equals("Health insurance plans")) {
            System.out.println("Title matched");
        } else {
            System.out.println("This is the Actual-Title  " + Title);
        }
        return Title;
    }//end of varifyTitle

    //Handle exception for switch tabs
    public static void switchToTabByIndex(WebDriver driver, int userValues)
    {
            //WebDriverWait wait = new WebDriverWait(driver, 10);

            //store new tabs in an array list, we use getWindowHandles method to get list of tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(userValues));

            //End of exception for switch tabs
        }//end of switchToTabByIndex


}//end of class


