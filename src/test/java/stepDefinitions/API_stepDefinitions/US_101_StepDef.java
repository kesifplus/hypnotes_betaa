package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import io.restassured.http.ContentType;
import org.junit.Assert;
import utilities.APIUtilities2;
import utilities.BrowserUtilities;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_101_StepDef extends APIUtilities2 {

  static int timeoffId;

    @Then("user creates a timeoff block")
    public void userCreatesATimeoffBlock() {
        timeoffId =createTimeoff(
                BrowserUtilities.createDate(1, 3, 0),
                BrowserUtilities.createTime(0, 10),
                BrowserUtilities.createTime(2, 10),
                "online",
                true
        );
        System.out.println(timeoffId);

    }

    @Then("user verifies that the status code of the response is {int}")
    public void userVerifiesThatTheStatusCodeOfTheResponseIs(int statusC) {
        Assert.assertEquals(statusC, response.statusCode());
//        verifyStatusCode(statusC);
    }
    @And("user verifies that the response is as expected")
    public void userVerifiesThatTheResponseIsAsExpected(DataTable dataTable) {
        List<String> keys = dataTable.column(0);
        List<String> expectedValue = dataTable.column(1);

        for (int i = 0; i < keys.size(); i++) {
            System.out.println("ExpectedData = " + expectedValue.get(i) + " -ActualData = " + response.jsonPath().getString(keys.get(i)));
            Assert.assertEquals(expectedValue.get(i), response.jsonPath().getString(keys.get(i)));
        }
    }
}
