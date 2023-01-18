package stepDefinitions.UI_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BasePage;
import pages.ProfilePage;
import utilities.BrowserUtilities;

import java.sql.SQLOutput;

public class US_080_StepDef extends BasePage {


    @Given("user clicks Profile")
    public void user_clicks_profile() {
        getProfilePage().profileButton.click();

    }

    @Given("user clicks Experiences")
    public void user_clicks_experiences() {
      getProfilePage().experiencesButton.click();

    }

    @Given("user clicks Add New Experience")
    public void user_clicks_add_new_experience() {
        getProfilePage().addNewExperienceButton.click();
    }

    @Given("user verifies {string} is visible text")
    public void user_verifies_is_visible_text(String createANewExperience) {
        System.out.println(createANewExperience);
        System.out.println(getProfilePage().createANewExperienceText.getText());
        Assert.assertEquals(createANewExperience, getProfilePage().createANewExperienceText.getText());
    }

    @Then("user verifies headings are visible")
    public void user_verifies_headings_are_visible(DataTable dataTable) {
        System.out.println(dataTable.column(0));
        System.out.println(dataTable.column(1));
        System.out.println(dataTable.column(2));
        System.out.println(dataTable.column(3));
        System.out.println(dataTable.column(4));
        System.out.println(getProfilePage().experienceCompanyName.getText());
        System.out.println(getProfilePage().experienceJobTitle.getText());
        System.out.println(getProfilePage().experienceStartDate.getText());
        System.out.println(getProfilePage().experienceEndDate.getText());
        System.out.println(getProfilePage().experienceDescription.getText());
      //  Assert.assertEquals(dataTable.column(0), getProfilePage().experienceCompanyName.getText());
    }

    @Then("User verifies headings are functional")
    public void user_verifies_headings_are_functional(DataTable dataTable) {
       Assert.assertTrue(getProfilePage().experienceCompanyNameInput.isEnabled());
        Assert.assertTrue(getProfilePage().experienceJobtitleInput.isEnabled());
        Assert.assertTrue(getProfilePage().experienceStartDateInput.isEnabled());
        Assert.assertTrue(getProfilePage().experienceEndDateInput.isEnabled());
        Assert.assertTrue(getProfilePage().experienceDescriptionInput.isEnabled());
    }

    @Given("user verifies input boxes are visible")
    public void user_verifies_input_boxes_are_visible(DataTable dataTable) {

    }

    @Then("User verifies input boxes are functional")
    public void user_verifies_input_boxes_are_functional(DataTable dataTable) {

    }

    @Given("user enters Company Name {string}")
    public void user_enters_company_name(String name) {
        BrowserUtilities.waitFor(3);
        getProfilePage().experienceCompanyNameInput.sendKeys(name);

    }

    @Given("user enters Job Title {string}")
    public void user_enters_job_title(String title) {
        BrowserUtilities.waitFor(3);
        getProfilePage().experienceJobtitleInput.sendKeys(title);
    }

    @Given("user enters Start Date")
    public void user_enters_start_date() {
        BrowserUtilities.waitFor(5);
      getProfilePage().experienceStartDateInput.click();
        BrowserUtilities.waitFor(5);
        getProfilePage().experienceStartDateInput.sendKeys("01/02/2023", Keys.ENTER);
    }
    @Given("user enters End Date")
    public void user_enters_end_date() {
        BrowserUtilities.waitFor(3);
        getProfilePage().experienceEndDateInput.click();
        getProfilePage().experienceEndDateInput.sendKeys();
    }
    @Given("user enter Description {string}")
    public void user_enter_description(String description) {
        BrowserUtilities.waitFor(3);
        getProfilePage().experienceDescriptionInput.sendKeys(description);
    }

    @Then("user clicks SaveButton")
    public void user_clicks_save_button() {
        BrowserUtilities.waitFor(3);
        getProfilePage().experienceSaveButton.click();

    }

    @Given("user clicks CancelButton")
    public void user_clicks_cancel_button() {

    }

    @Given("user verifies Experiences added message is visible")
    public void user_verifies_experiences_added_message_is_visible() {
BrowserUtilities.waitFor(3);
        Assert.assertEquals("Experience is added", getProfilePage().alertExperienceIsAddMessage.getText());

    }
}
