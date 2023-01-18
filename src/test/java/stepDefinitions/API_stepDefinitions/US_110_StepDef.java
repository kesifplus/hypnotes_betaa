package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.*;


public class US_110_StepDef {
    @Given("user connects to the  {string}")
    public void userConnectsToThe(String endPoint, DataTable dataTable) {
        Map<String, String> request = dataTable.asMaps().get(0);
        response = given().
                spec(specification).
                formParams(request).
                post(endPoint);
        response.prettyPrint();
    }
}
