package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_083_StepDef extends BasePage {

    Faker faker = new Faker();
    String fakerFullName;
    String fakerEmail;
    String fakerPassword;

    @Given("user goes to hypnotes page")
    public void userGoesToHypnotesPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
        BrowserUtilities.waitFor(3);

    }
    @When("hover over sign up button")
    public void hover_over_sign_up_button() {
        BrowserUtilities.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getLoginRegisterPage().mainSignUp).perform();
        BrowserUtilities.waitFor(20);

    }



    @And("user clicks therapist sign up button")
    public void userClicksTherapistSignUpButton() {
        BrowserUtilities.waitFor(5);
        BrowserUtilities.clickWithJS(getRegisterPage().thearapistSignUpButton);
        BrowserUtilities.waitFor(10);
    }
    @And("user enters faker full name,email and password")
    public void userEntersFakerFullNameEmailAndPassword() {
        getLoginRegisterPage().fullNameTherapist.sendKeys(fakerFullName);
        getLoginRegisterPage().emailTherapist.sendKeys(fakerEmail);
        getLoginRegisterPage().passwordTherapist.sendKeys(fakerPassword);



    }
    @And("user clicks sign up button")
    public void userClicksSignUpButton() {
        BrowserUtilities.clickWithJS(getLoginRegisterPage().signUpTherapist);
        BrowserUtilities.waitFor(3);
    }

    @Given("User Navigates to {string}")
    public void user_navigates_to(String string) {


    }




//getProfilePage().profileButton.getText(Keys.)


    @When("User Open Company details Page")
    public void user_open_company_details_page() {

getProfilePage().yourCompanyProfile.click();
        BrowserUtilities.waitFor(3);




    }

    @Then("User verifies Company title is clickable")
    public void user_verifies_company_title_is_clickable() {
       BrowserUtilities.waitFor(3);
       Assert.assertTrue(getProfilePage().yourCompanyProfile.isDisplayed());
       BrowserUtilities.waitFor(3);

      // Assert.assertTrue();

    }

    @Then("user clicks on the company title")
    public void user_clicks_on_the_company_title() {
        BrowserUtilities.clickWithJS(getProfilePage().yourCompanyProfile);
        BrowserUtilities.waitFor(2);

    }

    @Then("user verifies add new company button is visible")
    public void user_verifies_add_new_company_button_is_visible() {
        Assert.assertTrue(getProfilePage().addNewCompanyProfile.isDisplayed());
    }

    @Then("clicks on add new company button")
    public void clicksOnAddNewCompanyButton() {
        getProfilePage().addNewCompanyProfile.click();
    }
    @And("verifies the \"Your Logo, Your Company, Company{string}s URL, Company's Phone Number Fields are visible")
    public void verifiesTheYourLogoYourCompanyCompanySAddressCityStateZipCountryCompanySURLCompanySPhoneNumberFieldsAreVisible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}

        Assert.assertTrue(getProfilePage().yourLogoProfile.isDisplayed());
        Assert.assertTrue(getProfilePage().yourCompanyProfile.isDisplayed());
        Assert.assertTrue(getProfilePage().companysAddressEditProfile.isDisplayed());
        Assert.assertTrue(getProfilePage().cityStateZipEditProfile.isDisplayed());
        Assert.assertTrue(getProfilePage().companysUrlEditProfile.isDisplayed());
        Assert.assertTrue(getProfilePage().companysEditPhoneNumberProfile.isDisplayed());



    }
    @Then("user verifies a valide logo is loadable")
    public void user_verifies_a_valide_logo_is_loadable() {
        String filePath = System.getProperty("user.dir") + "//src/test/resources/files/images/desktop.jpeg";
        getProfilePage().yourLogoProfile.sendKeys(filePath);
       BrowserUtilities.waitFor(15);

    }

    @Then("user verifies a valid company's name is applicable")
    public void user_verifies_a_valid_company_s_name_is_applicable() {
        getProfilePage().yourCompanyNameEditProfile.sendKeys("Happy Hub");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);


    }

    @Then("user verifies a valid company's address is applicable")
    public void user_verifies_a_valid_company_s_address_is_applicable() {
        getProfilePage().companysAddressEditProfile.sendKeys("25 Butterfly Street 8YU 3Fr");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);

    }

    @Then("user verifies a valid city,state,zip should be applicable the related fields")
    public void user_verifies_a_valid_city_state_zip_should_be_applicable_the_related_fields() {
        getProfilePage().cityStateZipEditProfile.sendKeys("Cambridge","UK","5cvt 8ty");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);


    }
    @Then("user verifies country dropdown  menu is functionalable")
    public void user_verifies_country_dropdown_menu_is_functionalable() {
        getProfilePage().unitedStateEditProfile.isEnabled();

    }

    @Then("user verifies a country is selectable from dropdown menu")
    public void user_verifies_a_country_is_selectable_from_dropdown_menu() {
       BrowserUtilities.waitFor(5);
       Select dropdown = new Select(getProfilePage().unitedStateEditProfile);
       dropdown.selectByVisibleText("United States");




    }
    @Then("user verifies a valid Url is applicable")
    public void user_verifies_a_valid_url_is_applicable() {
        getProfilePage().companysUrlEditProfile.sendKeys("httpp//happy@hot.com");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);

    }

    @Then("user verifies a valid company's phone number is applicable the related fields")
    public void user_verifies_a_valid_company_s_phone_number_is_applicable_the_related_fields() {
        getProfilePage().companysEditPhoneNumberProfile.sendKeys(       "0785643");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);
    }

    @Then("user verifies a valid email address is applicable the related fields")
    public void user_verifies_a_valid_email_address_is_applicable_the_related_fields() {
        getProfilePage().companysEditEmailProfile.sendKeys("happy@hot.com");

    }

    @Then("user clicks on the updates button")
    public void user_clicks_on_the_updates_button() {
        getProfilePage().updateButtonEditProfile.click();

    }



}


