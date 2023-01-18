package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

public class US_048_StepDef extends BasePage {


    @Given("user scroll down to see Documents")
    public void user_scroll_down_to_see_documents() {
        BrowserUtilities.scrollToElement(getclientInfoPage().clientInfoDocumentsButton);
    }
    @Given("user clicks on clientInfoDocumentsButton")
    public void user_clicks_on_client_info_documents_button() {
        BrowserUtilities.waitFor(3);
        getclientInfoPage().clientInfoDocumentsButton.click();
    }

    @Given("user scroll down to see various titles")
    public void user_scroll_down_to_see_various_titles() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(getclientInfoPage().uploadedDocumentsInTable);

    }

    @Given("user assert visibility and click ability")
    public void user_assert_visibility_and_click_ability() {
        BrowserUtilities.waitFor(3);
        for (int i = 0; i < getclientInfoPage().tabListClientInfoDocuments.size(); i++) {
            BrowserUtilities.waitFor(3);
            System.out.println(getclientInfoPage().tabListClientInfoDocuments.get(i));
            Assert.assertTrue(getclientInfoPage().tabListClientInfoDocuments.get(i).isEnabled());
            Assert.assertTrue(getclientInfoPage().tabListClientInfoDocuments.get(i).isDisplayed());
        }

    }



}
