package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_062_StepDef extends BasePage {

    @And("user clicks sessions")
    public void userClicksSessions() {
        BrowserUtilities.clickWithJS(getclientInfoPage().sessions);
    }
    @When("user clicks on the sessionsmicrophone add Voice")
    public void userClicksOnTheSessionsmicrophoneAddVoice() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getclientInfoPage().voiceRecordMicrophone);

        BrowserUtilities.waitFor(5);
        getclientInfoPage().voiceRecordMicrophone.click();
    }
    }
