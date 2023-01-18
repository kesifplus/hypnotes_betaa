package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import utilities.APIUtilities2;


import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.*;


public class US_112_StepDef {

    @Given("a user connects to the {string}")
    public void aUserConnectsToThe(String endPoint) {
        response= given().
                spec(specification).
                post(endPoint);
        response.prettyPrint();
    }
}
