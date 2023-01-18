package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    @FindBy (xpath = "//a[normalize-space()='Profile']")
    public WebElement profileButton;

    @FindBy(css = "ant-typography __web-inspector-hide-shortcut")
    public WebElement aboutHeading;

    @FindBy(css = "ant-col.ant-col-16")
    public WebElement profiletext;

    @FindBy(css = "ant-space ant-space-vertical ant-space-align-end")
    public WebElement profileInformation;

    @FindBy(css = ".ant-tabs-tab.ant-tabs-tab-active")
    public WebElement educationsButton;

    @FindBy (xpath = "//div[@id='rc-tabs-3-tab-3']")
    public WebElement SpecialtiesAndCertifications;

    @FindBy(css= ".ant-tabs-tab.ant-tabs-tab-active")
    public WebElement YourCompanyButton;

    @FindBy (xpath = "//span[normalize-space()='Add New Education']")
    public WebElement addNewEducationButton;

    @FindBy (xpath = "")
    public WebElement EducationSchoolName;

    @FindBy (xpath = "")
    public WebElement EducationDepartment;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//label[@title='Start Date'][normalize-space()='Start Date']")
    public WebElement EducationStartDate;

    @FindBy (xpath = " //div[@class='ant-drawer ant-drawer-right ant-drawer-open']//label[@title='End Date'][normalize-space()='End Date']")
    public WebElement EducationEndDate;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//label[@title='Description'][normalize-space()='Description']")
    public WebElement EducationDescription;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//span[contains(text(),'Save')]")
    public WebElement EducationSaveButton;


    @FindBy(xpath = "//button[@class=\"invoice_imageChange__eejJa\"]")
    public WebElement imageChangeEditProfile;
    @FindBy(css = ".ant-tabs-tab.ant-tabs-tab-active")
    public WebElement yourCompanyProfile;
    @FindBy(css = ".ant-tabs-content-holder")
    public WebElement addNewCompanyProfile;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement yourLogoProfile;
    @FindBy(xpath = "//input[@placeholder='Your Company']")
    public WebElement yourCompanyNameEditProfile;
    @FindBy(xpath = "//input[@placeholder=\"Company's Address\"]")
    public WebElement companysAddressEditProfile;
    @FindBy(xpath = "//input[@placeholder=\"City, State, Zip\"]")
    public WebElement cityStateZipEditProfile;
    @FindBy(xpath = "//input[@value=\"United States\"]")
    public WebElement unitedStateEditProfile;
    @FindBy(xpath = "//input[@placeholder=\"Company's URL\"]")
    public WebElement companysUrlEditProfile;
    @FindBy(xpath = "//input[@placeholder=\"Company's Phone Number\"]")
    public WebElement companysEditPhoneNumberProfile;
    @FindBy(xpath = "//input[@placeholder=\"Company's Email\"]")
    public WebElement companysEditEmailProfile;
    @FindBy(xpath = "//span[text()='Update']")
    public WebElement updateButtonEditProfile;
    // fotoya bakman gerekebilir





    @FindBy (xpath = "//div[@id='rc-tabs-0-tab-2']")
    public   WebElement experiencesButton;

    @FindBy (xpath = "//span[normalize-space()='Add New Experience']")
    public WebElement addNewExperienceButton;

    @FindBy (xpath = "//div[contains(text(),'Create a new Experience')]")
    public WebElement createANewExperienceText;

    @FindBy (xpath = "//label[@title='Company Name']")
    public WebElement experienceCompanyName;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//label[@title='Job Title'][normalize-space()='Job Title']")
    public WebElement experienceJobTitle;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//label[@title='Start Date'][normalize-space()='Start Date']")
    public WebElement experienceStartDate;

    @FindBy (xpath = " //div[@class='ant-drawer ant-drawer-right ant-drawer-open']//label[@title='End Date'][normalize-space()='End Date']")
    public WebElement experienceEndDate;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//label[@title='Description'][normalize-space()='Description']")
    public WebElement experienceDescription;

    @FindBy (xpath = " //input[@id='company']")
    public WebElement experienceCompanyNameInput;
    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//input[@id='jobTitle']")
    public WebElement experienceJobtitleInput;

    @FindBy (xpath = "//div[@class='ant-picker ant-picker-focused']//input[@id='startedAt']")
    public WebElement experienceStartDateInput;
    @FindBy (xpath = "//div[@class='ant-picker ant-picker-focused']//input[@id='enddedAt']")
    public WebElement experienceEndDateInput;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//textarea[@id='description']")
    public WebElement experienceDescriptionInput;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//span[contains(text(),'Save')]")
    public WebElement experienceSaveButton;

    @FindBy(xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//div[@class='ant-drawer-content-wrapper']//div[@class='ant-drawer-content']//div[@class='ant-drawer-wrapper-body']//div[@class='ant-drawer-footer']//div//span[contains(text(),'Cancel')]\n")
    public WebElement experienceCancelButton;

    @FindBy (xpath = "//span[normalize-space()='Experience is added']")
    public  WebElement alertExperienceIsAddMessage;

    @FindBy (xpath = "//span[normalize-space()='Add New Specialty']")
    public WebElement addNewSpecialty;

    @FindBy(xpath = "//div[@id=':r3:']")
    public WebElement addSpecialtyTitle;

    @FindBy (xpath = "//input[@id='form_in_modal_speciality']")
    public WebElement selectOneSpecialtyDropDown;

    @FindBy (xpath = "//span[normalize-space()='Create']")
    public WebElement addSpecialtyCreateButton;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-default']//span[contains(text(),'Cancel')]")
    public WebElement getAddSpecialtyCancelButton;



    @FindBy(xpath = "//input[@id='schoolName']")
    public WebElement educationSchollName;

    @FindBy(xpath = "//input[@id='department']")
    public WebElement educationDepartment;

    @FindBy(xpath = "//input[@id='startedAt']")
    public WebElement educationStartDate;

    @FindBy (xpath = "//div[@class='ant-drawer ant-drawer-right ant-drawer-open']//button[@type='submit']")
    public WebElement educationSaveButton;

    @FindBy (xpath = "//span[normalize-space()='Education is added']")
    public  WebElement alertMessage;
    @FindBy(xpath = "//*[@class='ant-tabs-content-holder']")
    public WebElement attachedCompanyInformation;
    @FindBy(xpath = "(//*[contains(@class,'anticon-edit')])[last()]")
    public WebElement editCompanyButton;
    @FindBy(xpath = "//*[text()='Edit your company information']")
    public WebElement editYourCompanyInformationText;
    @FindBy(xpath = "//*[text()='Your Company']")
    public WebElement yourCompanyLink;
    @FindBy(xpath = "//*[text()='Your company information has been updated']")
    public WebElement yourCompanyInfoUpdatedAlert;

    @FindBy(xpath = "//*[@accept='image/*']")
    public WebElement changeImageButton;
    @FindBy(xpath = "//*[@class='invoice_input__75vJN  ']")
    public WebElement changeCountryBox;
    @FindBy(xpath = "//*[@class='invoice_select__WnoPF  ']")
    public WebElement changeCountrySelectBox;

    @FindBy(xpath = "//*[@class='ant-card-head-title']")
    public WebElement attachedCompanyName;

    @FindBy(xpath = "//*[text()='Address :']/child::span")
    public WebElement attachedCompanyAddress;

    @FindBy(xpath = "//*[text()='City/State/Zipcode :']/child::span")
    public WebElement attachedCompanyCityStateZipcode;

    @FindBy(xpath = "//*[text()='Country :']/child::span")
    public WebElement attachedCompanyCountry;

    @FindBy(xpath = "//*[text()='Url :']/child::span/child::a")
    public WebElement attachedCompanyURL;

    @FindBy(xpath = "//*[text()='Phone :']/child::span")
    public WebElement attachedCompanyPhone;

    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement profileButton2;


}
