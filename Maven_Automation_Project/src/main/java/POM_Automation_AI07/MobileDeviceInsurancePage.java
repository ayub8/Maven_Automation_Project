package POM_Automation_AI07;

import ReusableClass.Reusable_Actions_POM_Loggers;
import ReusableClass.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileDeviceInsurancePage extends Reusable_Annotation_Class {
    ExtentTest logger;

    //creating a constructor method that will reference the same name as your class.
    public MobileDeviceInsurancePage (WebDriver driver){
        PageFactory.initElements(driver, this);
        // Assigning the logger variable to the logger variable in the Reusable_Actions class.
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //define all the web-element using @find
    @FindBy(xpath = "//*[@href='https://mywirelessclaim.com/']")
    WebElement MyWirelessClaim;

    public void MyWirelessClaim(){
        Reusable_Actions_POM_Loggers.clickAction(driver,MyWirelessClaim,logger, "My Wireless Claim");
    }//end of MyWirelessClaim
}//end of the class

