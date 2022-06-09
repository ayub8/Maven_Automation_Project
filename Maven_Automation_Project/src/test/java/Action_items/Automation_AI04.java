package Action_items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_AI04 {
    public static void main(String[] args) throws InterruptedException {
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

        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11218");
        zipcode.add("11219");
        zipcode.add("11220");

        //for (int i = 0; i < zipcode.size(); i++) {

        //navigating to weight watch webpage
        driver.navigate().to("https://www.weightwatchers.com/us/");
        Thread.sleep(3000);

        //using the try and catch button to find mistake easily and on steps.
        try {
            //click on the attend  button to pull up the downdown
            WebElement Attendbutton = driver.findElement(By.xpath("//*[@da-label = 'Attend']"));
            Thread.sleep(3000);
            Attendbutton.click();
        } catch (Exception e) {
            System.out.println("Is unable to click on the Attend Button" + e);
        }

        //using the try and catch button to find mistake easily and on steps.
        try {
            //dropdown button and click on unlimited workshop
            WebElement UnlimitedWorkshop = driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']"));
            Thread.sleep(3000);
            UnlimitedWorkshop.click();
        } catch (Exception e) {
            System.out.println("Is unable to click on the Unlimited workshop button" + e);
        }
        //using the try and catch button to find mistake easily and on steps.
        try {
            //pick on studio
            WebElement StudioButton = driver.findElement(By.xpath("//span [text()='Studio']"));
            Thread.sleep(3000);
            StudioButton.click();
        } catch (Exception e) {
            System.out.println("Is unable to click on the Studio button" + e);
        }
        try {
            //to type on the search button
            WebElement zipcodeList = driver.findElement(By.xpath("//*[@id='location-search']"));
            //would clear our the search bar before typing the zipcode
            zipcodeList.clear();
            zipcodeList.sendKeys("11218");
            driver.findElements(By.xpath("//*[@aria-label='Submit']")).get(0).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Unable to search any zipcode" + e);
        }
        try{
            //first link it will click on
            String SelectfirstLink = driver.findElements(By.xpath("//*[@id='location-1251699']")).get(0).getText();
           //SelectfirstLink.click();
            Thread.sleep(2000);
            //print out the 1st address
            System.out.println("1st link"+SelectfirstLink);

        }catch (Exception e){
            System.out.println("1st Link isn't clickable "+ e);
        }
        try{
            //to type on the search button
            String SelectsecoundLink = driver.findElements(By.xpath("//*[@id='location-1252579']")).get(0).getText();
            //SelectfirstLink.click();
            Thread.sleep(2000);
            //print out the 2nd address
            System.out.println("2nd link "+SelectsecoundLink);
        }catch (Exception e){
            System.out.println("2nd Link isn't clickable "+ e);
        }
        try{
            //to type on the search button
            String SelectthirdLink = driver.findElements(By.xpath("//*[@id='location-1251189']")).get(0).getText();
            //SelectfirstLink.click();
            Thread.sleep(2000);
            //print out the 3rd address
            System.out.println("3rd link"+SelectthirdLink);
        }catch (Exception e){
            System.out.println("3rd Link isn't clickable "+ e);
        }
        try{
            String Scedule = driver.findElements(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).get(0).getText();
            Thread.sleep(2000);
            //Scedule.click();
            System.out.println("These are the Schedule"+Scedule);
        }catch(Exception e){
            System.out.println("Schedule isn't working");
        }



/*
            for (int i = 0; i < zipcodelist.size(); i++)
            {

                    //to type on the search button
                WebElement zipcode = driver.findElement(By.xpath("//*[@id='location-search']"));
                zipcode.clear();
                zipcode.sendKeys(zipcodelist.get(i));
               driver.findElements(By.xpath("//*[@aria-label='Submit']")).get(0).click();
                Thread.sleep(3000);

                try
                {
                    if (i == 0)
                    {
                        driver.findElements(By.xpath("//*[@id='location-1251699']")).get(1).click();
                    }
                    if (i == 1)
                    {
                        driver.findElements(By.xpath("//*[@id='location-1252579']")).get(2).click();
                    }
                    if (i == 2)
                    {
                        driver.findElements(By.xpath("//*[@id='location-1251189']")).get(3).click();
                    }
                    if (i == 3)
                    {
                        driver.findElements(By.xpath("//*[@id='location-1252089']")).get(4).click();
                    }
                    if (i == 4)
                    {
                        driver.findElements(By.xpath("//*[@id='location-1257349']")).get(5).click();
                    }

                    catch (Exception e)
                    {
                        //print out the exception
                        System.out.println("Unable to locate workshop " + e );
                    }   //end of purchase price exception

                }
            }

 */
    driver.quit();
    }
}