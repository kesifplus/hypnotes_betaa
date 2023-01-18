package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_052_StepDef extends BasePage {

    @Given("assert Add new problem button is clickable")
    public void assert_add_new_problem_button_is_clickable() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getLoginRegisterPage().addNewProblemButton.isDisplayed());
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getLoginRegisterPage().addNewProblemButton.isEnabled());


    }

}
