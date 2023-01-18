package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.APIUtilities2;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_113_StepDef extends APIUtilities2 {
    @Given("for sending mail user connets {string} endpoint")
    public void for_sending_mail_user_connets_endpoint(String endpoint, DataTable dataTable) {
        Map<String, String >google=dataTable.asMaps().get(0);
        response = given().
                spec(specification).
                formParams(google).
                post(endpoint);
        response.prettyPrint();

    }


    @Then("verifies that the status code of response for mail is {int}")
    public void verifiesThatTheStatusCodeOfResponseForMailIs(int status) {
        Assert.assertEquals(status,response.getStatusCode());
    }
}
