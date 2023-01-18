package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_023_StepDef extends BasePage {

    @When("User sees therapist and clicks")
    public void userSeesTherapistAndClicks() {
        getLoginRegisterPage().logRegPageSıgnUpButton.click();
        for (int i = 0; i < getLoginRegisterPage().clientAndTherapist.size(); i++) {
            if (getLoginRegisterPage().clientAndTherapist.get(i).getText().equalsIgnoreCase("Therapist")) ;
            getLoginRegisterPage().clientAndTherapist.get(i).click();
        }
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        BrowserUtilities.clickWithJS(getLoginRegisterPage().accountLogin);
    }


    @Then("On the page {string} button ist clickable")
    public void onThePageButtonIstClickable(String therapist) {
        if (getLoginRegisterPage().iAmTherapistButton.isEnabled()) {
            Assert.assertTrue(therapist, getLoginRegisterPage().therapistTitle.isDisplayed());
            System.out.println("therapistTitle = " + getLoginRegisterPage().therapistTitle.getText());
        } else if (getLoginRegisterPage().iAmClientButton.isEnabled()) {
            BrowserUtilities.clickWithJS(getLoginRegisterPage().iAmClientButton);

        }

    }
}
