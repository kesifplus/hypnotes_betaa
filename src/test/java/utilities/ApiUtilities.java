package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.PhoneNumber;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static utilities.APIUtilities2.payload;
import static utilities.APIUtilities2.specification;

public class ApiUtilities {
    public static Response response;
    static ObjectMapper objectMapper = new ObjectMapper();
    static JsonPath jsonPath;


    public static RequestSpecification specification2 = new RequestSpecBuilder().
            addCookie(new Cookie.Builder("PHPSESSID", "rastlf2h2qfdr0tpj5mcje6nev").build()).
            setBaseUri(ConfigurationReader.getProperty("baseURI")).setRelaxedHTTPSValidation().build();

    public static RequestSpecification specik = new RequestSpecBuilder().
            setBaseUri(ConfigurationReader.getProperty("baseURI")).setRelaxedHTTPSValidation().build();


    public static void notCreateContact(String fullname,String email) {
        payload.put("fullname", fullname);
        payload.put("email", email);

        response = given().
                spec(specik)
                .formParams(payload)
                .post("/contact");
        response.prettyPrint();

    }

    public static void createContact(String subject, String fullname, String email) {
        payload.put("subject", subject);
        payload.put("fullname", fullname);
        payload.put("email", email);
        response = given().
                spec(specik)
                .formParams(payload)
                .post("/contact");
        response.prettyPrint();

    }
}

