package stepDefinitions.API_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.APIUtilities2;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_102_SteppDef extends APIUtilities2 {

    @Then("user deletes the created id")
    public void userDeletesTheCreatedId() {
        System.out.println("id :"+US_101_StepDef.timeoffId);

        APIUtilities2.deleteId(US_101_StepDef
                .timeoffId);

    }
}
