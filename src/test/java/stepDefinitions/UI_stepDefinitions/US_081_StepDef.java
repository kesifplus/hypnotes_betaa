package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.ProfilePage;
import utilities.Driver;

public class US_081_StepDef extends BasePage {
    ProfilePage pp = new ProfilePage();
    Driver driver;

    @Given("user clicks Specialties&Certifications Text")
    public void user_clicks_specialties_certifications_text() {
        pp.SpecialtiesAndCertifications.click();

    }
    @Given("user clicks Add New Specialty Button")
    public void user_clicks_add_new_specialty_button() {
        pp.addNewSpecialty.click();

    }
    @Given("user verifies add Specialty text visible")
    public void user_verifies_add_specialty_text_visible() {
        Assert.assertEquals("Add Specialty", pp.addSpecialtyTitle.getText());
    }

    @Given("user clicks on specialty dropdown")
    public void user_clicks_on_specialty_dropdown() {
        pp.selectOneSpecialtyDropDown.click();

    }
    @Given("user selects any Speciality Name")
    public void user_selects_any_speciality_name() {

    }
    @When("user clicks create Button")
    public void user_clicks_create_button() {

    }
    @Then("user verifies {string} message is visible")
    public void user_verifies_message_is_visible(String string) {

    }
    @Then("user clicks Add Specialty Cancel button")
    public void user_clicks_add_specialty_cancel_button() {


    }
}
