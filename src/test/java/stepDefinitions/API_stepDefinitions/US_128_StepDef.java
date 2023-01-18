package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import org.junit.Assert;
import pages.BasePage;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.*;


import java.util.Map;


public class US_128_StepDef extends BasePage {

    @Given("user connects to the {string} for creations")
    public void user_connects_to_the_for_creations(String endPoint, DataTable dataTable) {
        Map<String,String> payload=dataTable.asMaps().get(0);
        response = given()
                .spec(specification)
                .contentType(ContentType.JSON)
                .headers("content-type", "application/x-www-form-urlencoded")
                .formParams(payload)
                .post(endPoint);
        response.prettyPrint();
    }

    @When("user verify status code {int}")
    public void user_verify_status_code(int status) {
        Assert.assertEquals(status,response.getStatusCode());
    }
}
