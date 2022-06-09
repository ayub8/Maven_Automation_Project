package Day_8_052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class hotelsClassAction {
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

        //Navigate to hotels.com
        driver.navigate().to("https://www.hotels.com");
        Thread.sleep(1500);


        //Handle the exception for search field
        try {
            //Element for search field
            WebElement destinationSearch = driver.findElement(By.xpath("//*[@data-testid='location-field-destination-container']"));
            destinationSearch.click();
            destinationSearch.clear();
        } catch (Exception e) {
            System.out.println("Unable to locate search field " + e);
        }//End of exception for search field


        //Handle exception for where are you going field
        try {
            WebElement whereYouGoing = driver.findElement(By.xpath("//*[@placeholder='Where are you going?']"));
            whereYouGoing.sendKeys("Miami");
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println("Unable to locate Where are you going field " + e);
        }//End of exception for Where are you going field


        //Handle the exception for Where are you going dropdown
        try {
            //Element for Where are you going dropdown
            WebElement whereAreYouGoingButton = driver.findElement(By.xpath("//*[text()='Miami Beach']"));
            whereAreYouGoingButton.click();
        } catch (Exception e) {
            System.out.println("Unable to locate where are you going dropdown " + e);
        }//End of exception for where are you going dropdown


        //Handle the exception for Check-in Date
        try {
            //Element for Check-in Date
            WebElement checkInDateDropdown = driver.findElement(By.xpath("//*[@id='d1-btn']"));
            checkInDateDropdown.click();

        } catch (Exception e) {
            System.out.println("Unable to locate check-in date " + e);
        }//End of exception for check-in date


        //Handle the exception for Check-in Date
        try {
            //Element for Check-in Date
            WebElement checkInDate = driver.findElement(By.xpath("//*[@aria-label='Jun 6, 2022']"));
            checkInDate.click();
        } catch (Exception e) {
            System.out.println("Unable to locate check-in date " + e);
        }//End of exception for check-in date


        //Handle the exception for Check-Out Date
        try {
            //Element for Check-Out Date
            WebElement checkOutDate = driver.findElement(By.xpath("//*[@aria-label='Jun 16, 2022']"));
            checkOutDate.click();
        } catch (Exception e) {
            System.out.println("Unable to locate check-out date " + e);
        }//End of exception for check-out date


        //Handle the exception for done button
        try {
            //Element for done button
            WebElement doneButton = driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
            doneButton.click();
        } catch (Exception e) {
            System.out.println("Unable to locate done button " + e);
        }//End of exception done button


        //Handle the exception for Number of Travelers
        try {
            //Element for Number of Travelers
            WebElement travelersDropdown = driver.findElement(By.xpath("//*[@data-testid='travelers-field-trigger']"));
            travelersDropdown.click();
        } catch (Exception e) {
            System.out.println("Unable to locate Number of Travelers " + e);
        }//End of exception Number of Travelers


        //Handle the exception for Number of Travelers Done Button
        try {
            //Element for Number of Travelers Done Button
            WebElement travelersDone = driver.findElement(By.xpath("//*[@data-testid='guests-done-button']"));
            travelersDone.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Unable to locate Number of Travelers Done Button " + e);
        }//End of exception Number of Travelers Done Button


        //Handle the exception for Search Button
        try {
            //Element for Search Button
            WebElement searchButton = driver.findElement(By.xpath("//*[@data-testid='submit-button']"));
            searchButton.click();
        } catch (Exception e) {
            System.out.println("Unable to locate Search Button " + e);
        }//End of exception Search Button


        //Handle the exception for choose hotels
        try {
            //Element for choose hotels
            WebElement chooseHotels = driver.findElements(By.xpath("//*[@class='listing__link uitk-card-link']")).get(0);
            chooseHotels.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Unable to locate choose hotels " + e);
        }//End of exception for choose hotels


        //Handle exception for switch tabs
        try {
            //store new tabs in an array list, we use getWindowHandles method to get list of tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
        } catch (Exception e) {
            System.out.println("Unable to locate new tab " + e);
        }//End of exception for switch tabs


        //Handle the exception for Capture Name of Resort and Print
        try {
            //Element for Capture Name of Resort and Print
            String nameofResort = driver.findElement(By.xpath("//*[@class='uitk-spacing uitk-spacing-padding-small-blockend-four uitk-spacing-padding-large-blockstart-three']")).getText();
            Thread.sleep(3000);
            System.out.println("Name of Resort is " + nameofResort);
        } catch (Exception e) {
            System.out.println("Unable to locate Name of Resort " + e);
        }//End of exception for choose hotels


        //Handle the exception for scrolling down
        try {
            //Declare javascriptexecutor variable
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //Scroll down to view Studio Workshop Schedule for each Studio Link
            jse.executeScript("scroll(0,1600)");
            //Slow down script
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Unable to scroll down " + e);


            /*Handle the exception for choose hotels
            //try {
                //Element for choose hotels
                WebElement chooseHotels  = driver.findElements(By.xpath("//*[@class='listing__link uitk-card-link']")).get(0);
                chooseHotels.click();
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Unable to locate choose hotels " + e);
            }//End of exception for choose hotels
            */


              /*Handle the exception for choose hotels
            //try {
                //Element for choose hotels
                WebElement chooseHotels  = driver.findElements(By.xpath("//*[@class='listing__link uitk-card-link']")).get(0);
                chooseHotels.click();
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Unable to locate choose hotels " + e);
            }//End of exception for choose hotels
            */


        }//end of exception for scrolling down
        //driver.quit();
    }
}//end of main method
