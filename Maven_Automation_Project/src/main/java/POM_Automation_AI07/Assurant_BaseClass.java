package POM_Automation_AI07;

import ReusableClass.Reusable_Actions;
import ReusableClass.Reusable_Annotation_Class;

public class Assurant_BaseClass extends Reusable_Annotation_Class {

    public static AssurantHomePage assurantHomePage(){
       AssurantHomePage assurantHomePage = new AssurantHomePage(driver);
        return assurantHomePage;
    }
    public static ClaimsAndSupportPage claimsAndSupportPage(){
        ClaimsAndSupportPage claimsAndSupportPage = new ClaimsAndSupportPage(driver);
        return claimsAndSupportPage;
    }
    public static MobileDeviceInsurancePage mobileDeviceInsurancePage(){
        MobileDeviceInsurancePage mobileDeviceInsurancePage = new MobileDeviceInsurancePage(driver);
        return mobileDeviceInsurancePage;
    }
    public static MyWirelessClaimsPage myWirelessClaimsPage(){
        MyWirelessClaimsPage myWirelessClaimsPage = new MyWirelessClaimsPage(driver);
        return myWirelessClaimsPage;
    }
    public static DontHaveDeviceProtection dontHaveDeviceProtection(){
        DontHaveDeviceProtection dontHaveDeviceProtection = new DontHaveDeviceProtection(driver);
        return dontHaveDeviceProtection;
    }
    public static SearchbyZIPorPostalCode searchbyZIPorPostalCode(){
        SearchbyZIPorPostalCode searchbyZIPorPostalCode = new SearchbyZIPorPostalCode(driver);
        return searchbyZIPorPostalCode;
    }
    public static NearByRepairStore nearByRepairStore(){
        NearByRepairStore nearByRepairStore  = new NearByRepairStore(driver);
        return nearByRepairStore;
    }


}
