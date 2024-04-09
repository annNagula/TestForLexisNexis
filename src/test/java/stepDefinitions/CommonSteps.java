package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.commonMethods;

/**
 * Created by Anu on 09/04/24.
 */
public class CommonSteps {
    pages.commonMethods commonMethods = new commonMethods();
    @Then("Im on {string} page")
    public void im_on_vsip_page(String pageTitle) {
        commonMethods.isPageTitleDisplayed(pageTitle);
    }
}
