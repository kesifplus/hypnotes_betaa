package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PresentingIssuePage extends BasePage{

    @FindBy(xpath = "//*[text()='Chief or Primary Complaint (CC)']")
    public WebElement chiefOfPrimaryComplaintText;
    @FindBy(xpath = "//*[@name='nameOfCC']")
    public WebElement nameOfCCBox;
    @FindBy(xpath = "//*[@name='briefStatement']")
    public WebElement briefStatementBox;
    @FindBy(xpath = "//*[@name='onset']")
    public WebElement onsetBox;
    @FindBy(xpath = "//*[@name='location']")
    public WebElement locationBox;
    @FindBy(xpath = "//*[@name='duration']")
    public WebElement durationBox;
    @FindBy(xpath = "//*[@name='currentCharacter']")
    public WebElement characterBox;
    @FindBy(xpath = "//*[@name='alleviating']")
    public WebElement alleviatingBox;
    @FindBy(xpath = "//*[@name='radiation']")
    public WebElement radiationBox;
    @FindBy(xpath = "//*[@name='temporalPattern']")
    public WebElement temporalPatternBox;
    @FindBy(xpath = "//*[@name='severity']")
    public WebElement severityBox;
    @FindBy(xpath = "//*[@name='pertinentHistory']")
    public WebElement pertinentHistoryBox;
    @FindBy(xpath = "//*[@name='surgicalHistory']")
    public WebElement surgicalHistoryBox;
    @FindBy(xpath = "//*[@name='socialHistory']")
    public WebElement socialHistoryBox;
    @FindBy(xpath = "//*[@name='reviewOfSymptoms']")
    public WebElement reviewOfSymptomsBox;
    @FindBy(xpath = "//*[@name='currentMedications']")
    public WebElement currentMedicationsBox;
    @FindBy(xpath = "//*[text()='Successfully updated.']")
    public WebElement successfullyUpdatedAlert;
    @FindBy(xpath = "//*[text()='Delete Issue']")
    public WebElement deleteIssueButton;
    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement areYouSureYesButton;
    @FindBy(xpath = "//*[text()='Issue is successfully deleted.']")
    public WebElement issueIsSuccessfullyDeletedAlert;
    @FindBy(xpath = "//*[text()='Objective']")
    public WebElement objectiveLink;
    @FindBy(xpath = "//*[@name='physicalPresentation']")
    public WebElement physicalPresentationBox;
    @FindBy(xpath = "//*[@name='characterization']")
    public WebElement characterizationBox;
    @FindBy(xpath = "//*[@name='psychologicalStatus']")
    public WebElement psychologicalStatusBox;
    @FindBy(xpath = "//*[@name='laboratoryResults']")
    public WebElement laboratoryResultsBox;
    @FindBy(xpath = "//*[text()='Assessment']")
    public WebElement assessmentLink;
    @FindBy(xpath = "//*[@name='diagnosisOrProblem']")
    public WebElement diagnosisOrProblemBox;
    @FindBy(xpath = "//*[@name='differentialDiagnosis']")
    public WebElement differentialDiagnosisBox;
    @FindBy(xpath = "//*[text()='Plan']")
    public WebElement planLink;
    @FindBy(xpath = "//*[@name='medicationPrescribed']")
    public WebElement medicationPrescribedBox;
    @FindBy(xpath = "//*[@name='psychoeducation']")
    public WebElement psychoeducationBox;
    @FindBy(xpath = "//*[@name='testing']")
    public WebElement testingBox;


}
