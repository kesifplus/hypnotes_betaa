package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import javax.swing.text.html.CSS;
import java.util.List;

public class LoginRegisterPage extends BasePage {

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;

    @FindBy(css = "[name='username']")
    public WebElement emailBox;

    @FindBy(css = "[name='password']")
    public WebElement passwordBox;

    @FindBy(css = "[type='submit']")
    public WebElement submitButton;

    //START US_013
    //@FindBy(xpath = "//nav/a[10]")
    @FindBy(css = ".BaseNavbar_dropBtn__zkmnE.btn")
    public WebElement signUpButton;

    @FindBy(xpath = "//a[@href=\"/register/client\"]")
    public WebElement clientButton;

    @FindBy(css = "#social-media-login-logo-g")
    public WebElement googleIcon;

    @FindBy(xpath = "//input[@type=\"email\"]")
    public WebElement inputEmail;

    @FindBy(css = "VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b")
    public WebElement googleNextButton;

    @FindBy(css = "#social-media-login-logo-fb")
    public WebElement FacebookIcon;
    @FindBy(xpath = "//button[@title=\"Erforderliche und optionale Cookies erlauben\"]")
    public WebElement facebookCookies;
    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement facebookEmail;
    @FindBy(xpath = "//input[@name=\"pass\"]")
    public WebElement facebookPassword;

    @FindBy(xpath = "//button[@id=\"loginbutton\"]")
    public WebElement facebookLoginButton;

    @FindBy(css = "._9axz")
    public WebElement facebookTitle;

    @FindBy(css = "#social-media-login-logo-l")
    public WebElement linkedInIcon;

    //END US_013
    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement logRegPageSıgnUpButton;

    @FindBy(xpath = "//li/span/a[contains(text(),'Client')]")
    public List<WebElement> clientAndTherapist;

    @FindBy(xpath = "//li/span/a[contains(text(),'Therapist')]")
    public List<WebElement> clientAndTherapist2;

    @FindBy(xpath = "//*[text()='Client Register']")
    public WebElement clientRegisterTitle;

    @FindBy(xpath = "//*[contains(text(),'Already')]")
    public WebElement alreadyAccount;

    @FindBy(xpath = "(//*[contains(text(),'Login')])[2]")
    public WebElement accountLogin;

    @FindBy(xpath = "//button[@aria-checked='true']")
    public WebElement iAmTherapistButton;

    @FindBy(xpath = "//label[text()='I am therapist?']")
    public WebElement therapistTitle;

    @FindBy(xpath = "//label[text()='I am Client']")
    public WebElement clientTitle;

    @FindBy(xpath = "//button[@aria-checked='false'")
    public WebElement iAmClientButton;

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

//    @FindBy(xpath = "//div/label[text()='Attachments:']")
//    public WebElement attachmentsTitle;
//
//    @FindBy(xpath = "(//span[@role='img'])[37]")
//    public WebElement attachmentsAddButton;

//    @FindBy(css = "#addImageModalInput1848")
//    public WebElement chooseFile;

    @FindBy(xpath = "(//button[@class='close'])[2]")
    public WebElement closeButton;

    @FindBy(id = "record-icon1848")
    public WebElement voiceRecord;

    @FindBy(xpath = "//span[@aria-label='sound']")
    public WebElement soundıcon;

    @FindBy(xpath = "(//*[contains(text(),'Copy')])[2]")
    public WebElement copyButton;

    @FindBy(xpath = "(//*[contains(text(),'Send to client')])[2]")
    public WebElement sendClientButton;

    //@FindBy(xpath = "//*[contains(text(),'Extract " + "text to")
    //public WebElement extractTextToButton;

    //@FindBy(xpath = "//*[contains(text(),'Delete Voice")
    //public WebElement deleteVoiceButton;

    @FindBy(xpath = "//span[contains(text(),'Add Client')]")
    public WebElement addClient;

    @FindBy(xpath = "//*[contains(text(),'Extract text to")
    public WebElement extractTextToButton;

    @FindBy(xpath = "//*[contains(text(),'Delete Voice")
    public WebElement deleteVoiceButton;


    // @FindBy(xpath = "//span[contains(text(),'Add Client')]")
    // public WebElement addClient;

    // @FindBy (xpath = "//span[contains(text(),'Add Client')]")
    // public WebElement addClient ;


    @FindBy(xpath = "//span[normalize-space()='Import Clients']")
    public WebElement importClients;

    @FindBy(css = ".ant-modal-title")
    public WebElement importMethodTitle;

    @FindBy(css = ".ant-btn.ant-btn-default")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[normalize-space()='Start Meeting']")
    public WebElement startMeetingButton;

    @FindBy(xpath = "//span[normalize-space()='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//span[normalize-space()='Export Clients']")
    public WebElement exportClientsButton;

    @FindBy(xpath = "//span[contains(text(),'Add Client')]")
    public WebElement addClientButton;

    @FindBy(css = "#register_firstName")
    public WebElement addClientFirstName;

    @FindBy(css = "#register_lastName")
    public WebElement addClientLastName;

    @FindBy(xpath = "//button[.='Add Client']")
    public WebElement addClientAddClientButton;

    @FindBy(css = ".ant-btn-primary.ant-btn-sm")
    public WebElement addClientYes;

    @FindBy(xpath = "//input[@placeholder='Search Client by Name or Surname']")
    public WebElement searchClientsInput;

    @FindBy(xpath = "//span[contains(text(),'View Detail')]")
    public WebElement vievDetails;

    @FindBy(xpath = "//p[normalize-space()='Presenting Issue']")
    public WebElement presentingIssueButton;
    @FindBy(xpath = "//a[contains(@class,'problem_genricBtnPrimary__Ft9Lg problem_genricBtnCircle___fJKx arrow')]")
    public WebElement addNewProblemButton;

    @FindBy(xpath = "//p[normalize-space()='Sessions']")
    public WebElement sessions;

    @FindBy(xpath = "//div[@class='col-12 text-white my-2 d-flex']")
    public WebElement detailsection;

    @FindBy(xpath = "//textarea[@id='basic_nameOfCC']")
    public WebElement nameOfCC;
    @FindBy(xpath = "//span[normalize-space()='Submit']")
    public WebElement addNewProblemSubmit;

    @FindBy(xpath = "//div[contains(@class,'row mx-0 mb-3')]//a[1]")
    public WebElement clientInfoButton;

    @FindBy(xpath = "//button[contains(@name,'presentingIssuesBtn')]")
    public WebElement bottomPresentingIssue;

    @FindBy(xpath = "(//div[contains(@class, \"ant-card-head\")]  )[last()-1]")
    public WebElement bottomPresentingIssueLastChild;

    @FindBy(css = "h3[class='col-12 col-xs-9 col-sm-10 text-info d-flex align-items-center justify-content-center'] strong")
    public WebElement presentingIssueTitle;

    @FindBy(xpath = "//span[normalize-space()='Details']")
    public WebElement presentingIssueDetails;

    @FindBy(xpath = "//textarea[@name='nameOfCC']")
    public WebElement subjectiveNameOfCC;

    @FindBy(xpath = "//textarea[@name='briefStatement']")
    public WebElement subjectiveBriefStatement;

    @FindBy(xpath = "//span[normalize-space()='Successfully updated.']")
    public WebElement presentingIssueAlert;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logOut;
    @FindBy(xpath = "//div[contains(@class,\"ant-collapse-item\")]")
    public List<WebElement> presentingIssueList;
    // //div[@class="ant-collapse ant-collapse-icon-position-left problem_sectionCollapse__PVJzx"]/div
    @FindBy(xpath = ("//*[@name='fullname']"))
    public WebElement fullNameTherapist;
    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailTherapist;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordTherapist;
    @FindBy(xpath = "//*[@class='RegisterForm_SignUpBtnInvalid__FtjCT']")
    public WebElement signUpTherapist;
    @FindBy(css = ".ant-dropdown-trigger.BaseNavbar_dropBtn__zkmnE.btn")
    public WebElement mainSignUp;
    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement timezoneAlertYes;




}



