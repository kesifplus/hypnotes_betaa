package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_059_StepDef extends BasePage {
    @Given("user clicks Sessions Button")
    public void user_clicks_sessions_button() {
        getclientInfoPage().sessions.click();

    }

    @Given("user scroll untelDeleteButton")
    public void user_scroll_untel_delete_button() {
        BrowserUtilities.scrollToElement(getclientInfoPage().deleteButton);
    }

    @Given("user clicks deleteButton")
    public void user_clicks_delete_button() {
        getclientInfoPage().deleteButton.click();

    }

    @When("user clicks yesButton")
    public void user_clicks_yes_button() {
        getclientInfoPage().deleteYesButton.click();
    }

    @Then("assert alert message")
    public void assert_alert_message() {
        String alertMessage = "Session is successfully deleted.";
        Assert.assertEquals(alertMessage,getclientInfoPage().deleteAlertMessage);
    }
}
