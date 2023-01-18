package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.APIUtilities2;
import java.util.Map;
import static io.restassured.RestAssured.given;
public class US_093_StepDef extends APIUtilities2 {
    @When("user creates a new individual session {string}")
    public void user_creates_a_new_individual_session(String endPoint, DataTable dataTable) {
        Map<String, String> keyAndValue = dataTable.asMaps().get(0);
        response = given().
                spec(specification).
                formParams(keyAndValue).
                post(endPoint);
        response.prettyPrint();

    }

    @Then("user verifies add new individual sessions with {string}")
    public void userVerifiesAddNewIndividualSessionsWith(String path) {
        Assert.assertTrue(response.jsonPath().getBoolean(path));
    }
}
