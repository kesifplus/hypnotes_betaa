package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BasePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_019_StepDef extends BasePage {


    @Given("user goes to register page")
    public void userGoesToRegisterPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user name button is visible")
    public void userNameButtonIsVisible() {
        Assert.assertTrue(getRegisterPage().nameButton.isDisplayed());
    }

    @And("user email button is visible")
    public void userEmailButtonIsVisible() {
        Assert.assertTrue(getRegisterPage().emailButton.isDisplayed());
    }

    @And("user password button is visible")
    public void userPasswordButtonIsVisible() {
        Assert.assertTrue(getRegisterPage().passwordButton.isDisplayed());
    }

    @And("user name button is enable")
    public void userNameButtonIsEnable() {
        Assert.assertTrue(getRegisterPage().nameButton.isEnabled());
    }

    @And("user email button is enable")
    public void userEmailButtonIsEnable() {
        Assert.assertTrue(getRegisterPage().emailButton.isEnabled());
    }

    @And("user password button is enable")
    public void userPasswordButtonIsEnable() {
        Assert.assertTrue(getRegisterPage().passwordButton.isEnabled());



    }

    @When("user enters {string} {string} {string}")
    public void user_enters(String fullname, String email, String password) {
        getRegisterPage().nameButton.sendKeys(fullname);
        getRegisterPage().emailButton.sendKeys(email);
        getRegisterPage().passwordButton.sendKeys(password+ Keys.ENTER);


    }
    @Then("verify that the {string} prompt appears")
    public void verify_that_the_prompt_appears(String promtMessage) {

        String validationMessage = getRegisterPage().emailButton.getAttribute("validationMessage");
        Assert.assertEquals(promtMessage,validationMessage);

    }






}

