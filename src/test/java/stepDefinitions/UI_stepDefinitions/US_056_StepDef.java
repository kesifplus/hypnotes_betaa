
package UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.ClientInfoPage;
import utilities.BrowserUtilities;
import utilities.Driver;
import utilities.JSUtils;

import java.awt.*;

public class US_056_StepDef extends BasePage {


    @When("user clicks add new problem")
    public void userClicksAddNewProblem() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getclientInfoPage().addNewProblem);
        BrowserUtilities.waitFor(3);
    }


    @Then("user enters {string} {string} {string} {string}")
    public void userEnters(String name, String statement, String location, String character) {
        BrowserUtilities.waitFor(5);

        getclientInfoPage().nameOf.sendKeys(name);
        getclientInfoPage().briefStatement.sendKeys(statement);
        getclientInfoPage().basicLocation.sendKeys(location);
        getclientInfoPage().currentCharacter.sendKeys(character);
        BrowserUtilities.waitFor(3);


    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {
        getclientInfoPage().submit.click();
        BrowserUtilities.waitFor(3);
    }


    @And("user clicks Additional Notes..")
    public void userClicksAdditionalNotes() {
        BrowserUtilities.waitFor(3);
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getclientInfoPage().additionalNote);
        BrowserUtilities.scrollToElement(getclientInfoPage().attachmentButton);
        BrowserUtilities.waitFor(3);
    }

    @Then("assert attachments button is enable..")
    public void assertAttachmentsButtonIsEnable() {
        BrowserUtilities.scrollToElement(getclientInfoPage().attachments);
        BrowserUtilities.waitFor(3);
        Assert.assertEquals("Attachments:", getclientInfoPage().attachments.getText());

    }


    @Then("user uploads file")
    public void user_uploads_file() throws AWTException {
        BrowserUtilities.waitFor(3);
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(3);
        String filePath = "//Users/mc/IdeaProjects/hynotes_betaa/src/test/resources/files/images/Jason.jpg";
        getclientInfoPage().chooseFile.sendKeys(filePath);
        BrowserUtilities.waitFor(15);
    }


    @And("copy button is visible..")
    public void copyButtonIsVisible() {
        BrowserUtilities.waitFor(3);
        getclientInfoPage().image.click();
        BrowserUtilities.waitFor(2);
        JSUtils.scrollDownByJS();
        BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(getclientInfoPage().copy);
        Assert.assertTrue(getclientInfoPage().copy.isDisplayed());
    }

    @And("copy button is enable..")
    public void copyButtonIsEnable() {
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(getclientInfoPage().copy.isEnabled());

    }
    @Then("assert under foto buttons are enable and visible..")
    public void assert_under_foto_buttons_are_enable_and_visible() {

        for(int i=0; i<getclientInfoPage().underFotoButtons.size();){

         Assert.assertTrue(getclientInfoPage().underFotoButtons.get(i).isEnabled());
         Assert.assertTrue(getclientInfoPage().underFotoButtons.get(i).isDisplayed());
         System.out.println(getclientInfoPage().underFotoButtons.get(i).getText());
            if(i==2){
                BrowserUtilities.waitFor(3);
                getclientInfoPage().underFotoButtons.get(2).click();
                BrowserUtilities.waitFor(3);
                getclientInfoPage().yesButton.click();
            }
i++;

        }

    }



}
