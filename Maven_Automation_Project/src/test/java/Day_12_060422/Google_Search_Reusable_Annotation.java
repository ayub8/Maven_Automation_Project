package Day_12_060422;

import ReusableClass.Reusable_Actions_Loggers;
import ReusableClass.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class Google_Search_Reusable_Annotation extends Reusable_Annotation_Class {

        //test case 1: navigate to google and enter a keyword on search field
        @Test(priority = 1)
        public void GoogleSearchForKeyword() {
            // Navigating to the google.com website.
            driver.navigate().to("https://www.google.com");
            //enter a keyword on search field
            Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='q']", "BMW", logger, "Search Field");
            //submit the go button
            Reusable_Actions_Loggers.submitAction(driver, "//*[@name='btnK']", logger, "Google Search Button");


        }//end of test 1

        /*
        dependsOnMethods is used when  following @Test is dependent on previous @Test method. If the first test fails,
        the dependent test will get skipped
        */
        @Test(dependsOnMethods = "GoogleSearchForKeyword")
        public void GoogleCaptureSearchNumber () {
            //capture search result
            String result = Reusable_Actions_Loggers.getTextAction(driver, "//*[@id='result-stats']", logger, "Search Result Text");
            //split the result by single space and print out the search number
            String[] arrayResult = result.split(" ");
            System.out.println("Search number is " + arrayResult[1]);


        }//end of test 2
    }//end of class

