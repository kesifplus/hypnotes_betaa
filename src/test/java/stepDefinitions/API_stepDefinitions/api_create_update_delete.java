package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import org.junit.Assert;
import pages.BasePage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.response;
import static utilities.APIUtilities2.specification;

public class api_create_update_delete extends BasePage {
    Map<String, String> payload=new HashMap<>();
      private static String id;

    @Given("user connects to the {string} for creation to {string}")
    public void userConnectsToTheForCreationTo(String endpoint, String key, DataTable dataTable) {
       payload=dataTable.asMaps().get(0);

        response = given()
                .spec(specification)
                .contentType(ContentType.JSON)
                .headers("content-type", "application/x-www-form-urlencoded")
                .formParams(payload)
                .post(endpoint);

        response.prettyPrint();
        System.out.println(response.jsonPath().getString(key+".id"));
        id=response.jsonPath().getString(key+".id");
        System.out.println(id);
       }
    @Given("user connects to the {string} for update with {string}")
    public void userConnectsToTheForUpdate(String endpoint, String idName, DataTable dataTable) {
        payload.put(idName,id+"");
        payload.putAll(dataTable.asMaps().get(0));


        response = given()
                .spec(specification)
                .contentType(ContentType.JSON)
                .headers("content-type", "application/x-www-form-urlencoded")
                .formParams(payload)
                .post(endpoint);

        response.prettyPrint();
    }
    @Then("user verify change is as expected")
    public void userVerifyChangeIsAsExpected(DataTable dataTable) {
        List<String> actualPath=dataTable.column(0);
        List<String> expected=dataTable.column(1);
        for (int i = 0; i <actualPath.size() ; i++) {
            Assert.assertEquals(expected.get(i)+"",response.jsonPath().getString(actualPath.get(i))+"");
        }

    }
    @Given("user connects to the {string} for delete with {string}")
    public void userConnectsToTheForDelete(String endpoint,String idName) {
        System.out.println(idName);

        payload.put(idName+"",id+"");
        System.out.println(payload);
        response = given()
                .spec(specification)
                .contentType(ContentType.JSON)
                .headers("content-type", "application/x-www-form-urlencoded")
                .formParams(payload)
                .post(endpoint);

        response.prettyPrint();
    }
    @Then("user verify success is true")
    public void userVerifySuccessIsTrue() {
        Assert.assertTrue(response.jsonPath().get("success"));
    }
}
