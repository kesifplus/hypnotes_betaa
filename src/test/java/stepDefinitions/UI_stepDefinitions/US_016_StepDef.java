package stepDefinitions.UI_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;

import java.util.List;

public class US_016_StepDef extends BasePage {


    @When("user enters {string} to name input")
    public void userEntersToNameInput(String name) {
        getHomePage().name.sendKeys(name);
    }

    @And("user enters {string} to surname input")
    public void userEntersToSurnameInput(String surname) {
        getHomePage().surname.sendKeys(surname);
    }

    @And("user enters {string} to email input")
    public void userEntersToEmailInput(String email) {
        getHomePage().email.sendKeys(email);
    }

    @When("user enters {string}")
    public void userEnters(String password) {
        getHomePage().password.sendKeys(password);
    }

    @Then("user verifies green list's size is {string}")
    public void userVerifiesGreenListSSizeIs(String green) {
        int greenInt = Integer.parseInt(green);
        Assert.assertEquals(greenInt, getHomePage().greenList.size());
    }

    @And("user verifies red list's size is {string}")
    public void userVerifiesRedListSSizeIs(String red) {
        int redInt = Integer.parseInt(red);
        Assert.assertEquals(redInt, getHomePage().redList.size());
    }

    @And("user verifies sign up button is not clickable")
    public void userVerifiesSignUpButtonIsNotClickable() {
        Assert.assertFalse(getHomePage().invalidSignup.isEnabled());
//        Assert.assertTrue(!hp.signupButton.isEnabled());
    }

    @And("user verifies sign up button is clickable")
    public void userVerifiesSignUpButtonIsClickable() {
        Assert.assertTrue(getHomePage().validSignup.isEnabled());
    }

    @When("user enters password, then user verifies sizes of the lists")
    public void userEntersPasswordThenUserVerifiesSizesOfTheLists(DataTable dt) {
        List<String> passwords = dt.column(0);
        List<String> greenList = dt.column(1);
        List<String> redList = dt.column(2);

        for (int i = 0; i < passwords.size(); i++) {
            getHomePage().password.sendKeys(passwords.get(i));
            Assert.assertEquals(Integer.parseInt(greenList.get(i)), getHomePage().greenList.size());
            Assert.assertEquals(Integer.parseInt(redList.get(i)), getHomePage().redList.size());
            Assert.assertFalse(getHomePage().invalidSignup.isEnabled());
            getHomePage().password.clear();
        }
    }
}




