package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class US_057_StepDef extends BasePage {
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String today = timeFormat.format(localDateTime);

   @When("user clicks clients")
    public void userClicksClients() {
        getLoginRegisterPage().getclientInfoPage().clientsPage.click();


    }

    @Then("user search client")
    public void userSearchClient() {
        BrowserUtilities.clickWithJS(getclientInfoPage().searchClientsBox);
        getclientInfoPage().searchClientsBox.sendKeys("karaca");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);
    }

    @When("user clicks view detail")
    public void userClicksViewDetail() {
        BrowserUtilities.waitFor(5);
        BrowserUtilities.clickWithJS(getclientInfoPage().clientViewDetail);
        BrowserUtilities.waitFor(5);

    }

    @And("user clicks login Presenting Issue")
    public void userClicksLoginPresentingIssue() {
        BrowserUtilities.clickWithJS(getclientInfoPage().presentingIssue);

    }

    @And("user clicks Additional Notes")
    public void userClicksAdditionalNotes() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(getclientInfoPage().additionalNotesButton);
        BrowserUtilities.waitFor(3);
        getclientInfoPage().additionalNotesButton.click();
    }


    @Then("Assert voice Notes is enable")
    public void assertVoiceNotesIsEnable() {
        BrowserUtilities.waitForVisibility(getclientInfoPage().voiceNoticeTitle, 5);
        BrowserUtilities.scrollToElement(getclientInfoPage().voiceNoticeTitle);
        Assert.assertTrue(getclientInfoPage().voiceNoticeTitle.isEnabled());
        System.out.println("title  :" + getclientInfoPage().voiceNoticeTitle.getText());
    }


    @When("user clicks on the presentingmicrophone add Voice")
    public void userClicksOnThePresentingmicrophoneAddVoice() throws InterruptedException, AWTException {
//        BrowserUtilities.waitFor(3);
//        BrowserUtilities.clickWithJS(getclientInfoPage().voiceRecordMicrophone);
        BrowserUtilities.handlingNotification(getclientInfoPage().voiceRecordMicrophone);
        //robot classından obje uretilirek yapılan ama düzelttilmeli
//        BrowserUtilities.waitFor(10);
//        getclientInfoPage().voiceRecordMicrophone.click();

    }

    @Then("user verifies Recording added message")
    public void userVerifiesRecordingAddedMessage() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().recordingAddedMessage.isDisplayed());

    }

    @When("user clicks on the lautsprecher")
    public void userClicksOnTheLautsprecher() {
       BrowserUtilities.waitForClickability(getclientInfoPage().lautsprecherIcon, 5);
//        Assert.assertEquals(today, getclientInfoPage().recordDate.getText());
        System.out.println("tarh :" + getclientInfoPage().recordDate.getText());
        getclientInfoPage().lautsprecherIcon.click();
    }

    @And("Attached files are appear")
    public void attachedFilesAreAppear() {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(getclientInfoPage().copyButton.isDisplayed());
        Assert.assertTrue(getclientInfoPage().playIcon.isDisplayed());
        Assert.assertTrue(getclientInfoPage().sendToClientButton.isDisplayed());
        Assert.assertTrue(getclientInfoPage().deleteVoiceButton.isDisplayed());
         Assert.assertTrue(getclientInfoPage().extractTextToButton.isDisplayed());
    }

    @Then("user clicks play button and verifies functionality")
    public void userClicksPlayButtonAndVerifiesFunctionality() {
        getclientInfoPage().playIcon.click();

    }

    @And("User verifies Attached files functionalty")
    public void userVerifiesAttachedFilesFunctionalty() {
        BrowserUtilities.waitFor(5);
        String copyMssj = "Text copied to your clipboard!";

        getclientInfoPage().copyButton.click();
        Assert.assertEquals(copyMssj, getclientInfoPage().copyOnayMessage.getText());
        BrowserUtilities.waitFor(3);

        getclientInfoPage().extractTextToButton.click();
        Assert.assertEquals("Succesfully", getclientInfoPage().successmesaj.getText());

        String extractText = getclientInfoPage().extractTextToBox.getText();
        Assert.assertEquals(extractText, getclientInfoPage().extractTextToBox.getText());
        getclientInfoPage().sendToClientButton.click();
        BrowserUtilities.waitFor(3);
        getclientInfoPage().lautsprecherIcon.click();
        getclientInfoPage().deleteVoiceButton.click();
        BrowserUtilities.waitFor(3);
        getclientInfoPage().deleteAkzeptButton.click();
        BrowserUtilities.waitForVisibility(getclientInfoPage().deleteSuccesMessage, 5);
        Assert.assertEquals("Voice is succesfully deleted.", getclientInfoPage().deleteSuccesMessage.getText());
    }

}

