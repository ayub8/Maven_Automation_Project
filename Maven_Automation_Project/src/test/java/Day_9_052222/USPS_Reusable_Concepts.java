package Day_9_052222;

import ReusableLibries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

public class USPS_Reusable_Concepts {
    public static void main(String[] args) throws InterruptedException  {

        // Calling the setDriver method from the Reusable_Actions class.
        WebDriver driver = Reusable_Actions.setDriver();

        // Navigating to the URL.
        driver.navigate().to("https://www.usps.com");

        // Calling the methods from the Reusable_Actions class.
        //hovering to the quick tools
        Reusable_Actions.mouseHover(driver, "//*[text()='Quick Tools']", "Quick Tools");

        //hover to send tab
        Reusable_Actions.mouseHover(driver, "//*[@id='mail-ship-width']", "Send Tab");

        //click on calculate a price
        Reusable_Actions.clickAction(driver, "//*[@class='tool-calc']", "Calculate a Price");

        //enter a zipcode
        Reusable_Actions.sendKeysAction(driver, "//*[@id='Origin']", "11218", "Zip Code");

        //print out header text info
        String result = Reusable_Actions.getTextAction(driver,"//*[@class='header-usps row']","Header info");
        System.out.println("My Header info is "+result);
    }//end of main
}//end of class
