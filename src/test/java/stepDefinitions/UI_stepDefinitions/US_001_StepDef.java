package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001_StepDef extends BasePage{

    @Given("User goes to website")
    public void userGoesToWebsite() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Assert.assertTrue(getHomePage().login.isDisplayed());
    }

    @Then("User verifies url {string}")
    public void user_verifies_url(String string) {
        Assert.assertEquals(string, Driver.getDriver().getCurrentUrl());
    }

    @And("User verifies title and homepage")
    public void userVerifiesTitleAndHomepage() {
        String title = (getHomePage().hpTitle1.getText() + getHomePage().hpTitle2.getText());
        Assert.assertEquals(title, "HYPNOTESNOTES");
    }


}
