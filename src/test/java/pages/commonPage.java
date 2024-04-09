package pages;

import org.openqa.selenium.By;
import utils.Configuration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

/**
 * Created by Anu on 09/04/24.
 */
public class commonPage extends commonMethods {

    public void accessHomePage() {
        navigateToPage(Configuration.getConfiguration(Configuration.Environment.valueOf(System.getProperty("environment"))));
    }
    public void acceptCookies() {
        // Check if cookies pop-up is present
        WebElement cookiesPopup = driver.findElement(By.xpath("//*[@id='onetrust-banner-sdk']/div)"));
        if (cookiesPopup.isDisplayed()) {
            WebElement acceptButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
            acceptButton.click();
        }
    }
    public void cookiesWindowClosed() {
        // Verify cookies pop-up is closed
        WebElement cookiesPopup = driver.findElement(By.id("cookies-popup"));
        wait.until(ExpectedConditions.invisibilityOf(cookiesPopup));
    }
    public void clickOnIndustryTab() {
        click("xpath","//a[text()='Choose Your Industry']");
    }
    public void clickOnFinacialServicesOption() {
        click("xpath","//div[text()='Financial Services ']");
    }

}
