package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_045_StepDef extends BasePage {

    @Then("assert that {string} page open")
    public void assert_that_page_open(String title) {
        BrowserUtilities.waitFor(2);
        Assert.assertEquals(title, getclientInfoPage().clientInfo.getText());
    }

    @Then("verify that all buttons at the top of the page are displayed")
    public void verify_that_all_buttons_at_the_top_of_the_page_are_displayed() {
        for (int i = 0; i < getclientInfoPage().topTitles.size(); i++) {
            Assert.assertTrue(getclientInfoPage().topTitles.get(i).isDisplayed());
        }
    }
    @Then("verify that all buttons at the top of the page are clickable")
    public void verifyThatAllButtonsAtTheTopOfThePageAreClickable() {
        for (int i = 0; i < getclientInfoPage().topTitles.size(); i++) {
            Assert.assertTrue(getclientInfoPage().topTitles.get(i).isEnabled());
        }
    }
    @Then("verify that all buttons at the bottom of the page are displayed")
    public void verify_that_all_buttons_at_the_bottom_of_the_page_are_displayed() {
        BrowserUtilities.waitFor(3);
        for (int i = 0; i < getclientInfoPage().subTitles.size(); i++) {
            Assert.assertTrue(getclientInfoPage().subTitles.get(i).isDisplayed());
        }
    }
    @Then("verify that all buttons at the bottom of the page are clickable")
    public void verifyThatAllButtonsAtTheBottomOfThePageAreClickable() {
        for (int i = 0; i < getclientInfoPage().subTitles.size() ; i++) {
            Assert.assertTrue(getclientInfoPage().subTitles.get(i).isEnabled());
        }
    }
}