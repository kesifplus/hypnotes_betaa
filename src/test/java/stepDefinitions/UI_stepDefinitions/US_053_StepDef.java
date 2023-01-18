package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_053_StepDef extends BasePage {

    @Then("user assert alert message")
    public void user_assert_alert_message() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().subjectiveNameOfCC.click();
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().subjectiveBriefStatement.click();
        BrowserUtilities.waitFor(2);
        String AlertMessage = getLoginRegisterPage().presentingIssueAlert.getText();
        Assert.assertEquals("Successfully updated.", getLoginRegisterPage().presentingIssueAlert.getText());
    }
    @Then("user Assert that Objective, Assessment, Plan, Additional notes are clickable and visible")
    public void user_assert_that_objective_assessment_plan_additional_notes_are_clickable_and_visible() {

        for (int i = 0; i <getLoginRegisterPage().presentingIssueList.size(); i++) {
            BrowserUtilities.waitFor(3);
            System.out.println( getLoginRegisterPage().presentingIssueList.get(i).getText());
            Assert.assertTrue(getLoginRegisterPage().presentingIssueList.get(i).isEnabled());
            Assert.assertTrue(getLoginRegisterPage().presentingIssueList.get(i).isDisplayed());

        }


    }
}
