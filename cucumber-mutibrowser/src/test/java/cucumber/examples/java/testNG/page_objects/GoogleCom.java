package cucumber.examples.java.testNG.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by jay on 10/04/14.
 */
public class GoogleCom {

    private By search_box = By.name("q");
    private By search_button = By.name("btnK");
    private By search_results = By.cssSelector("li.g");
    private WebDriver driver;
    private WebDriverWait wait;
    private List<String> theSearchResults;

    public GoogleCom(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public void searchFor(String keywords) throws InterruptedException {
        this.driver.findElement(search_box).clear();
        this.driver.findElement(search_box).sendKeys(keywords);
        Thread.sleep(5000);
        this.driver.findElement(search_button).click();
    }

    public List<WebElement> getTheSearchResults() {
        return this.driver.findElements(search_results);
    }
}
