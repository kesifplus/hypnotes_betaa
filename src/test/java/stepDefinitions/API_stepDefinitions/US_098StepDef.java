package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BasePage;
import utilities.APIUtilities2;
import utilities.BrowserUtilities;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.*;


public class US_098StepDef extends BasePage {
    static List<Integer> ids;
    int apiMeetNum;

    @Given("user connects to the {string}")
    public void user_connects_to_the(String endpoint) {

        connectWithPostMethod(endpoint);
    }

    @Then("user verifies the status code of the response is {int}")
    public void userVerifiesTheStatusCodeOfTheResponseIs(int statusC) {

        Assert.assertEquals(statusC, response.getStatusCode());


        ids = APIUtilities2.getMeetings();

        System.out.println(" Api'daki id'ler = " + ids);
        apiMeetNum = ids.size();


    }

    @Then("user verifies the api response has mandatory fields.")
    public void user_verifies_the_api_response_has_mandatory_fields(DataTable dataTable) {
        List<String> mandFields = dataTable.column(0);
        for (int i = 0; i < mandFields.size(); i++) {
            Assert.assertTrue(response.jsonPath().get(mandFields.get(i)) != null);

        }

    }

    @When("user clicks Scheduling button")
    public void userClicksSchedulingButton() {
        getCalenderMeetingInfoAndCalenderPage().schedulingButton.click();
        BrowserUtilities.waitFor(3);

    }

    @And("user clicks Calender button")
    public void userClicksCalenderButton() {
        getCalenderMeetingInfoAndCalenderPage().calenderButton.click();
    }

    @Then("verify the number of meetings in the UI appears in the API")
    public void verifyTheNumberOfMeetingsInTheUIAppearsInTheAPI() {

        int uiMeetNum = getCalenderMeetingInfoAndCalenderPage().sumMeeting.size();

        boolean var = false;
        for (int i = 0; i < uiMeetNum; i++) {
            if (uiMeetNum == apiMeetNum) {
                var = true;
                break;
            }

        }
    }



}
