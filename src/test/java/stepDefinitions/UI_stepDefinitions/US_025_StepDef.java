package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_025_StepDef extends BasePage {
    @When("click the login page")
    public void clickTheLoginPage() {

       BrowserUtilities.waitFor(3);
        getLoginRegisterPage().login.click();
    }

    @Then("user verifies login page {string}")
    public void userVerifiesLoginPage(String url) {
        BrowserUtilities.waitFor(2);
        Assert.assertEquals(url, Driver.getDriver().getCurrentUrl());
    }

    @When("enter the {string}")
    public void enter_the(String email) {
        getLoginRegisterPage().emailBox.sendKeys(email);

    }

    @And("enter the password {string}")
    public void enterThePassword(String password) {
        getLoginRegisterPage().passwordBox.sendKeys(password);
    }

    @When("click the login button")
    public void click_the_login_button() {
        BrowserUtilities.clickWithJS(getLoginRegisterPage().submitButton);
    }


    @Then("dasboard calendar page's url should open")
    public void dasboardCalendarPageSUrlShouldOpen() {
        String expectedUrl="https://test.hypnotes.net/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }



}
