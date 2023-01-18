package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.response;
import static utilities.ApiUtilities.specification2;

public class US_095_StepDef {

    @Given("user connects to the {string} for deletion")
    public void user_connects_to_the_for_deletion(String endpoint) {
    response= given()
            .spec(specification2)
            .headers("content-type", "application/x-www-form-urlencoded")
            .formParam("categoryId",2415)
            .post(endpoint);
    response.prettyPrint();
    }
    @Then("user verifies remove with status code {int}")
    public void userVerifiesRemoveWithStatusCode(int statusCode) {
        System.out.println(response.getStatusCode());
        Assert.assertEquals(statusCode,response.getStatusCode());
    }
    @Then("user verifies remove with {string}")
    public void userVerifiesRemoveIndividualSessionWith(String path) {
        Assert.assertTrue(response.jsonPath().getBoolean(path));
    }
}
