package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_060_StepDef extends BasePage {
    @Then("user clicks on the Sessions Link")
    public void user_clicks_on_the_sessions_link() {
        getSessionPage().sessionsLink.click();
    }
    @Then("user clicks on Add New Session Button")
    public void user_clicks_on_add_new_session_button() {
        getSessionPage().addNewSessionButton.click();
    }
    @Then("user clicks on Associated Problem view Box")
    public void user_clicks_on_associated_problem_view_box() {
        BrowserUtilities.clickWithJS(getSessionPage().associatedProblemLink);
    }
    @Then("user verifies -Problem is successfully linked.- alert")
    public void user_verifies_problem_is_successfully_linked_alert() {
        BrowserUtilities.waitForVisibility(getSessionPage().problemIsSuccessfullyLinkedAlert,3);
        Assert.assertTrue(getSessionPage().problemIsSuccessfullyLinkedAlert.isDisplayed());
    }
    @Then("user verifies -Problem is successfully unlinked.- alert")
    public void user_verifies_problem_is_successfully_unlinked_alert() {
        BrowserUtilities.waitForVisibility(getSessionPage().problemIsSuccessfullyUnlinkedAlert,3);
        Assert.assertTrue(getSessionPage().problemIsSuccessfullyUnlinkedAlert.isDisplayed());
    }
    @Then("user clicks and pass Key Points Box")
    public void user_clicks_and_pass_key_points_box() {
        getSessionPage().keyPointsBox.click();
        getSessionPage().keyPointsBox.sendKeys(Keys.TAB);
    }
    @Then("user verifies -Note updated- alert")
    public void user_verifies_note_updated_alert() {
        BrowserUtilities.waitForVisibility(getSessionPage().noteUpdatedAlert,3);
        Assert.assertTrue(getSessionPage().noteUpdatedAlert.isDisplayed());
    }
    @Then("user clicks and pass After Thoughts Box")
    public void user_clicks_and_pass_after_thoughts_box() {
        getSessionPage().afterThoughtsBox.click();
        getSessionPage().afterThoughtsBox.sendKeys(Keys.TAB);
    }
    @Then("user verifies -After thoughts updated- alert")
    public void user_verifies_after_thoughts_updated_alert() {
        BrowserUtilities.waitForVisibility(getSessionPage().afterThoughtsUpdatedAlert,3);
        Assert.assertTrue(getSessionPage().afterThoughtsUpdatedAlert.isDisplayed());
    }
    @Then("user clicks and pass Application And Suggestions Box")
    public void user_clicks_and_pass_application_and_suggestions_box() {
        getSessionPage().applicationsAndSuggestionsBox.click();
        getSessionPage().applicationsAndSuggestionsBox.sendKeys(Keys.TAB);
    }
    @Then("user deletes the session")
    public void user_deletes_the_session() {
        BrowserUtilities.clickWithJS(getSessionPage().deleteSessionButton);
        BrowserUtilities.clickWithJS(getSessionPage().areYouSureToDeleteYesButton);
    }
    @And("user verifies -Session is successfully deleted.- alert")
    public void userVerifiesSessionIsSuccessfullyDeletedAlert() {
        BrowserUtilities.waitForVisibility(getSessionPage().sessionIsSuccessfullyDeletedAlert,3);
        Assert.assertTrue(getSessionPage().sessionIsSuccessfullyDeletedAlert.isDisplayed());
    }
    @Then("enter Key Points Box new value")
    public void enter_key_points_box_new_value() {
        getSessionPage().keyPointsBox.click();
        getSessionPage().keyPointsBox.sendKeys(Faker.instance().name().name());
        getSessionPage().keyPointsBox.sendKeys(Keys.TAB);
    }
    @Then("enter After Thoughts Box new value")
    public void enter_after_thoughts_box_new_value() {
        getSessionPage().afterThoughtsBox.click();
        getSessionPage().afterThoughtsBox.sendKeys(Faker.instance().name().name());
        getSessionPage().afterThoughtsBox.sendKeys(Keys.TAB);
    }
    @Then("enter Application And Suggestions Box new value")
    public void enter_application_and_suggestions_box_new_value() {
        getSessionPage().applicationsAndSuggestionsBox.click();
        getSessionPage().applicationsAndSuggestionsBox.sendKeys(Faker.instance().name().name());
        getSessionPage().applicationsAndSuggestionsBox.sendKeys(Keys.TAB);
    }


}