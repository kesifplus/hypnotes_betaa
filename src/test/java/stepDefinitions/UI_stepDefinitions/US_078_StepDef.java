package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BasePage;
import pages.ProfilePage;

public class US_078_StepDef extends BasePage {
    ProfilePage pp = new ProfilePage();

    @Given("user click profile")
    public void userClickProfile() {
        getProfilePage().profileButton.click();
    }

    @And("user assert {string} text visible")
    public void userAssertTextVisible(String aboutheader) {
       String title = (getProfilePage().aboutHeading.getText());
       Assert.assertEquals(title, "About");
    }

    @And("user assert  Profile information of the therapist should be visible")
    public void userAssertProfileInformationOfTheTherapistShouldBeVisible() {
        String title = (getProfilePage().profiletext.getText());
        Assert.assertEquals(title, "profileinformation");

    }

    @And("user assert {string},{string}, {string}, {string} titles must be visible")
    public void userAssertTitlesMustBeVisible(String Educations, String Experiences, String SpecialtiesAndCertifications, String YourCompany) {
    }
      //Assert.assertTrue(pp.educationsButton.isDisplayed());
      // Assert.assertTrue(pp.experiencesButton.isDisplayed());
      //  Assert.assertTrue(pp.SpecialtiesAndCertifications.isDisplayed());
       //  Assert.assertTrue(pp.YourCompany.isDisplayed());


    @And("user click {string} button")
    public void userClickButton(String addneweducationbutton) {
    }
         // pp.addNewEducationButton.click();

    @And("user enter {string}, {string}, {string}, {string}, {string}")
    public void userEnter(String SchoolName, String Department, String StartDate, String EndDate, String Description) {
    }

    @And("user click save button")
    public void userClickSaveButton() {
    }
     // pp.EducationSaveButton.click();
    @And("user assert added Educations should be visible when entering the page")
    public void userAssertAddedEducationsShouldBeVisibleWhenEnteringThePage() {
    }

    @And("user click {string}")
    public void userClick(String Makemyprofilepublicswitchbutton) {
    }

    @And("user assert {string} page visible")
    public void userAssertPageVisible(String  arg0) {
    }

    @And("user enter {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userEnter(String  FullName , String  JobTitle, String Country , String State, String  City, String Address, String  ZipCode, String AboutMe) {
    }

    @And("user verifies {string} message")
    public void userVerifiesMessage(String arg0) {
    }

    @And("user verifies Saved information must be visible on Profile page")
    public void userVerifiesSavedInformationMustBeVisibleOnProfilePage() {
    }

    @And("user assert {string} clickable and visible")
    public void userAssertClickableAndVisible(String arg0) {
    }



    }

