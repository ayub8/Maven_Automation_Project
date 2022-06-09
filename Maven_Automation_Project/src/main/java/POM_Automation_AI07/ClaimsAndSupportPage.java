package POM_Automation_AI07;

import ReusableClass.Reusable_Actions_POM_Loggers;
import ReusableClass.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimsAndSupportPage extends Reusable_Annotation_Class {
    // A variable that is used to log the test results.
    ExtentTest logger;

    //creating a constructor method that will reference the same name as your class.
    public ClaimsAndSupportPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        // Assigning the logger variable to the logger variable in the Reusable_Actions class.
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //define all the web-element using @find
    @FindBy(xpath = "//*[@alt='Blue and orange icon of a mobile phone with a shield symbol on the screen']")
    WebElement MobileDeviceInsurance;


    public void MobileDeviceInsurance(){
        Reusable_Actions_POM_Loggers.clickAction(driver,MobileDeviceInsurance,logger, "Mobile Device Insurance");
    }//end of MobileDeviceInsurance
   
}//end of the class
