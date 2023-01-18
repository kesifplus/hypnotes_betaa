package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.APIUtilities2;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_106_StepDef extends APIUtilities2 {
    @Given("the user connects to {string}")
    public void the_user_connects_to(String endpoint, DataTable dataTable) {
        Map<String, String> keyAndValu = dataTable.asMaps().get(0);
        System.out.println(keyAndValu);

        response = given().spec(specification).formParams(keyAndValu).post(endpoint);
        response.prettyPrint();
    }

    @Then("the user verifies that status code of the response is {string}")
    public void the_user_verifies_that_status_code_of_the_response_is(String statusCode) {
        int currentStatusCode = response.statusCode();
        Assert.assertEquals(Integer.parseInt(statusCode), currentStatusCode);
    }

    @Then("the user verifies  the api response has mandatory fields")
    public void the_user_verifies_the_api_response_has_mandatory_fields(DataTable dataTable) {
        List<String> mandFields = dataTable.asList();
        System.out.println(mandFields);
        for (String fields : mandFields) {
            Assert.assertTrue(response.jsonPath().get(fields));
            System.out.println(fields);
        }

    }

}
