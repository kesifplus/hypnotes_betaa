package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_010_StepDef extends BasePage {
    
    @When("User commes below of Webseite")
    public void user_commes_below_of_webseite() {
        BrowserUtilities.waitForVisibility(getHomePage().hpTitleEverythingMang, 5);
        BrowserUtilities.scrollToElement(getHomePage().hpTitleEverythingMang);
    }
    @Then("User verifies all titles {string}")
    public void userVerifiesAllTitles(String title) {
        switch (title) {
            case "T1":
                Assert.assertEquals(title, getHomePage().hpTitleEverythingMang.getText());
                break;
            case "T2":
                Assert.assertEquals(title, getHomePage().subtitleDifferent.getText());
                break;
            case "T3":
                Assert.assertEquals(title, getHomePage().subtitleMadefor.getText());
                break;
            case "T4":
                Assert.assertEquals(title, getHomePage().subtitleFreemedical.getText());
                break;
        }
    }

    @Then("Section is to control")
    public void sectionIsToControl() {
        Assert.assertTrue(getHomePage().textDifferent.isDisplayed());
        Assert.assertTrue(getHomePage().textFreeMedical.isDisplayed());
        Assert.assertTrue(getHomePage().textMadefor.isDisplayed());
    }


}
