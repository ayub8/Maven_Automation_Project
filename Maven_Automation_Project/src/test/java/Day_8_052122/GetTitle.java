package Day_8_052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle {
    public static void main(String[] args) {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        //Navigate to hotels.com
        driver.navigate().to("https://www.google.com");

        //capture the title of the page and compare with the expected 'google'
        String ActualTitle = driver.getTitle();

        // Comparing the actual title with the expected title.
        if (ActualTitle.equals("GOOGLE")){
            System.out.println("Title matched");
        }
        else {
            System.out.println("Title doesn't match the Actual title is " + ActualTitle);
        }

    }
}
