package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;
import java.rmi.UnexpectedException;
import java.util.List;

public class US_068_StepDef extends BasePage {
    Faker faker;
    Select select;
    Actions actions;
    String settingsUrl;
    List<WebElement> subLıst;

    @Given("user goes to therapist kostenfrei login page")
    public void userGoesToTherapistKostenfreiLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().login.click();
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().emailBox.sendKeys("ilyasisme@hotmail.com");
        getLoginRegisterPage().passwordBox.sendKeys("123Abc...");
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getLoginRegisterPage().submitButton);
        BrowserUtilities.waitFor(3);
    }

    @When("user clicks service on the dashboard")
    public void user_clicks_service_on_the_dashboard() {
        getclientInfoPage().service.click();
    }

    @When("user verifies Group Session")
    public void user_verifies_group_session() {
        Assert.assertTrue(getclientInfoPage().groupSessionButton.isDisplayed());
        getclientInfoPage().groupSessionButton.click();
    }

    @When("Add New Session is appear")
    public void add_new_session_is_appear() {
        Assert.assertTrue(getclientInfoPage().addNewSession.isDisplayed());
    }

    @When("user clicks Add New Session")
    public void user_clicks_add_new_session() {
        BrowserUtilities.waitFor(3);
        getclientInfoPage().addNewSession.click();
    }

    @When("page is displayed")
    public void page_is_displayed() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().showAllSubscriptionPlans.isDisplayed());
    }


    @And("schreib add Session Kenntnisse")
    public void schreibAddSessionKenntnisse() {
//        BrowserUtilities.waitFor(3);
//        try {
//            getclientInfoPage().addSessionName.sendKeys(faker.name().fullName());
//        } catch (NullPointerException exception) {
//            System.out.println("exception = " + exception);
//        }
//        BrowserUtilities.waitAndClick(getclientInfoPage().addSessionPrice);
//        getclientInfoPage().addSessionPrice.sendKeys("300");
//
//        BrowserUtilities.clickWithJS(getclientInfoPage().addSessionDuration);
//        select = new Select(getclientInfoPage().addSessionDuration);
//        select.selectByIndex(4);
//
    }

    @When("show all subsciption plans and cancel button are appear")
    public void show_all_subsciption_plans_and_cancel_button_are_appear() {
        Assert.assertTrue(getclientInfoPage().showAllSubscriptionPlans.getText(), true);
        Assert.assertTrue(getclientInfoPage().cancelButton.isDisplayed());

    }

    @When("user clicks show all subscription plans")
    public void user_clicks_show_all_subscription_plans() {
        getclientInfoPage().showAllSubscriptionPlans.click();
        Driver.getDriver().switchTo().window(settingsUrl);
    }

    @When("user verifies subscription page Basic, Standard, Premium, Enterprise details")
    public void user_verifies_subscription_page_basic_standard_premium_enterprise_details() {
        settingsUrl="https://test.hypnotes.net/dashboard/settings?key=3";
        subLıst = getclientInfoPage().subscriptionsList;
        Assert.assertEquals(settingsUrl, Driver.getDriver().getCurrentUrl());

        for (WebElement element : subLıst){
            Assert.assertTrue(element.isDisplayed());
            System.out.println(element.getText());
        }
    }

    @When("Basic, Standard, Premium, Enterprise {string} button are clickable on Subscription page")
    public void basic_standard_premium_enterprise_button_are_clickable_on_subscription_page(String string) {

    }

    @When("user clicks the Activate button and the payment options.")
    public void user_clicks_the_activate_button_and_the_payment_options() {

    }

    @When("Monthly, Yearly options are active on the Subscription page")
    public void monthly_yearly_options_are_active_on_the_subscription_page() {

    }

    @Then("Payment is completed with payment options\\(only one package)")
    public void payment_is_completed_with_payment_options_only_one_package() {

    }


}
