package Day_11_052322;

import ReusableClass.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Boolean_with_Checkbox {
    WebDriver driver;

    // A method that is executed before the test suite.
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();
    }//end of before suite annotation
    @Test
    public void Yahoo_Stay_Signed_In_Checkbox_Verification() throws InterruptedException {
        //navigate to usps
        driver.navigate().to("https://www.yahoo.com");
        //click on Sign in
        Reusable_Actions.clickAction(driver,"//*[text()='Sign in']","Sign In");
        //verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver,10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
        System.out.println("Is element checked? " + elementState);
    }//end of test
    @AfterSuite
    public void quitSeason() {
        driver.quit();
    }//emd of after suit
}
