package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;

public class US_002_StepDef extends BasePage {


    @Then("assert titles are visible")
    public void assert_titles_are_visible() {

        for (int i = 0; i < getHomePage().barButtons.size(); i++) {
            Assert.assertTrue(getHomePage().barButtons.get(i).isDisplayed());
        }
    }

    @Then("assert titles are clickable")
    public void assert_titles_are_clickable() {
        for (int i = 0; i < getHomePage().barButtons.size(); i++) {
            Assert.assertTrue(getHomePage().barButtons.get(i).isEnabled());
        }

    }


}



