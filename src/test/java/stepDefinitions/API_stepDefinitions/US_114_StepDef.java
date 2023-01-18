package stepDefinitions.API_stepDefinitions;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import utilities.ApiUtilities;

import java.util.List;


public class US_114_StepDef extends ApiUtilities {

    Faker faker = new Faker();
    String fakename = faker.name().fullName();
    String subject = faker.hobbit().quote();
    String email=faker.internet().emailAddress();

    @Given("user should be able to establish contact")
    public void userShouldBeAbleToEstablishContact() {
        createContact(fakename,subject,email);

    }

    @Then("user verifies  contact the status code is {int}")
    public void userVerifiesContactTheStatusCodeIs(int status) {

        Assert.assertEquals(status, response.getStatusCode());
    }
    @And("user verifies response is exactly expected")
    public void userVerifiesResponseIsExactlyExpected(DataTable dataTable) {
        List<String> key = dataTable.column(0);
        List<String> expectedValue = dataTable.column(1);

        for (int i = 0; i < key.size(); i++) {
            Assert.assertEquals(expectedValue.get(i), response.jsonPath().getString(key.get(i)));
            System.out.println("ExpectedData = " + expectedValue.get(i) + " -ActualData = " + response.jsonPath().getString(key.get(i)));
        }
    }

    @Given("user can not establish contact")
    public void userCanNotEstablishContact() {


        notCreateContact(fakename, email);
    }

    @Then("user verifies that for contact the status code is {int}")
    public void userVerifiesThatForContactTheStatusCodeIs(int status) {

        Assert.assertEquals(status, response.getStatusCode());


    }



}