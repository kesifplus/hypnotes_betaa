package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_046_StepDef extends BasePage {

    @When("user clicks on Add Client Button")
    public void userClicksOnAddClientButton() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().addClientButton.click();
    }
    @When("user enters {string}, {string}")
    public void user_enters(String firstname, String lastname) {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().addClientFirstName.sendKeys(firstname);
        getLoginRegisterPage().addClientLastName.sendKeys(lastname);
        BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(getLoginRegisterPage().addClientAddClientButton);
    }
    @When("user clicks on Add Client button")
    public void user_clicks_on_add_client_button() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getLoginRegisterPage().addClientAddClientButton);
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().addClientYes.click();
    }

    @Given ("user search {string}")
        public void userSearch(String Name) {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().searchClientsInput.sendKeys(Name);
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().vievDetails.click();
    }

    @Given("user clicks on the Presenting Issues")
    public void user_clicks_on_the_presenting_issues() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().presentingIssueButton.click();
    }
    @Given("user clicks addNewProblemButton")
    public void user_clicks_add_new_problem_button() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().addNewProblemButton.click();
    }
    @Given("user creates a new problem")
    public void user_creates_a_new_problem() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().nameOfCC.sendKeys("Huseyin");
        getLoginRegisterPage().addNewProblemSubmit.click();
    }
    @Given("user clicks on client info")
    public void user_clicks_on_client_info() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().clientInfoButton.click();
        BrowserUtilities.waitFor(2);
        BrowserUtilities.scrollToElement(getLoginRegisterPage().bottomPresentingIssue);
    }
    @When("user clicks bottom Presenting Issue")
    public void user_clicks_bottom_presenting_issue() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().bottomPresentingIssue.click();
        BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(getLoginRegisterPage().bottomPresentingIssueLastChild);
    }
    @Then("user assert problem")
    public void user_assert_problem() {
        BrowserUtilities.waitFor(3);
        String lastChild = getLoginRegisterPage().bottomPresentingIssueLastChild.getText();
        Assert.assertEquals("Huseyin", lastChild);
    }
    @When("user clicks Details")
    public void user_clicks_details() {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().presentingIssueDetails.click();
    }
    @Then("user assert {string}")
    public void user_assert_huseyin_gunaydin(String title) {
        BrowserUtilities.waitFor(3);
        Assert.assertEquals(title, getLoginRegisterPage().presentingIssueTitle.getText());
    }

}
