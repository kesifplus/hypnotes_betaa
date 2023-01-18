package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.APIUtilities2;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.response;
import static utilities.ApiUtilities.specification2;

public class US_092_StepDef extends APIUtilities2 {

    @When("user sends Post Request to {string} Delete")
    public void user_sends_post_request_to_delete(String endPoint) {
        response= given()
                .spec(specification2)
                .formParam("couponId",554)
                .post(endPoint);
        response.prettyPrint();
    }

    @Then("user verifies the status code of the response is {string}")
    public void user_verifies_the_status_code_of_the_response_is(String statusCode) {
        int currentStatusCode = response.getStatusCode();
        Assert.assertEquals(Integer.parseInt(statusCode), currentStatusCode);
    }


   @Then("user verifies delete with {string}")
    public void user_verifies_delete_with(String path) {
        Assert.assertTrue(response.jsonPath().getBoolean(path));
    }
}
