/*
Action Item due by Thursday 11pm eastern
   - Choose 6-7 use cases from your current company to automate
   - Using TestNG BeforeSuite, AfterSuite @Test(s) and ExtentTest logger in one java class and automate those use cases
   - be sure to put proper comments on each steps of your test so we know exactly what scenarios you are covering
   - right on top of each @Test just briefly put comment on what use case you are covering so we know what to look out for
   - put dependsOnMethod if test are dependant on each other or put priorities on the ones that are not dependant on each other
   - modify remaining reusable methods with ExtentTest loggers
   - also in one of your @test scenario, I want you to verify the title of the page by putting log.pass and log.fail on your reusable verifyTitle method
   - Take a screenshot of Extent HTML report or put as an attachment in the email
*/
package Action_items;


import ReusableClass.Reusable_Actions;
import ReusableClass.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Automation_AI06 {

    //declaring the web-driver outside so its Global and
    // can be reused in other annotation method
    WebDriver driver;

    // A global variable that is used to create a report.
    ExtentReports reports;

    // A global variable that is used to create a report.
    ExtentTest logger;

    // BeforeSuite is a method that is used to set the driver to the chrome driver.
    @BeforeSuite
    // Setting the driver to the chrome driver.
    public void setChromeDriver(){
        // Setting the driver to the chrome driver.
        driver = Reusable_Actions.setDriver();

        // Creating a new report.
        reports = new ExtentReports("src/main/java/HTML_Report/AI06.html",true);
    }
      //this is going to be my first test case to get to the website

    @Test(priority = 1)
      public void Webpage(){
          //first-Step is to go to the webpage
          driver.navigate().to("https://www.assurant.com/home");
        //this click action will click on the claims and support
          Reusable_Actions.clickAction(driver, "//*[@title='Document Icon']", "Claims & Support ");
          //this click action will click on the Mobile Device Insurance button
          Reusable_Actions.clickAction(driver, "//*[@alt='Blue and orange icon of a mobile phone with a shield symbol on the screen']", "Mobile Device Insurance");

        }

      //this test will only run if webpage is completes running
    @Test(dependsOnMethods = "Webpage")
      //As a user I want to file a claim, so I can get a new device from my provider.
      public void WirelessClaim(){

        //this click action will click on My Wireless Claims Site
          Reusable_Actions.clickAction(driver, "//*[@href='https://mywirelessclaim.com/']", "My Wireless Claims Site ");
          //this click action will click on the select a provider button
          Reusable_Actions.clickAction(driver, "//*[@alt='Select a Provider']", "Select a Provider");
        //this click action will click on the T-Mobile by Metro button
        Reusable_Actions.clickAction(driver, "//*[@data-container='subMenu1']", "t-mobile dropdown");
        //this click action will click on the T-Mobile by Metro button
        Reusable_Actions.clickAction(driver, "//*[@href='https://www.mywirelessclaim.com/t-mobile?lang=en-us']", "t-mobile usa");

      }

      //this test will run after completing webpage
    @Test(priority = 2)
      //this test will only run if webpage is completes running
      //@Test(dependsOnMethods = "WirelessClaim")
      //As a user I want to look for repair shop, so I can repair my device by my provider.
      public void DeviceProtection(){

        //first-Step is to go to the webpage
          driver.navigate().to("https://www.assurant.com/home");
          //this click action will click on the claims and support
          Reusable_Actions.clickAction(driver, "//*[@title='Document Icon']", "Claims & Support ");
          //this click action will click on the Mobile Device Insurance button
         Reusable_Actions.clickAction(driver, "//*[@alt='Blue and orange icon of a mobile phone with a shield symbol on the screen']", "Mobile Device Insurance");
          //this click action will click on the Don't Have Device Protection? plan button
          Reusable_Actions.clickAction(driver, "//*[@href='https://www.cellphonerepair.com/locations/']", "Don't Have Device Protection?");
          //this Send-keys-Action will type zipcode on the search bar
          Reusable_Actions.sendKeysAction(driver, "//*[@id='mb-zip-search']", "11218", "Search by ZIP or Postal Code");
          //this click action will click on the submit button after the input is written.
          Reusable_Actions.clickAction(driver, "//*[@id='bh-sl-submit']", "Submit");
          //this click action will cick on the repair detils
        Reusable_Actions.clickAction(driver,"//*[@href='https://www.cellphonerepair.com/astoria-long-island-ny/free-repair-estimate/']", "Repair Estimate");

      }

    //this test will run after completing "@test Priority =2 "
    @Test(priority = 3)
      //As a customer I want to file an Insurepost claim so I can be covered while shipping
      public void Insurepost() {
      //first-Step is to go to the webpage
      driver.navigate().to("https://www.assurant.com/home");
      //this click action will click on the claims and support
      Reusable_Actions.clickAction(driver, "//*[@title='Document Icon']", "Claims & Support ");
      //this click action will click on the Shipping Insurance button
      Reusable_Actions.clickAction(driver, "//*[@alt='Blue and orange icon of a shipping truck']", "SHIPPING INSURANCE");
      //this click action will click on the GO NOW button
      Reusable_Actions.clickAction(driver, "//*[@href='https://www.insurepost.com/claims.asp']", "GO NOW");
    }

    //this test will run after completing "@test(Priority =3) "
    @Test(priority = 4)
    //As a customer I want to file an Shipsurance claim so I can be covered while shipping
    public void Shipsurance() {
        //first-Step is to go to the webpage
        driver.navigate().to("https://www.assurant.com/home");
        //this click action will click on the claims and support
        Reusable_Actions.clickAction(driver, "//*[@title='Document Icon']", " Claims & Support");
        //this click action will click on the Shipping Insurance button
        Reusable_Actions.clickAction(driver, "//*[@alt='Blue and orange icon of a shipping truck']", "SHIPPING INSURANCE");
        //this click action will click on the GO NOW button
        Reusable_Actions.clickAction(driver, "//*[@href='https://www.shipsurance.com/claims']", "GO NOW");
        //this click action will click on the Start a new Claim button
        Reusable_Actions.clickAction(driver, "//*[@class='icon-edit iconBig iconRounded']", "Start a new Claim");
        }

        /* doesn't work
        //this Send-keys-Action will type UserName on the box
        Reusable_Actions.sendKeysAction(driver, "//*[@value='30']", "Robert", "Username");
        //this Send-keys-Action will type Password on the box
        Reusable_Actions.sendKeysAction(driver, "//*[@maxlength='20']", "Password", "Password");
        //this click action will click on the Login button
        Reusable_Actions.clickAction(driver, "//*[@class='login login-submit']", "Login");

        */

    //this test will run after completing "@test Priority =4 "
    @Test(priority = 5)
    //As a student I want to look in to careers so i can land me a job
    public void Careers(){
        logger = reports.startTest("Looking for a job");

        //first-Step is to go to the webpage
        driver.navigate().to("https://www.assurant.com/home");
        Reusable_Actions_Loggers.varifyTitle(driver, "//*[@title='Team Lead in Springfield | Assurant']", logger,"Title ");
        //this click action will click on the Careers
        Reusable_Actions.clickAction(driver, "//*[@title='Equity']", "T-Mobile cellPhone Repair");
        //this click action will click on the Team lead
        Reusable_Actions.clickAction(driver, "//*[@href='/en/jobs/job/team-lead-springfield-r-97065/']", "Team Lead");
        //this GetTextAction action will copy the text and paste it on the outputfile
        String result = Reusable_Actions_Loggers.getTextAction(driver,"//*[@class='col-lg-6 hero-content']",logger, "CopyText");
        // Splitting the string into an array.
        String[] arrayResult =  result.split(" ");
        System.out.println("JOB = " + arrayResult[1]);
        // Used to log the test steps.
        // `INFO` is used to log the test steps.
        logger.log(LogStatus.INFO,"JOB = " + arrayResult[1]);

        //end the logger per test
        reports.endTest(logger);
    }

    @Test(priority = 6)
    //As an owner I want to Purchase a Surety Bond, so I insure my Property
    public void RentersInsurance(){
        //first-Step is to go to the webpage
        driver.navigate().to("https://www.assurant.com/home");
        //this click action will click on the claims and support
        Reusable_Actions.clickAction(driver, "//*[@title='Document Icon']", "Claims & Support ");
        //this click action will click on the Renters Insurance button
        Reusable_Actions.clickAction(driver, "//*[@alt='Blue and orange icon of a multistory building']", "Renters Insurance");
        //this click action will click on the Enroll now button
        Reusable_Actions.clickAction(driver, "//*[@href='https://mysuredeposit.com/']", "Enroll Now");
        //this Send-keys-Action will type First name on the search bar
        Reusable_Actions.sendKeysAction(driver, "//*[@id='FirstName']", "Jack", "First Name");
        //this Send-keys-Action will type Last name on the search bar
        Reusable_Actions.sendKeysAction(driver, "//*[@id='LastName']", "White", "Last Name");

//not sure why this is not working. if i can get some help
        //this click action will click on the DOB Icon button
        Reusable_Actions.mouseHover(driver, "//*[@class='add-on']", "Dob Icon");
        //this Click-Action will type Date of Birth on the search bar
        Reusable_Actions.clickAction(driver, "//*[@text()='Jan']", "Month");
        //this Click-Action will type Date of Birth on the search bar
        Reusable_Actions.clickAction(driver, "//*[@text()='1900']", "Year");
        //this Click-Action will press on 1 on the drop down
        Reusable_Actions.clickAction(driver, "//*[@text()='1']","Date" );


        //this click action will click on the SocialSecurityNumber button
        Reusable_Actions.clickAction(driver, "//*[@id='btnSocial']", "Social Security Number");
        //this Send-keys-Action will type SocialSecurityNumber on the search bar
        Reusable_Actions.sendKeysAction(driver, "//*[@id='SSNLast4']", "0123", "Last 4 Digits of SSN");
        //this click action will click on the Continue button
        Reusable_Actions.clickAction(driver, "//*[@id='btnSubmit']", "Continue");

    }

        @AfterSuite
    //this will end the run and quit the program/browser
    public void quitSeason(){
        driver.quit();
        reports.flush();

    }//emd of after suit


}
