package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClientInfoPage extends BasePage {
    @FindBy(xpath = "//p[@class='title'][1]")
    public WebElement clientInfo;

    @FindBy(xpath = "//p[@class='title']")
    public List<WebElement> topTitles;

    @FindBy(xpath = "//*[@type='button']")
    public List<WebElement> subTitles;


   @FindBy(xpath = "//p[normalize-space()='Sessions']")
    public WebElement sessions;

   @FindBy(xpath = "//span[normalize-space()='Delete Session']")
    public WebElement deleteButton;

   @FindBy(xpath = "//span[normalize-space()='Yes']")
    public WebElement deleteYesButton;

   @FindBy(xpath = "//span[normalize-space()='Session is successfully deleted.']")
    public WebElement deleteAlertMessage;


   // @FindBy(xpath = "//*[@type='button']")
   // public List<WebElement> subTitles;

    @FindBy(linkText = "Clients")
    public WebElement clientsPage;

    @FindBy(xpath = "//input[@placeholder='Search Client by Name or Surname']")
    public WebElement searchClientsBox;

    @FindBy(xpath = "//*[contains(text(),'View Detail')]")
    public WebElement clientViewDetail;


    @FindBy(xpath = "(//p[@class='title'])[2]")
    public WebElement presentingIssue;

    @FindBy(xpath = "//div/p[text()='Additional Notes']")
    public WebElement additionalNotesButton;

    @FindBy(xpath = "(//button[@class='close'])[2]")
    public WebElement closeButton;

    @FindBy(xpath = "//span[@aria-label='sound']")
    public WebElement soundıcon;

    @FindBy(xpath = "(//*[contains(text(),'Copy')])[2]")
    public WebElement copyButton;

    @FindBy(xpath = "(//*[contains(text(),'Send to client')])[2]")
    public WebElement sendClientButton;

    @FindBy(xpath = "//*[contains(text(),'Extract text to')]")
    public WebElement extractTextToButton;

    @FindBy(xpath = "//*[contains(text(),'Delete Voice')]")
    public WebElement deleteVoiceButton;

//    @FindBy(xpath = "//div/label[text()='Attachments:']")
//    public WebElement attachmentsTitle;
//
//    @FindBy(xpath = "(//span[@role='img'])[37]")
//    public WebElement attachmentsAddButton;

   @FindBy(css = "#addImageModalInput1848")
   public WebElement chooseFile;

    @FindBy(xpath = "//label[text()='Voice Notes:']")
    public WebElement voiceNoticeTitle;

    @FindBy(css = "div>img[id^=record-icon]")
    public WebElement voiceRecordMicrophone;

    @FindBy(xpath = "//*[contains(text(),'Recording added.')]")
    public WebElement recordingAddedMessage;

    @FindBy(xpath = "//span[@aria-label='sound']")
    public WebElement lautsprecherIcon;

    @FindBy(xpath = "//div/audio[@type='audio/mpeg']")
    public WebElement playIcon;

    @FindBy(xpath = "(//*[contains(text(),'Send to client')])[2]")
    public WebElement sendToClientButton;

    @FindBy(css = "div.ant-popover-message-title")
    public WebElement deleteAkzeptMesajFrage;

    @FindBy(xpath = "//*[contains(text(),'Yes')]")
    public WebElement deleteAkzeptButton;

    @FindBy(xpath = "(//p[@class='title'])[3]")
    public WebElement sessions1;

    @FindBy(id = "#voiceModalText")
    public WebElement extractTextToBox;

    @FindBy(xpath = "//*[contains(text(),'Succesfully')]")
    public WebElement successmesaj;

    @FindBy(xpath = "//*[contains(text(),'Text copied to your clipboard!')]")
    public WebElement copyOnayMessage;

    @FindBy(xpath = "//*[contains(text(),'Voice is succesfully deleted.')]")
    public WebElement deleteSuccesMessage;

    @FindBy(xpath = "//*[contains(text(),'202')]")
    public WebElement recordDate;

    //us_068
    @FindBy(xpath = "//div/span[contains(text(),'Group Session')]")
    public WebElement groupSessionButton;

    @FindBy(xpath = "//*[contains(text(),'Add New Sessions')]")
    public WebElement addNewSessions;

    @FindBy(linkText = "Show All Subscription Plans")
    public WebElement showAllSubscriptionPlans;

    @FindBy(xpath = "[//button[@target='_blank']")
    public WebElement cancelButton;

    @FindBy(css = "p.m-0")
    public List<WebElement> subscriptionsList;

    @FindBy(xpath = "//*[text()='Activate']")
    public List<WebElement> activateButton;

    @FindBy(xpath = "//*[@data-icon='plus-circle']")
    public WebElement plusCircle;
    @FindBy(xpath = "(//div[@role='button'])[5]")
    public WebElement additionalNote;
    @FindBy(xpath = "//label[normalize-space()='Attachments:']")
    public WebElement attachments;
    @FindBy(css = "svg")
    public WebElement attachmentButton;


    @FindBy(xpath = "//*[text()='Add new problem']")
    public WebElement addNewProblem;

    @FindBy(xpath = "//*[@id='basic_nameOfCC']")
    public WebElement nameOf;

    @FindBy(xpath = "//*[@id='basic_briefStatement']")
    public WebElement briefStatement;

    @FindBy(xpath = "//*[@id='basic_location']")
    public WebElement basicLocation;
    @FindBy(xpath = "//*[@id='basic_currentCharacter']")
    public WebElement currentCharacter;
    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement submit;
   @FindBy(css = "#addImageModalInput2538")
    public WebElement imageInput;

    // @FindBy(xpath = "//input[@id='addImageModalInput2538']")
    //  public WebElement imageInput;
    @FindBy(xpath = "//img[@class='images_noteImageThumbnail__PbFxv']")
    public WebElement image;


    @FindBy(xpath = "//button[normalize-space()='Copy']")
    public WebElement copy;

    @FindBy(xpath = "//*[text()='Extract text']")
    public WebElement extractText;
    @FindBy(xpath = "//*[text()='Send to client']")
    public WebElement sendClient;
    @FindBy(xpath = "//*[text()='Delete File']")
    public WebElement deleteFile;
//

    @FindBy(xpath = "//*[text()='Services']")
    public WebElement service;

    @FindBy(xpath = "//*[text()='Add New Individual Sessions']")
    public WebElement individualSession ;

    @FindBy(xpath = "//*[text()='Packages']")
    public WebElement packages ;

    @FindBy(xpath = "//*[text()='Generate Scheduler URL']")
    public WebElement generateSchedulerUrl ;

    @FindBy(xpath = "//*[text()='Add New Individual Sessions']")
    public WebElement addNewIndividualSession ;

    @FindBy(xpath = "//*[text()='Group Session']")
    public WebElement groupSession ;

    @FindBy(xpath = "//*[text()='Add New Package']")
    public WebElement addNewPackage ;

    @FindBy(xpath = "//*[text()='Add New Sessions']")
    public WebElement addNewSession ;

@FindBy(xpath = "//button[@type()='button']")
    public WebElement deleteIssueButton;
    @FindBy(xpath = "//span[normalize-space()='Yes']")
    public WebElement yesButton;

    @FindBy(xpath = "//span[normalize-space()='No']")
    public WebElement noButton;




    //    US_50

    @FindBy(id = "editBtn")
    public WebElement editButton;

    @FindBy(id = "client_name")
    public WebElement firstNameBox;

    @FindBy(id = "client_surname")
    public WebElement lastNameBox;

    @FindBy(xpath = "(//*[.='Please input your First Name!'])[3]")
    public WebElement warningFirstName;

    @FindBy(xpath = "(//*[.='Please input your Last Name!'])[3]")
    public WebElement warningLastName;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(css = ".ant-popover-message-title")
    public WebElement areYouSurePop;

    @FindBy(xpath = "//span[.='Yes']")
    public WebElement yesButtonStoryElli;

    @FindBy(xpath = "//span[.='Client Info has been successfully updated!✅']")
    public WebElement successUpdate;

    @FindBy(css = ".ant-form-item-explain-error")
    public List<WebElement> alerts;

    @FindBy(css = "[style=\"margin: 30px;\"]")
    public List<WebElement> allClients;

    @FindBy(id="cancelBtn")
    public WebElement addCancelButton;

    //US_048_42_52
    @FindBy(xpath = "//button[@name='docBtn']")
    public WebElement clientInfoDocumentsButton;

    @FindBy(xpath = "(//div[@class='ant-tabs-nav-wrap'])//div//div//div")
    public List<WebElement> tabListClientInfoDocuments;

    @FindBy(xpath = "(//div[@class='ant-tabs-tab-btn'])[1]")
    public WebElement uploadedDocumentsInTable;

    @FindBy(xpath = "//input[@placeholder='Search Client by Name or Surname']")
    public WebElement searchClientInput;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-input-search-button']")
    public WebElement searchClientInputBtn;

    @FindBy(xpath = "//span[.=\" Name \"]")
    public WebElement searchClientDropdownName;

    @FindBy(xpath = "//span[.=\" Surname \"]")
    public WebElement searchClientDropdownSurname;

    @FindBy(xpath = "//span[.=\" Date Added \"]")
    public WebElement searchClientDropdownDateAdded;





    @FindBy(xpath = "(//*[contains(text(),'Cancel')])[2]")
    public WebElement cancelButtonSessionGrup;
//us 68
    @FindBy(xpath = "//*[text()='Add Session']")
    public WebElement addSessionPage;

    @FindBy(xpath= "(//textarea[@placeholder='Please enter a name'])[2]")
    public WebElement addSessionName;

    @FindBy(xpath = "(//input[@autocomplete='off'])[5]")
    public WebElement addSessionPrice;

    @FindBy(xpath= "(//span[@class='ant-select-selection-placeholder'])[2]")
    public WebElement addSessionDuration;

    @FindBy(xpath = "(//input[@role='spinbutton'])[5]")
    public WebElement addSessionAttendeeInput;

    @FindBy(xpath = "(//span[@aria-label='down'])[4]")
    public WebElement addSessionAttendeeDown;

    @FindBy(xpath = "(//span[@aria-label='up'])[4]")
    public WebElement addSessionAttendeeUp;

    @FindBy(xpath = "(//input[@autocomplete='off'])[8]")
    public WebElement addSessionDate;

    @FindBy(id = "sessionTime")
    public WebElement addSessionTime;

    @FindBy(xpath = "(//div[@class='rc-time-picker-panel-select'])[1]")
    public List<WebElement> addSessionTimeTag;

    @FindBy(xpath = "(//div[@class='rc-time-picker-panel-select'])[2]")
    public List<WebElement> addSessionTimeMonat;

    @FindBy(xpath = "(//div[@class='rc-time-picker-panel-select'])[3]")
    public List<WebElement> addSessionTimeAmPm;

    @FindBy(xpath = "(//textarea[@placeholder='Please enter description'])[2]")
    public WebElement sessionDescription;
    @FindBy(xpath = "//div[@class=\"modal-body row m-0 justify-content-center\"]/button\n" + "\n")
    public List <WebElement> underFotoButtons;

    @FindBy(css=".ant-typography.ant-typography-success")
    public List<WebElement>viewDetailList;


}

