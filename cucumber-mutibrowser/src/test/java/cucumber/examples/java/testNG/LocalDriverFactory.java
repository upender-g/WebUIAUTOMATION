package cucumber.examples.java.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Based on the LocalDriverFactory found at: onrationaleemotions.wordpress.com
 * @author: Confusions Personified
 * @src: http://rationaleemotions.wordpress.com/2013/07/31/parallel-webdriver-executions-using-testng/
 */
public class LocalDriverFactory {
    public static WebDriver createInstance(String browserName) {
        WebDriver driver;
        browserName = (browserName != null) ? browserName : "FIREFOX";

        switch (Browser.valueOf(browserName.toUpperCase())) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver","driver/Linux/geckodriver");
                driver = new FirefoxDriver();
                break;
            case IE:
                System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "driver/Linux/chromedriver");
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        // maximize browser's window on start
        driver.manage().window().maximize();
        return driver;
    }

    private static enum Browser {
        FIREFOX,
        CHROME,
        IE,
        HTMLUNIT,
        HTMLUNITJS;
    }
}