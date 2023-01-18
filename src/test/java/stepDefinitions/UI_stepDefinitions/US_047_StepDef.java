package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_047_StepDef extends BasePage {


    @Then("user click sessions")
    public void user_click_sessions() {
        BrowserUtilities.clickWithJS(getLoginRegisterPage().sessions);
        BrowserUtilities.waitFor(3);
    }

    @Then("user assert date and details section")
    public void user_assert_date_and_details_section() {
        Assert.assertTrue(getLoginRegisterPage().detailsection.isDisplayed());
        BrowserUtilities.waitFor(3);
    }







}
