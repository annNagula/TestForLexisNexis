package stepDefinitions;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Anu on 09/04/24.
 */

public interface WebDriverInstance {
    WebDriver driver = Driver.GetWebDriver();
    WebDriverWait waitFor = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

}