package Day_10_052822;

import ReusableClass.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Example {
    //declaring the web-driver outside so its global and can be reused in other annotation method
    WebDriver driver;

    // A method that is executed before the test suite.
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of before suite annotation

    //test case 1: navigate to google and enter a keyword on search field
    @Test(priority = 1)
    public void SearchForKeyword(){
        driver.navigate().to("https://www.google.com");
        //enter a keyword on search filed
        Reusable_Actions.sendKeysAction(driver, "//*[@name='q']","BMW", "Search Field");
        //submit the go button
        Reusable_Actions.submitAction(driver, "//*[@name='btnK']","Google Search Button");
    }//end of test 1

    /*
    dependsOnMethods used when  following @Test is dependent on previous @Test method. Then If the first test fails,
    the dependent test will get skipped
     */
    //dependsOnMethods will only run if method SearchForKeyword passes the test if not it will skip and move to quit
    // A method that is executed before the test suite.
    @Test(dependsOnMethods = "SearchForKeyword")
    public void CaptureSearchNumber(){
        //capture search result
        String result = Reusable_Actions.getTextAction(driver,"//*[@id='result-stats']","Search Result Text");
        //split the result by single space and print out the search
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitSeason(){
        driver.quit();
    }//emd of after suit

}
