package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.When;
import io.restassured.http.ContentType;


import static io.restassured.RestAssured.given;
import static utilities.ApiUtilities.*;

public class US_088_StepDef {
    @When("user sends Post Request to {string} for get coupons.")
    public void user_sends_post_request_to_for_get_coupons(String endpoint) {
        //connectWithGetMethod(endpoint);

        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification2).
                get(endpoint);
    }

    }


