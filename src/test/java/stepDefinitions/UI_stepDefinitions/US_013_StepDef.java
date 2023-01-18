package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_013_StepDef extends BasePage {

    @Given("goes to https:\\/\\/test.hypnotes.net\\/")
    public void goes_to_https_test_hypnotes_net() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("clicks the sign up button.")
    public void clicks_the_sign_up_button() {
        getLoginRegisterPage().signUpButton.click();

    }
    @Given("clicks {string}.")
    public void clicks(String string) {
        getLoginRegisterPage().clientButton.click();
        BrowserUtilities.waitFor(5);
    }
    @Given("clicks on the {string} icon.")
    public void clicks_on_the_icon(String string) {
        getLoginRegisterPage().FacebookIcon.click();
        BrowserUtilities.waitFor(5);
    }
    @When("User clicks google account.")
    public void user_clicks_google_account() {
        //lp.inputEmail.click();
        //lp.inputEmail.sendKeys("hypnotes2022cl1@gmail.com", Keys.ENTER);
        getLoginRegisterPage().facebookCookies.click();
        BrowserUtilities.waitFor(5);

        System.out.println(getLoginRegisterPage().facebookTitle.getText());
        String FacebookLink = getLoginRegisterPage().facebookTitle.getText();
        System.out.println(FacebookLink);
        Assert.assertEquals("Bei Facebook anmelden",FacebookLink);
        // lp.facebookEmail.sendKeys("hypnotes2022cl2@gmail.com");
        // lp.facebookPassword.sendKeys("Aydinlik2023/");
        // lp.facebookLoginButton.click();
        // lp.googleNextButton.click();

    }
    @Then("User checks whether the confirmation mail has arrived.")
    public void user_checks_whether_the_confirmation_mail_has_arrived() {
        //  String CurrentURL = Driver.getDriver().getCurrentUrl();
        //  System.out.println(CurrentURL);

    }
}
