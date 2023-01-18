package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utilities.BrowserUtilities;

import java.util.Arrays;

public class US_084_StepDef extends BasePage {
    private static String companyName;
    private static String companyAddress;
    private static String companyCityStateZip;
    private static String companyURL;
    private static String companyPhoneNumber;
    private static String companyCountry;
    private static int companyCountryNumber;


    @Then("user verifies the previously attached company information is visible")
    public void user_verifies_the_previously_attached_company_information_is_visible() {
        BrowserUtilities.waitForVisibility(getProfilePage().attachedCompanyInformation,5);
        Assert.assertTrue(getProfilePage().attachedCompanyInformation.isDisplayed());
    }
    @Then("user clicks Edit Button for company")
    public void user_clicks_edit_button_for_company() {
        getProfilePage().editCompanyButton.click();
    }
    @Then("user verifies Edit your company information page displayed")
    public void user_verifies_edit_your_company_information_page_displayed() {
        BrowserUtilities.waitForVisibility(getProfilePage().yourCompanyNameEditProfile,5);
        Assert.assertTrue(getProfilePage().yourCompanyNameEditProfile.isDisplayed());
      }
    @Then("user updates the company name")
    public void user_updates_the_company_name() {
        companyName=Faker.instance().company().name();
        getProfilePage().yourCompanyNameEditProfile.click();
        getProfilePage().yourCompanyNameEditProfile.clear();
        getProfilePage().yourCompanyNameEditProfile.sendKeys(companyName);
    }
    @Then("user updates the Company's Address")
    public void user_updates_the_company_s_address() {
        companyAddress=Faker.instance().address().streetAddress();
        getProfilePage().companysAddressEditProfile.click();
        getProfilePage().companysAddressEditProfile.clear();
        getProfilePage().companysAddressEditProfile.sendKeys(companyAddress);
    }
    @Then("user updates the City, State, Zip")
    public void user_updates_the_city_state_zip() {
        companyCityStateZip=(Faker.instance().address().city()+", "
                +Faker.instance().address().state()+", "
                +Faker.instance().address().zipCode());
        getProfilePage().cityStateZipEditProfile.click();
        getProfilePage().cityStateZipEditProfile.clear();
        getProfilePage().cityStateZipEditProfile.sendKeys(companyCityStateZip);
    }
    @Then("user updates the Country")
    public void user_updates_the_country() {
        companyCountryNumber=Faker.instance().number().numberBetween(0,249);
       getProfilePage().changeCountryBox.click();
       getProfilePage().changeCountrySelectBox.click();
       Select select=new Select(getProfilePage().changeCountrySelectBox);
       select.selectByIndex(companyCountryNumber);
      // getProfilePage().cityStateZipEditProfile.click();
        String [] countries= getProfilePage().changeCountrySelectBox.getText().split("\\n");

        System.out.println(Arrays.toString(countries));
        companyCountry=countries[companyCountryNumber];
    }
    @Then("user updates the Company's URL")
    public void user_updates_the_company_s_url() {
        companyURL=Faker.instance().internet().url();
        getProfilePage().companysUrlEditProfile.click();
        getProfilePage().companysUrlEditProfile.clear();
        getProfilePage().companysUrlEditProfile.sendKeys(companyURL);
    }
    @Then("user updates the Company's Phone Number")
    public void user_updates_the_company_s_phone_number() {
        companyPhoneNumber=Faker.instance().phoneNumber().cellPhone();
        getProfilePage().companysEditPhoneNumberProfile.click();
        getProfilePage().companysEditPhoneNumberProfile.clear();
        getProfilePage().companysEditPhoneNumberProfile.sendKeys(companyPhoneNumber);
    }
    @Then("user updates the image")
    public void user_updates_the_image() {
        String path=System.getProperty("user.dir");
        String filePath=path+"\\src\\test\\resources\\files\\images\\desktop.jpeg";
        getProfilePage().changeImageButton.sendKeys(filePath);
       }
    @Then("user verifies -Company information has been updated- alert")
    public void user_verifies_company_information_has_been_updated_alert() {
       getProfilePage().yourCompanyInfoUpdatedAlert.isDisplayed();
    }
    @Then("user clicks on the company link")
    public void userClicksOnTheCompanyLink() {
        getProfilePage().yourCompanyLink.click();
    }
    @And("user verify all updates are as expected")
    public void userVerifyAllUpdatesAreAsExpected() {
        Assert.assertEquals(companyName,getProfilePage().attachedCompanyName.getText());
        Assert.assertEquals(companyAddress,getProfilePage().attachedCompanyAddress.getText());
        Assert.assertEquals(companyURL,getProfilePage().attachedCompanyURL.getText().toLowerCase().replace("ı","i"));
        Assert.assertEquals(companyPhoneNumber,getProfilePage().attachedCompanyPhone.getText());
        Assert.assertEquals(companyCityStateZip,getProfilePage().attachedCompanyCityStateZipcode.getText());
        Assert.assertEquals(companyCountry.toUpperCase().replace("İ","I"),getProfilePage().attachedCompanyCountry.getText().toUpperCase().replace("İ","I"));
      }

    @When("user clicks Profile Button")
    public void userClicksProfileButton() {
        BrowserUtilities.clickWithJS(getProfilePage().profileButton2);
    }
}
