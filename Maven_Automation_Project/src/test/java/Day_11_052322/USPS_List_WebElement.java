package Day_11_052322;

import ReusableLibries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class USPS_List_WebElement {
    WebDriver driver;

    // A method that is executed before the test suite.
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();
    }//end of before suite annotation
    @Test
    public void USPS_Tabs_Count() throws InterruptedException {
        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        //declare explicit wait for the tabs
        WebDriverWait wait = new WebDriverWait(driver,10);
        //store the navigation tabs as a list to get the count
        List<WebElement> tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
        //print the tab count
        System.out.println("Tabs count is " + tabsCount.size());

        for(int i = 0; i <tabsCount.size(); i++){
            driver.navigate().to("https://www.usps.com");
            tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            //click on each tab
            tabsCount.get(i).click();
        }
    }//end of test
    @AfterSuite
    public void quitSeason() {
        driver.quit();
    }//emd of after suit
}
