
package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.Set;

public class US_043_StepDef extends BasePage {

    @Then("user checks that Add Button is clickable and goes to the relevant page")
    public void userChecksThatAddButtonIsClickableAndGoesToTheRelevantPage() {
        getLoginRegisterPage().addClient.click();
       String AddClientUrl =  Driver.getDriver().getCurrentUrl();
        BrowserUtilities.waitFor(3);
        Assert.assertEquals("https://test.hypnotes.net/dashboard/add-client", AddClientUrl);
       Driver.getDriver().navigate().back();
       BrowserUtilities.waitFor(3);

    }

    @Then("user checks that Import Button is clickable and goes to the relevant page")
    public void checks_that_import_button_is_clickable_and_goes_to_the_relevant_page() {
        Assert.assertTrue(getLoginRegisterPage().importClients.isEnabled());
        getLoginRegisterPage().importClients.click();

        BrowserUtilities.waitFor(5);

        String importMothodTitle = getLoginRegisterPage().importMethodTitle.getText();
        BrowserUtilities.waitFor(5);
        System.out.println(importMothodTitle);
        Assert.assertEquals("Choose Import Method", importMothodTitle);



        getLoginRegisterPage().cancelButton.click();

    }

    @Then("user checks that Export Button is clickable and goes to the relevant page")
    public void checks_that_export_button_is_clickable_and_goes_to_the_relevant_page() {
        Assert.assertTrue(getLoginRegisterPage().exportClientsButton.isDisplayed());
        Assert.assertTrue(getLoginRegisterPage().exportClientsButton.isEnabled());
    }

    @Then("user checks that Start Meeting Button is clickable and goes to the relevant page")
    public void checks_that_start_meeting_button_is_clickable_and_goes_to_the_relevant_page() {
      String firstWindow = Driver.getDriver().getWindowHandle();
        getLoginRegisterPage().startMeetingButton.click();
        BrowserUtilities.waitFor(5);
        Set<String> windowAllWindows = Driver.getDriver().getWindowHandles();
        for (String Window:windowAllWindows){
                Driver.getDriver().switchTo().window(Window);
            }
            String secondWindow = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals("https://meet.hypnotes.net/", secondWindow);
            Driver.getDriver().switchTo().window(firstWindow);
    }

    @Then("user checks that Logout Button is clickable and exit from the page")
    public void checks_that_logout_button_is_clickable_and_exit_from_the_page() {
        getLoginRegisterPage().logoutButton.click();
        BrowserUtilities.waitFor(3);
        String loginPageUrl = Driver.getDriver().getCurrentUrl();
        BrowserUtilities.waitFor(3);
        Assert.assertEquals("https://test.hypnotes.net/login", loginPageUrl);
    }
}
