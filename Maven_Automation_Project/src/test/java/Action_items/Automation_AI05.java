package Action_items;

import ReusableLibries.Automation_AI05_ReusableAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Automation_AI05 {
    public static void main(String[] args) throws InterruptedException {

        //Automation_AI05_ReusableAction.UHCDriver(); is to refer back to the class we created in the reusable library
        //UHCDriver is the class we calling back to
        WebDriver driver = Automation_AI05_ReusableAction.UHCDriver();

        driver.navigate().to("https://www.uhc.com/");
        Thread.sleep(1500);

        Automation_AI05_ReusableAction.varifyTitle(driver, "//*[@title=' Let's get you registered - myUHCMedicare.com']", "Title");

        // Calling the methods from the Reusable_Actions class.
        //hovering to the quick tools////clicking on the find the doctor page
        Automation_AI05_ReusableAction.clickAction(driver, "//*[@href = '/find-a-doctor']", "Find a Doctor");

        //hover over the sign-in button
        Automation_AI05_ReusableAction.clickAction(driver, "//*[@class='jump-menu__button m-0 py-0 pl-4 pr-8 position-relative border-grey borderColor-greyDark borderRadius-default width-auto color-inherit bg-white weight-bold cursor-pointer sm-width-100 lineHeight-h4 py-2 talign-left']", "Sign in to find providers in your network");

        //click on the madicare plan
        Automation_AI05_ReusableAction.clickAction(driver, "//*[@aria-label='Medicare plan Opens a new window']", "Medicare plan");

        /* //clicking on the find the doctor page
            WebElement Findadoc = driver.findElement(By.xpath("//*[@href = '/find-a-doctor']"));
            Findadoc.click();
            Thread.sleep(1500);

            //hover over the sign-in button
            WebElement Signin = driver.findElement(By.xpath("//*[@aria-controls= '506082177-list']"));
            Signin.click();
            Thread.sleep(1500);

            //click on the madicare plan
            WebElement Madicare = driver.findElement(By.xpath("//*[@aria-label='Medicare plan Opens a new window']"));
            Madicare.click();
            Thread.sleep(1500);

            //Handle exception for switch tabs
            //store new tabs in an array list, we use getWindowHandles method to get list of tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

  */
         //Handle exception for switch tabs
        Automation_AI05_ReusableAction.switchToTabByIndex(driver, 1);


        //click on the register page
        Automation_AI05_ReusableAction.clickAction(driver, "//*[@class='uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']", "Register Now");

       /* WebElement RegisterNowButton = driver.findElement(By.xpath("//*[@class='uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']"));
            RegisterNowButton.click();
            Thread.sleep(1500);
        */

        ArrayList<String> FName = new ArrayList<>();
        FName.add("Jack");
        FName.add("Marlie");
        FName.add("Josh");

        ArrayList<String> LName = new ArrayList<>();
        LName.add("King");
        LName.add("Joe");
        LName.add("H");

        ArrayList<String> BDMonth= new ArrayList<>();
        BDMonth.add("June");
        BDMonth.add("August");
        BDMonth.add("April");

        ArrayList<String> Birthday = new ArrayList<>();
        Birthday.add("22");
        Birthday.add("29");
        Birthday.add("23");

        ArrayList<String> BirthYear = new ArrayList<>();
        BirthYear.add("1988");
        BirthYear.add("1999");
        BirthYear.add("1992");

        ArrayList<String> ZipCode = new ArrayList<>();
        ZipCode.add("11312");
        ZipCode.add("11513");
        ZipCode.add("11615");

        ArrayList<String> MemberId = new ArrayList<>();
        MemberId.add("12345678910");
        MemberId.add("09876543219");
        MemberId.add("67890543214");

            for (int i =0; i<MemberId.size(); i++) {
            //filling out the box for first name
            try {
                WebElement Firstname = driver.findElement(By.xpath("//*[@autocomplete='given-name']"));
                Firstname.clear();
                Firstname.sendKeys(FName.get(i));
            }
            catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate First Name" + e);
            }//end of First name

            //filling out the box for Last name
            try {
                WebElement Lastname = driver.findElement(By.xpath("//*[@autocomplete='family-name']"));
                Lastname.clear();
                Lastname.sendKeys(LName.get(i));
            }
            catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Last Name" + e);
            }//end of Last name

            //filling out the box for first name
            try {
                WebElement bd = driver.findElement(By.xpath("//*[@autocomplete='bday-day']"));
                bd.clear();
                bd.sendKeys(Birthday.get(i));
            }
            catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Birthday" + e);
            }//end of Birthday

            //Dropdown birthday month
            Automation_AI05_ReusableAction.selectByText(driver, "//*[@autocomplete='bday-month']","Month");

            //filling out the box for Birth year
            try {
                WebElement bdYear = driver.findElement(By.xpath("//*[@autocomplete='bday-year']"));
                bdYear.clear();
                bdYear.sendKeys(BirthYear.get(i));
            }
            catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Birth Year" + e);
            }//end of birth Year

            //filling out the box for Zipcode
            try {
                WebElement Zipc = driver.findElement(By.xpath("//*[@autocomplete='postal-code']"));
                Zipc.clear();
                Zipc.sendKeys(ZipCode.get(i));
            }
            catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Zipcode" + e);
            }//end of Zipcode

            //filling out the box for Member ID
            try {
                WebElement MemID = driver.findElement(By.xpath("//*[@autocomplete='off']"));
                MemID.clear();
                MemID.sendKeys(MemberId.get(i));
            }
            catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Member ID" + e);
            }//end of Member ID

            //clicking the Continue-button
            Automation_AI05_ReusableAction.clickAction(driver, "//*[@id='submitBtn']", "Continue");

            //copying the error message from the page
            Automation_AI05_ReusableAction.captureByText(driver,"//*[@class='SummaryError_ErrorContent__1j0LP']", "Error message");
            String str = driver.findElement(By.xpath("//*[@class='SummaryError_ErrorContent__1j0LP']")).getText();
            System.out.println("Error" + str);



            }
        //Switching tabs back to first page
        Automation_AI05_ReusableAction.switchToTabByIndex(driver, 0);
        Thread.sleep(3000);

        driver.quit();
    }
}
