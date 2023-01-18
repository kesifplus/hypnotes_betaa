package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_042_StepDef extends BasePage {

    @When("assert Search Client is visible and clickable")
    public void assert_search_client_is_visible_and_clickable() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().searchClientInput.isDisplayed());
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().searchClientInput.isEnabled());
    }

    @Then("assert Search Client Button is visible and clickable")
    public void assert_search_client_button_is_visible_and_clickable() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().searchClientInputBtn.isDisplayed());
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().searchClientInputBtn.isEnabled());
    }

    @Then("assert Name in Dropdown Functionality is visible and clickable")
    public void assert_name_in_dropdown_functionality_is_visible_and_clickable() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().searchClientDropdownName.isDisplayed());
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().searchClientDropdownName.isEnabled());
    }

    @Then("assert Surname in Dropdown Functionality is visible and clickable")
    public void assert_surname_in_dropdown_functionality_is_visible_and_clickable() {
        BrowserUtilities.waitFor(3);
        getclientInfoPage().searchClientDropdownName.click();
        BrowserUtilities.waitFor(3);
        getclientInfoPage().searchClientDropdownSurname.click();
        Assert.assertTrue(getclientInfoPage().searchClientDropdownSurname.isDisplayed());
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().searchClientDropdownSurname.isEnabled());
    }

    @Then("assert Date Added in Dropdown Functionality is visible and clickable")
    public void assert_date_added_in_dropdown_functionality_is_visible_and_clickable() {

    }
}
