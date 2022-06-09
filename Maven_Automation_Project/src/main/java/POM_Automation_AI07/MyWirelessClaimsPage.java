package POM_Automation_AI07;

import ReusableClass.Reusable_Actions_POM_Loggers;
import ReusableClass.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWirelessClaimsPage extends Reusable_Annotation_Class{
    ExtentTest logger;

    //creating a constructor method that will reference the same name as your class.
    public MyWirelessClaimsPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        // Assigning the logger variable to the logger variable in the Reusable_Actions class.
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //define all the web-element using @find
      @FindBy(xpath = "//*[@alt='Select a Provider']")
      WebElement SelectAProvider;
      @FindBy(xpath = "//*[@data-container='subMenu1']")
      WebElement TMobileDropdown;
      @FindBy(xpath = "//*[@href='https://www.mywirelessclaim.com/t-mobile?lang=en-us']")
      WebElement TMobileUSAService;

    public void SelectAProvider(){
        Reusable_Actions_POM_Loggers.clickAction(driver,SelectAProvider,logger, "My Wireless Claim");
    }//end of SelectAProvider

    public void TMobileDropdown(){
        Reusable_Actions_POM_Loggers.clickAction(driver,TMobileDropdown,logger, "My Wireless Claim");
    }//end of TMobileDropdown

    public void TMobileUSAService(){
        Reusable_Actions_POM_Loggers.clickAction(driver,TMobileUSAService,logger, "My Wireless Claim");
    }//end of TMobileUSAService

}//end of the class

