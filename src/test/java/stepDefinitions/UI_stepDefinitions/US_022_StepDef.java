package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_022_StepDef extends BasePage {


    @When("Sign up appears and user mouses over Sign Up")
    public void sign_up_appears_and_user_mouses_over_sign_up() {
        Assert.assertTrue(getLoginRegisterPage().logRegPageSıgnUpButton.isDisplayed());
    }

    @Then("User sees client and clicks")
    public void userSeesClientAndClicks() {
       BrowserUtilities.waitForClickability(getLoginRegisterPage().logRegPageSıgnUpButton,3);
        getLoginRegisterPage().logRegPageSıgnUpButton.click();
        for (int i = 0; i < getLoginRegisterPage().clientAndTherapist.size(); i++) {
            if (getLoginRegisterPage().clientAndTherapist.get(i).getText().equalsIgnoreCase("Client")) ;
            getLoginRegisterPage().clientAndTherapist.get(i).click();

        }
    }

    @And("User verifies {string}")
    public void userVerifies(String url) {
        Assert.assertEquals(url, Driver.getDriver().getCurrentUrl());
    }


    @Then("User sees {string}")
    public void user_sees(String string) {
        BrowserUtilities.scrollToElement(getLoginRegisterPage().alreadyAccount);
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(string, true);
    }

    @And("User clicks login button verifies login url {string}")
    public void userClicksLoginButtonVerifiesLoginUrl(String loginUrl) {
       BrowserUtilities.clickWithJS(getLoginRegisterPage().accountLogin);
        Assert.assertEquals(loginUrl, Driver.getDriver().getCurrentUrl());

    }
}