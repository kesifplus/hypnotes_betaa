package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.response;
import static utilities.APIUtilities2.specification;

public class US_121_122_StepDef {
    private static Map<String,String> payload =new HashMap<>();

    @Given("user connects to the {string} for creation")
    public void userConnectsToTheForCreation(String endPoint, DataTable dataTable) {
        payload=dataTable.asMaps().get(0);
        response = given()
                .spec(specification)
                .contentType(ContentType.JSON)
                .headers("content-type", "application/x-www-form-urlencoded")
                .queryParams(payload)
                .post(endPoint);

        response.prettyPrint();
    }
    @Given("user connects to the {string} for delete")
    public void userConnectsToTheForDelete(String endPoint) {

        response = given()
                .spec(specification)
                .contentType(ContentType.JSON)
                .headers("content-type", "application/x-www-form-urlencoded")
                .formParams(payload)
                .post(endPoint);
        response.prettyPrint();
    }
}
