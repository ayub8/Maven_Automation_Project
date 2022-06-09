package POM_Automation_AI07;

import ReusableClass.Reusable_Actions_POM_Loggers;
import ReusableClass.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchbyZIPorPostalCode extends Reusable_Annotation_Class {
    // A variable that is used to log the test results.
    ExtentTest logger;

    //creating a constructor method that will reference the same name as your class.
    public SearchbyZIPorPostalCode (WebDriver driver){
        PageFactory.initElements(driver, this);
        // Assigning the logger variable to the logger variable in the Reusable_Actions class.
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //define all the web-element using @find
    @FindBy(xpath = "//*[@href='https://www.cellphonerepair.com/locations/']")
    WebElement DontHaveDeviceProtection;

    @FindBy(xpath = "//*[@id='mb-zip-search']")
    WebElement searchUserValue;

    @FindBy(xpath = "//*[@id='bh-sl-submit']")
    WebElement Submit;

    public void DontHaveDeviceProtection(){
        Reusable_Actions_POM_Loggers.clickAction(driver,DontHaveDeviceProtection,logger, "Don't Have Device Protection");
    }//end of DontHaveDeviceProtection

    public void searchUserValue(String uservalue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver,searchUserValue,uservalue,logger, "Search Field");
    }//end of searchUserValue

    public void Submit(){
        Reusable_Actions_POM_Loggers.submitAction(driver,Submit,logger," Search Button");
    }//end of google search button
}//end of the class

