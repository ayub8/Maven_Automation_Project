package POM_Automation_AI07;

import ReusableClass.Reusable_Actions;
import ReusableClass.Reusable_Actions_Loggers;
import ReusableClass.Reusable_Actions_POM_Loggers;
import ReusableClass.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

/**
 * This class is a child class of Reusable_Annotation_Class and it is used to define all the methods that are related to
 * the Assurant Home Page.
 */
public class AssurantHomePage extends Reusable_Annotation_Class {

    // A variable that is used to log the test results.
    ExtentTest logger;

    //creating a constructor method that will reference the same name as your class.
    public AssurantHomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
        // Assigning the logger variable to the logger variable in the Reusable_Actions class.
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //define all the web-element using @find
    @FindBy(xpath = "//*[@title='Document Icon']")
    WebElement ClaimsAndSupport;

    public void ClaimsAndSupportButton(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ClaimsAndSupport,logger, "Claims & Support");
    }//end of ClaimsAndSupportButton
}//end of the class
