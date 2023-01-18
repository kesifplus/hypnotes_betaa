package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import utilities.APIUtilities2;

import pages.BasePage;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.*;

public class US_089_StepDef extends APIUtilities2 {

    @Given("user connects to the {string} with payload")
    public void user_connects_to_the_with_payload(String endpoint, io.cucumber.datatable.DataTable dataTable) {
        Map<String,String>payload = dataTable.asMaps().get(0);
        response = given()
                .spec(specification)
                .formParams(payload)
                .post(endpoint);
        response.prettyPrint();


    }

    @Then("user verifies status code is {int}")
    public void user_verifies_status_code_is(int statusC) {
        Assert.assertEquals(statusC,response.getStatusCode());

    }






}
