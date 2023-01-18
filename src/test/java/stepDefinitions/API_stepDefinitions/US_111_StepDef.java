package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.*;

public class US_111_StepDef {
    @Then("the user connects to the {string}")
    public void theUserConnectsToThe(String endPoint, DataTable dataTable) {
        Map<String, String> request = dataTable.asMaps().get(0);
        response = given().
                spec(specification).
                queryParams(request).
                post(endPoint);
        response.prettyPrint();
    }

}
