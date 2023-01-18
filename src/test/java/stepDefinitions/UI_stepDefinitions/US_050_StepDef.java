package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;


public class US_050_StepDef extends BasePage {
    WebElement element;
    Faker faker = new Faker();
    String fakerName;
    String fakerLastName;


    @Then("user clicks View Detail of first client")
    public void userClicksViewDetailOfFirstClient() {
        getclientInfoPage().viewDetailList.get(0).click();

    }

    @When("user clicks Edit Button")
    public void user_clicks_edit_button() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getclientInfoPage().editButton);
        BrowserUtilities.waitFor(2);

    }

    @When("user deletes client's first name")
    public void user_deletes_client_s_first_name() {
        BrowserUtilities.scrollToElement(getclientInfoPage().firstNameBox);
        for (int i = 0; i < 30; i++) {
            getclientInfoPage().firstNameBox.sendKeys(Keys.BACK_SPACE);
        }

    }

    @Then("verify {string} is visible")
    public void verify_is_visible(String warning) {
        String warningMessage = getclientInfoPage().warningFirstName.getText();
        Assert.assertEquals(warning, warningMessage);
    }

    @Then("user deletes client's last name")
    public void user_deletes_client_s_last_name() {
        BrowserUtilities.scrollToElement(getclientInfoPage().firstNameBox);
        for (int i = 0; i < 30; i++) {
            getclientInfoPage().lastNameBox.sendKeys(Keys.BACK_SPACE);
        }
    }

    @Then("verify  that {string} is visible")
    public void verify_that_is_visible(String warning) {
        String warningMessage = getclientInfoPage().warningLastName.getText();
        Assert.assertEquals(warning, warningMessage);
    }

    @When("user enters new {string}, {string} on page")
    public void user_enters_new_on_page(String firstName, String lastName) {
        getclientInfoPage().firstNameBox.sendKeys(firstName);
        getclientInfoPage().lastNameBox.sendKeys(lastName);

    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        BrowserUtilities.clickWithJS(getclientInfoPage().saveButton);

    }

    @Then("{string} is visible")
    public void is_visible(String popMessage) {
        BrowserUtilities.waitFor(3);
        String sureMessage = getclientInfoPage().areYouSurePop.getText();
        Assert.assertEquals(popMessage, sureMessage);
    }

    @When("user clicks yes button")
    public void user_clicks_yes_button() {
        BrowserUtilities.waitFor(3);
        getclientInfoPage().yesButton.click();


    }

    @Then("user verifies alert size is {string}")
    public void user_verifies_alert_size_is(String alertNumber) {
        int alertNum = Integer.parseInt(alertNumber);
        Assert.assertEquals(alertNum, getclientInfoPage().alerts.size());

    }

    @Then("user verifies alert messages are {string}")
    public void user_verifies_alert_messages_are(String alertMessage) {
        BrowserUtilities.waitFor(3);
        String[] mes = alertMessage.split(",");
        for (int i = 0; i < mes.length; i++) {
            int finalI = i;
            Assert.assertTrue(getclientInfoPage().alerts.stream().anyMatch(t -> t.getText().equals(mes[finalI])));
        }

    }


    @When("user enters wrong values in Client Info and alert message should visible")
    public void userEntersWrongValuesInClientInfoAndAlertMessageShouldVisible(DataTable dataTable) {

        List<String> boxes = dataTable.column(0);

        for (int i = 0; i < boxes.size(); i++) {

            element = Driver.getDriver().findElement(By.cssSelector("[id='client_" + boxes.get(i) + "']"));
            BrowserUtilities.waitFor(1);
            element.sendKeys("5");
        }
        BrowserUtilities.waitFor(3);
        List<String> alerts = dataTable.column(1);

        for (int i = 0; i < alerts.size(); i++) {
            String message = Driver.getDriver().findElement(By.cssSelector(".ant-form-item-explain-error")).getText();

            Assert.assertTrue(message.contains("should not include any digit or special characters"));

        }
    }

    @When("user enters wrong values for editing alert message should visible")
    public void userEntersWrongValuesForEditingAlertMessageShouldVisible(DataTable dataTable) {
        List<String> boxes = dataTable.column(0);
        List<String> sendInput = dataTable.column(1);


        for (int i = 0; i < boxes.size(); i++) {
            element = Driver.getDriver().findElement(By.cssSelector("[id='client_" + boxes.get(i) + "']"));
            BrowserUtilities.waitFor(1);
            for (int j = 0; j < 30; j++) {
                element.sendKeys(Keys.BACK_SPACE);

            }
            element.sendKeys(sendInput.get(i));
        }

    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String message) {

        String input = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'The input is not valid')]")).getText();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(input.contains(message));
    }


    @When("user enters new name and new lastname")
    public void userEntersNewNameAndNewLastname() {
        fakerName = faker.name().firstName();
        fakerLastName = faker.name().lastName();

        getclientInfoPage().firstNameBox.sendKeys(fakerName);
        getclientInfoPage().lastNameBox.sendKeys(fakerLastName);

    }

    @Then("{string} message should be visible")
    public void messageShouldBeVisible(String message) {
        BrowserUtilities.waitForVisibility(getclientInfoPage().successUpdate, 25);
        BrowserUtilities.waitForPageToLoad(15);
        Assert.assertEquals(message, getclientInfoPage().successUpdate.getText());
    }

    @When("user clicks clients tab")
    public void userClicksClientsTab() {
        BrowserUtilities.clickWithJS(getclientInfoPage().clientsPage);
    }

    @Then("On the search Client page, edited First and Lastname should appear")
    public void onTheSearchClientPageEditedFirstAndLastnameShouldAppear() {
        String fullName = fakerName + " " + fakerLastName;

        for (int i = 0; i < getclientInfoPage().allClients.size(); i++) {

            Assert.assertTrue(getclientInfoPage().allClients.stream().anyMatch(t -> t.getText().equals(fullName)));
        }


    }


    @And("user clicks cancel button")
    public void userClicksCancelButton() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getclientInfoPage().cancelButton);
        BrowserUtilities.clickWithJS(getclientInfoPage().addCancelButton);
    }

    @Then("On the search Client page, edited First and Lastname should not appear")
    public void onTheSearchClientPageEditedFirstAndLastnameShouldNotAppear() {

        String fullName = fakerName + " " + fakerLastName;

        for (int i = 0; i < getclientInfoPage().allClients.size(); i++) {

            Assert.assertFalse(getclientInfoPage().allClients.stream().anyMatch(t -> t.getText().equals(fullName)));
        }
    }


}





