package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.response;
import static utilities.APIUtilities2.specification;

public class US_129_StepDef {
    @Given("user connects to {string} for creation")
    public void user_connects_to_for_creation(String endPoint, DataTable dataTable) {
        Map<String,String> payload=dataTable.asMaps().get(0);
        response = given()
                .spec(specification)
                .contentType(ContentType.JSON)
                .headers("content-type", "application/x-www-form-urlencoded")
                .formParams(payload)
                .post(endPoint);
        response.prettyPrint();
    }

    @Then("user verify success is {string}")
    public void user_verify_success_is(String path) {
        Assert.assertTrue(response.jsonPath().get(path));
    }
}
