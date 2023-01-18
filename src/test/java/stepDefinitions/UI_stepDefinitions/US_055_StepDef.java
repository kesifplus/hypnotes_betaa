package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_055_StepDef extends BasePage {
    Actions actions=new Actions(Driver.getDriver());
    @And("user search client {string}")
    public void userSearchClient(String clientName) {
        BrowserUtilities.clickWithJS(getLoginRegisterPage().searchClientsBox);
        getLoginRegisterPage().searchClientsBox.sendKeys(clientName);
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);
    }
    @And("user creates a new problem {string}")
    public void userCreatesANewProblem(String problem) {
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().nameOfCC.sendKeys(problem);
        getLoginRegisterPage().addNewProblemSubmit.click();
    }
    @Then("verify -Chief or Primary Complaint- text is visible")
    public void verify_chief_or_primary_complaint_text_is_visible() {
        Assert.assertEquals("Chief or Primary Complaint (CC)",getPresentingIssuePage().chiefOfPrimaryComplaintText.getText());
    }
    @Then("enter Name Of CC Box new value")
    public void enter_name_of_cc_box_new_value() {
        BrowserUtilities.clickWithJS(getPresentingIssuePage().nameOfCCBox);
        BrowserUtilities.waitFor(3);
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().nameOfCCBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().nameOfCCBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().nameOfCCBox.sendKeys(Keys.TAB);
    }
    @Then("verify -Successfully updated- message")
    public void verify_successfully_updated_message() {
        BrowserUtilities.waitForVisibility(getPresentingIssuePage().successfullyUpdatedAlert,3);
        Assert.assertTrue(getPresentingIssuePage().successfullyUpdatedAlert.isDisplayed());
    }
    @Then("enter Brief Statement Box new value")
    public void enter_brief_statement_box_new_value() {
        getPresentingIssuePage().briefStatementBox.click();
         for (int i = 0; i <30 ; i++) {
         getPresentingIssuePage().briefStatementBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().briefStatementBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().briefStatementBox.sendKeys(Keys.TAB);
        }
    @Then("enter Onset Box new value")
    public void enter_onset_box_new_value() {
        getPresentingIssuePage().onsetBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().onsetBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().onsetBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().onsetBox.sendKeys(Keys.TAB);
    }
    @Then("enter Location Box new value")
    public void enter_location_box_new_value() {
        getPresentingIssuePage().locationBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().locationBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().locationBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().locationBox.sendKeys(Keys.TAB);
    }
    @Then("enter Duration Box new value")
    public void enter_duration_box_new_value() {
        getPresentingIssuePage().durationBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().durationBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().durationBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().durationBox.sendKeys(Keys.TAB);
    }
    @Then("enter Character Box new value")
    public void enter_character_box_new_value() {
        getPresentingIssuePage().characterBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().characterBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().characterBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().characterBox.sendKeys(Keys.TAB);
    }
    @Then("enter Alleviating Box new value")
    public void enter_alleviating_box_new_value() {
        getPresentingIssuePage().alleviatingBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().alleviatingBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().alleviatingBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().alleviatingBox.sendKeys(Keys.TAB);
    }
    @Then("enter Radiation Box new value")
    public void enter_radiation_box_new_value() {
        getPresentingIssuePage().radiationBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().radiationBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().radiationBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().radiationBox.sendKeys(Keys.TAB);
    }
    @Then("enter Temporal Pattern Box new value")
    public void enter_temporal_pattern_box_new_value() {
        getPresentingIssuePage().temporalPatternBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().temporalPatternBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().temporalPatternBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().temporalPatternBox.sendKeys(Keys.TAB);
    }
    @Then("enter Severity Box new value")
    public void enter_severity_box_new_value() {
        getPresentingIssuePage().severityBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().severityBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().severityBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().severityBox.sendKeys(Keys.TAB);
    }
    @Then("enter Pertinent History Box new value")
    public void enter_pertinent_history_box_new_value() {
        getPresentingIssuePage().pertinentHistoryBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().pertinentHistoryBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().pertinentHistoryBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().pertinentHistoryBox.sendKeys(Keys.TAB);
    }
    @Then("enter Surgical History Box new value")
    public void enter_surgical_history_box_new_value() {
        getPresentingIssuePage().surgicalHistoryBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().surgicalHistoryBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().surgicalHistoryBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().surgicalHistoryBox.sendKeys(Keys.TAB);
    }
    @Then("enter Social History Box new value")
    public void enter_social_history_box_new_value() {
        getPresentingIssuePage().socialHistoryBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().socialHistoryBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().socialHistoryBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().socialHistoryBox.sendKeys(Keys.TAB);
    }
    @Then("enter Review Of Symptoms Box new value")
    public void enter_review_of_symptoms_box_new_value() {
        getPresentingIssuePage().reviewOfSymptomsBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().reviewOfSymptomsBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().reviewOfSymptomsBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().reviewOfSymptomsBox.sendKeys(Keys.TAB);
    }
    @Then("enter Current Medications Box new value")
    public void enter_current_medications_box_new_value() {
        getPresentingIssuePage().currentMedicationsBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().currentMedicationsBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().currentMedicationsBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().currentMedicationsBox.sendKeys(Keys.TAB);
        BrowserUtilities.waitFor(1);
    }
    @And("user deletes the problem")
    public void userDeletesTheProblem() {
        getPresentingIssuePage().deleteIssueButton.click();
        BrowserUtilities.clickWithJS(getPresentingIssuePage().areYouSureYesButton);
    }
    @And("verify -Issue is successfully deleted.- alert")
    public void verifyIssueIsSuccessfullyDeletedAlert() {
        BrowserUtilities.waitForVisibility(getPresentingIssuePage().issueIsSuccessfullyDeletedAlert,3);
        Assert.assertTrue(getPresentingIssuePage().issueIsSuccessfullyDeletedAlert.isDisplayed());
    }
    @Then("click and pass Name Of CC Box")
    public void click_and_pass_name_of_cc_box() {
        BrowserUtilities.waitForVisibility(getPresentingIssuePage().nameOfCCBox,3);
        getPresentingIssuePage().nameOfCCBox.click();
        getPresentingIssuePage().nameOfCCBox.sendKeys(Keys.TAB);
          }
    @Then("click and pass Brief Statement Box")
    public void click_and_pass_brief_statement_box() {
        getPresentingIssuePage().briefStatementBox.click();
        getPresentingIssuePage().briefStatementBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Onset Box")
    public void click_and_pass_onset_box() {
        getPresentingIssuePage().onsetBox.click();
        getPresentingIssuePage().onsetBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Location Box")
    public void click_and_pass_location_box() {
        getPresentingIssuePage().locationBox.click();
       getPresentingIssuePage().locationBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Duration Box")
    public void click_and_pass_duration_box() {
        getPresentingIssuePage().durationBox.click();
        getPresentingIssuePage().durationBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Character Box")
    public void click_and_pass_character_box() {
        getPresentingIssuePage().characterBox.click();
        getPresentingIssuePage().characterBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Alleviating Box")
    public void click_and_pass_alleviating_box() {
        getPresentingIssuePage().alleviatingBox.click();
        getPresentingIssuePage().alleviatingBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Radiation Box")
    public void click_and_pass_radiation_box() {
        getPresentingIssuePage().radiationBox.click();
        getPresentingIssuePage().radiationBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Temporal Pattern Box")
    public void click_and_pass_temporal_pattern_box() {
        getPresentingIssuePage().temporalPatternBox.click();
        getPresentingIssuePage().temporalPatternBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Severity Box")
    public void click_and_pass_severity_box() {
        getPresentingIssuePage().severityBox.click();
        getPresentingIssuePage().severityBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Pertinent History Box")
    public void click_and_pass_pertinent_history_box() {
        getPresentingIssuePage().pertinentHistoryBox.click();
        getPresentingIssuePage().pertinentHistoryBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Surgical History Box")
    public void click_and_pass_surgical_history_box() {
        getPresentingIssuePage().surgicalHistoryBox.click();
        getPresentingIssuePage().surgicalHistoryBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Social History Box")
    public void click_and_pass_social_history_box() {
        getPresentingIssuePage().socialHistoryBox.click();
        getPresentingIssuePage().socialHistoryBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Review Of Symptoms Box")
    public void click_and_pass_review_of_symptoms_box() {
        getPresentingIssuePage().reviewOfSymptomsBox.click();
        getPresentingIssuePage().reviewOfSymptomsBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Current Medications Box")
    public void click_and_pass_current_medications_box() {
        getPresentingIssuePage().currentMedicationsBox.click();
        getPresentingIssuePage().currentMedicationsBox.sendKeys(Keys.TAB);
    }
    @Then("user clicks Objective Link")
    public void user_clicks_objective_link() {
       BrowserUtilities.waitForClickability(getPresentingIssuePage().objectiveLink,3);
       BrowserUtilities.clickWithJS(getPresentingIssuePage().objectiveLink);
    }
    @Then("enter Physical Presentation Box new value")
    public void enter_physical_presentation_box_new_value() {
        getPresentingIssuePage().physicalPresentationBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().physicalPresentationBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().physicalPresentationBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().physicalPresentationBox.sendKeys(Keys.TAB);
    }
    @Then("enter Characterization Box new value")
    public void enter_characterization_box_new_value() {
        getPresentingIssuePage().characterizationBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().characterizationBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().characterizationBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().characterizationBox.sendKeys(Keys.TAB);
    }
    @Then("enter Psychological Status Box new value")
    public void enter_psychological_status_box_new_value() {
        getPresentingIssuePage().psychologicalStatusBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().psychologicalStatusBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().psychologicalStatusBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().psychologicalStatusBox.sendKeys(Keys.TAB);
    }
    @Then("enter Laboratory Results Box new value")
    public void enter_laboratory_results_box_new_value() {
        getPresentingIssuePage().laboratoryResultsBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().laboratoryResultsBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().laboratoryResultsBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().laboratoryResultsBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Physical Presentation Box")
    public void click_and_pass_physical_presentation_box() {
        getPresentingIssuePage().physicalPresentationBox.click();
        getPresentingIssuePage().physicalPresentationBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Characterization Box")
    public void click_and_pass_characterization_box() {
        getPresentingIssuePage().characterizationBox.click();
        getPresentingIssuePage().characterizationBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Psychological Status Box")
    public void click_and_pass_psychological_status_box() {
        getPresentingIssuePage().psychologicalStatusBox.click();
        getPresentingIssuePage().psychologicalStatusBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Laboratory Results Box")
    public void click_and_pass_laboratory_results_box() {
        getPresentingIssuePage().laboratoryResultsBox.click();
        getPresentingIssuePage().laboratoryResultsBox.sendKeys(Keys.TAB);
    }
    @Then("user clicks Assessment Link")
    public void user_clicks_assessment_link() {
       BrowserUtilities.waitForClickability(getPresentingIssuePage().assessmentLink,3);
        BrowserUtilities.clickWithJS(getPresentingIssuePage().assessmentLink);
    }
    @Then("enter Diagnosis Or Problem Box new value")
    public void enter_diagnosis_or_problem_box_new_value() {
        getPresentingIssuePage().diagnosisOrProblemBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().diagnosisOrProblemBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().diagnosisOrProblemBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().diagnosisOrProblemBox.sendKeys(Keys.TAB);
    }
    @Then("enter Differential Diagnosis Box new value")
    public void enter_differential_diagnosis_box_new_value() {
        getPresentingIssuePage().differentialDiagnosisBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().differentialDiagnosisBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().differentialDiagnosisBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().differentialDiagnosisBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Diagnosis Or Problem Box")
    public void click_and_pass_diagnosis_or_problem_box() {
        getPresentingIssuePage().diagnosisOrProblemBox.click();
        getPresentingIssuePage().diagnosisOrProblemBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Differential Diagnosis Box")
    public void click_and_pass_differential_diagnosis_box() {
        getPresentingIssuePage().differentialDiagnosisBox.click();
        getPresentingIssuePage().differentialDiagnosisBox.sendKeys(Keys.TAB);
    }
    @Then("user clicks Plan Link")
    public void user_clicks_plan_link() {
       BrowserUtilities.waitForClickability(getPresentingIssuePage().planLink,3);
       BrowserUtilities.clickWithJS(getPresentingIssuePage().planLink);
    }
    @Then("enter Medication Prescribed Box new value")
    public void enter_medication_prescribed_box_new_value() {
        getPresentingIssuePage().medicationPrescribedBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().medicationPrescribedBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().medicationPrescribedBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().medicationPrescribedBox.sendKeys(Keys.TAB);
    }
    @Then("enter Psychoeducation Box new value")
    public void enter_psychoeducation_box_new_value() {
        getPresentingIssuePage().psychoeducationBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().psychoeducationBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().psychoeducationBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().psychoeducationBox.sendKeys(Keys.TAB);
    }
    @Then("enter Testing Box new value")
    public void enter_testing_box_new_value() {
        getPresentingIssuePage().testingBox.click();
        for (int i = 0; i <30 ; i++) {
            getPresentingIssuePage().testingBox.sendKeys(Keys.BACK_SPACE);
        }
        getPresentingIssuePage().testingBox.sendKeys(Faker.instance().name().name());
        getPresentingIssuePage().testingBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Medication Prescribed Box")
    public void click_and_pass_medication_prescribed_box() {
        getPresentingIssuePage().medicationPrescribedBox.click();
        getPresentingIssuePage().medicationPrescribedBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Psychoeducation Box")
    public void click_and_pass_psychoeducation_box() {
        getPresentingIssuePage().psychoeducationBox.click();
        getPresentingIssuePage().psychoeducationBox.sendKeys(Keys.TAB);
    }
    @Then("click and pass Testing Box")
    public void click_and_pass_testing_box() {
        getPresentingIssuePage().testingBox.click();
        getPresentingIssuePage().testingBox.sendKeys(Keys.TAB);
    }
}
