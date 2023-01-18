package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.APIUtilities2;

public class US_097_StepDef {
    @Given("the user connects to {string} for servisLimit")
    public void theUserConnectsToForServisLimit(String servisLimit) {

        APIUtilities2.connectWithPostMethod(servisLimit);
    }

}
