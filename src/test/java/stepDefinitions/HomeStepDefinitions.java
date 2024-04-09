package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.commonPage;

public class HomeStepDefinitions extends HomePage {

    pages.commonPage commonPage = new commonPage();

    pages.HomePage homePage = new HomePage();

    @Given("I navigate to LexisNexis home page")
    public void iNavigateToLexisNexisHomePage() {
        commonPage.accessHomePage();
    }

    @When("I see the cookies pop-up accepts cookies")
    public void iSeeTheCookiesPopUpAcceptsCookies() {
        commonPage.acceptCookies();
    }

    @Then("I see Cookies pop-up should be closed")
    public void iSeeCookiesPopUpShouldBeClosed() {
        commonPage.cookiesWindowClosed();
    }
    @And("I see {string} and click")
    public void iSeeAndClick(String heading) {
        commonPage.verifyHeading(heading);
    }

    @And("I click on Choose your Industry option")
    public void iClickOnChooseYourIndustryOption() {
        commonPage.clickOnIndustryTab();
    }

    @And("I choose Financial services option")
    public void iChooseFinancialServicesOption() {
        commonPage.clickOnFinacialServicesOption();
    }

    @And("I see the {string} and click")
    public void iSeeTheAndClick(String option) {
        homePage.verifyAndClick(option);
    }
}
