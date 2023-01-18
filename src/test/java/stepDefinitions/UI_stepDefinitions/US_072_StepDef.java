package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import pages.CalenderBookAnAppointmentPage;
import utilities.BrowserUtilities;
import utilities.Driver;


public class US_072_StepDef extends BasePage{
    @Given("user clicks day")
    public void user_clicks_day() {
        BrowserUtilities.waitFor(3);
        getCalenderBookAnAppointmentPage().dateDate(10);
    }


    @Given("user clicks Costum Service")
    public void user_clicks_costum_service() {
        BrowserUtilities.waitFor(3);
        getCalenderBookAnAppointmentPage().radioButtonCustomService.click();
    }

    @Given("user enters Service Name {string}")
    public void user_enters_service_name(String name) {
        BrowserUtilities.waitFor(3);
        getCalenderBookAnAppointmentPage().inputServiceName.sendKeys(name);
    }

    @Given("user enters price {string}")
    public void user_enters_price(String price) {
        BrowserUtilities.waitFor(3);
        getCalenderBookAnAppointmentPage().inputPrice.sendKeys(price);
    }

    @Given("user enters Duration {string}")
    public void user_enters_duration(String duration) {
        BrowserUtilities.waitFor(3);
        getCalenderBookAnAppointmentPage().inputDuration.sendKeys(duration);
    }

    @Given("user click Do not notify client")
    public void user_click_do_not_notify_client() {
        BrowserUtilities.waitFor(3);
        getCalenderBookAnAppointmentPage().doNotnatifyClientButton.click();
    }

    @When("user clicks BookAnAppointment submit button")
    public void user_clicks_book_an_appointment_submit_button() {
        BrowserUtilities.waitFor(3);
        getCalenderBookAnAppointmentPage().bookAnAppointmentSubmitButton.click();
    }

    @Then("user assert alert messages are {string}")
    public void user_assert_alert_messages_are(String message) {
        BrowserUtilities.waitFor(2);
        System.out.println("-----------------"+ message);
        String alertMessage = getCalenderBookAnAppointmentPage().alertMessageNewMeetingCreated.getText();
        BrowserUtilities.waitFor(3);
        System.out.println("-----------------"+ alertMessage);
        Assert.assertEquals(message, alertMessage);
    }
}
