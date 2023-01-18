package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.APIUtilities2;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.specification2;

public class US_091_StepDef extends APIUtilities2{
//    Map<String,String> keyAndValue;
//    @When("user sends Post Request to {string}")
//    public void userSendsPostRequestTo(String endPoint, DataTable dataTable) {
//    keyAndValue = dataTable.asMaps().get(0);
//        response = given().
//                spec(specification).
//                formParams(keyAndValue).
//                post(endPoint);
//        response.prettyPrint();
//    }
//
//    @Then("the user verifies the status code of the response is {string}")
//    public void the_user_verifies_the_status_code_of_the_response_is(String statusCode) {
//        int currentStatusCode = response.statusCode();
//        Assert.assertEquals(Integer.parseInt(statusCode), currentStatusCode);
//    }
//
//    @Then("user verifies update with {string}")
//    public void userVerifiesUpdateWith(String path) {
//         Assert.assertTrue(response.jsonPath().getBoolean(path));
//    }
//
//    @Then("user verifies update with success")
//    public void userVerifiesUpdateWithSuccess(DataTable dataTable) {
//         List<String> startsAtDate =  dataTable.asList();
//          System.out.println("------------------"+ startsAtDate);
//        System.out.println("-----"+ response.jsonPath().get("promoCode.startsAt.date"));
//        Assert.assertEquals(startsAtDate, response.jsonPath().getString("promoCode.startsAt.date"));
//    }
}

