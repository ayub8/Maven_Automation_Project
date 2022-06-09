package Action_items;

import POM_Automation_AI07.Assurant_BaseClass;
import ReusableClass.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class Automation_AI07_Assurant_POM extends Reusable_Annotation_Class {

    @Test
    public void HomePage(){
        driver.navigate().to("https://www.assurant.com/home");
        Assurant_BaseClass.assurantHomePage().ClaimsAndSupportButton();
        Assurant_BaseClass.claimsAndSupportPage().MobileDeviceInsurance();
        Assurant_BaseClass.mobileDeviceInsurancePage().MyWirelessClaim();
        Assurant_BaseClass.myWirelessClaimsPage().SelectAProvider();
        Assurant_BaseClass.myWirelessClaimsPage().TMobileDropdown();
        Assurant_BaseClass.myWirelessClaimsPage().TMobileUSAService();
    }//end of homepage

    @Test(dependsOnMethods = "HomePage")
    public void TMobileRepair(){
        driver.navigate().to("https://www.assurant.com/home");
        Assurant_BaseClass.assurantHomePage().ClaimsAndSupportButton();
        Assurant_BaseClass.claimsAndSupportPage().MobileDeviceInsurance();
        Assurant_BaseClass.dontHaveDeviceProtection();
        Assurant_BaseClass.dontHaveDeviceProtection().SearchbyZIPorPostalCode();
        Assurant_BaseClass.searchbyZIPorPostalCode().searchUserValue("11218");
        Assurant_BaseClass.searchbyZIPorPostalCode().Submit();
        Assurant_BaseClass.nearByRepairStore().RepairEstimate();
    }
}//end of class