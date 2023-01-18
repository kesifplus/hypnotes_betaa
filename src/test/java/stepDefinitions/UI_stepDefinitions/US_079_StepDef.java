package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_079_StepDef extends BasePage {
    @Given("user clicks add New education")
    public void user_clicks_add_new_education() {
        BrowserUtilities.waitFor(3);
        getProfilePage().addNewEducationButton.click();
    }

    @Given("user enters School Name {string}")
    public void user_enters_school_name(String name) {
        BrowserUtilities.waitFor(3);
        getProfilePage().educationSchollName.sendKeys(name);

    }
    @Given("user enters department {string}")
    public void user_enters_department(String department) {
        BrowserUtilities.waitFor(3);
        getProfilePage().educationDepartment.sendKeys(department);
    }
    @Given("user enters Create a new Education Start Date")
    public void user_enters_create_a_new_education_start_date() {
        BrowserUtilities.waitFor(3);
        getProfilePage().educationStartDate.sendKeys("01/02/2023", Keys.ENTER);
    }
    @When("user clicks Education save button")
    public void user_clicks_education_save_button() {
        BrowserUtilities.waitFor(3);
        getProfilePage().educationSaveButton.click();


    }
    @Then("user verifies alert messages {string}")
    public void user_verifies_alert_messages(String message) {
        BrowserUtilities.waitFor(3);
        System.out.println("------------------------" + getProfilePage().alertMessage.getText());
        System.out.println("--------------------------" + message);
        Assert.assertEquals(message, getProfilePage().alertMessage.getText());
    }
}
