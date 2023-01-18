
package UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_065_StepDef extends BasePage {
    @When("user clicks services button.")
    public void userClicksServicesButton() {
        getclientInfoPage().service.click();
        BrowserUtilities.waitFor(3);
    }

    @Then("user clicks individual session button.")
    public void userClicksIndividualSessionButton() {
        BrowserUtilities.clickWithJS(getclientInfoPage().individualSession);
        BrowserUtilities.waitFor(3);
    }

    @And("add new individual sessions button is visible.")
    public void addNewIndividualSessionsButtonIsVisible() {
        getclientInfoPage().addNewIndividualSession.isDisplayed();
    }

    @And("generate scheduler url button is visible.")
    public void generateSchedulerUrlButtonIsVisible() {
        getclientInfoPage().generateSchedulerUrl.isDisplayed();
    }

    @And("user clicks packages section.")
    public void userClicksPackagesSection() {
        BrowserUtilities.clickWithJS(getclientInfoPage().packages);
        BrowserUtilities.waitFor(3);
    }

    @And("add new package button is visible.")
    public void addNewPackageButtonIsVisible() {
        getclientInfoPage().addNewPackage.isDisplayed();
    }

    @Then("generate scheduler url1 button is visible.")
    public void generate_scheduler_url1_button_is_visible() {
        getclientInfoPage().generateSchedulerUrl.isDisplayed();

    }

    @And("user clicks group session button.")
    public void userClicksGroupSessionButton() {
        getclientInfoPage().groupSession.click();
        BrowserUtilities.waitFor(4);
    }

    @And("add new session button is visible.")
    public void addNewSessionButtonIsVisible() {
       getclientInfoPage().addNewSession.isDisplayed();
    }

    @And("add generated scheduler url button is visible.")
    public void addGeneratedSchedulerUrlButtonIsVisible() {
        getclientInfoPage().generateSchedulerUrl.isDisplayed();
    }
}
