package pages;

public class HomePage extends commonMethods {

    public void verifyAndClick(String option) {
        String xpath = String.format("//div[@class='subpage-title' and text()='%s']", option);
        click("xpath", xpath);
    }
}
