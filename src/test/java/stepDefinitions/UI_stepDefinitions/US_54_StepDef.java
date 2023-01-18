package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_54_StepDef extends BasePage {

    @And("delete issue button is visible.")
    public void deleteIssueButtonIsVisible() {
        Assert.assertTrue(getclientInfoPage().deleteIssueButton.isDisplayed());
    }

    @And("delete issue button is enable.")
    public void deleteIssueButtonIsEnable() {
        Assert.assertTrue(getclientInfoPage().deleteIssueButton.isEnabled());
    }

    @And("delete issue button is clickable.")
    public void deleteIssueButtonIsClickable() {
        BrowserUtilities.clickWithJS(getclientInfoPage().deleteIssueButton);
        BrowserUtilities.waitFor(3);
    }


    @And("No button is enable.")
    public void noButtonIsEnable() {
        Assert.assertTrue(getclientInfoPage().noButton.isEnabled());
    }

    @And("Yes button is enable.")
    public void yesButtonIsEnable() {
        Assert.assertTrue(getclientInfoPage().yesButton.isEnabled());
    }

    @And("Yes button is clickable.")
    public void yesButtonIsClickable() {
        BrowserUtilities.clickWithJS(getclientInfoPage().yesButton);
        BrowserUtilities.waitFor(3);
    }


    @Then("delete issue button not visible.")
    public void deleteIssueButtonNotVisible() {
        // Assert.assertFalse(getpresentingIssuePage().deleteIssue.isDisplayed()); Ask
    }



}
