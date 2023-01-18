package pages;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='BaseNavbar_notes__Qzt_R']")
    public WebElement hypnotesLogo;

    @FindBy(xpath = "//a[normalize-space()='About Hypnotes']")
    public WebElement aboutHypnotes;

    @FindBy(xpath = "//h2[normalize-space()='Who is Hypnotes?']")
    public WebElement hypnotes;

    @FindBy(xpath = "//h2[contains(text(),'Who is our team?')]")
    public WebElement ourTeam;

    @FindBy(xpath = "//h2[contains(text(),'Our services &')]")
    public WebElement services;

    @FindBy(xpath = "//h2[contains(text(),'Why you should start using')]")
    public WebElement startUsing;


    @FindBy(xpath = "//*[text()='Testimonials']")
    public WebElement testimonialsText;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    public WebElement login;

    @FindBy(xpath = "//span[text()='Hyp']")
    public WebElement hpTitle1;


    @FindBy(xpath = "//span[text()='notes']")
    public WebElement hpTitle2;

    @FindBy(css = "h2[class=\"mb-5 text-center\"]")
    public WebElement hpTitleEverythingMang;

    @FindBy(id = "isdifferent")
    public WebElement subtitleDifferent;

    @FindBy(id = "madefor")
    public WebElement subtitleMadefor;

    @FindBy(id = "isfreemedical")
    public WebElement subtitleFreemedical;

    @FindBy(xpath = "(//p[@class='LandingPage_ans__TlWv0'])[1]")
    public WebElement textDifferent;

    @FindBy(xpath = "(//p[@class='LandingPage_ans__TlWv0'])[2]")
    public WebElement textMadefor;

    @FindBy(xpath = "(//p[@class='LandingPage_ans__TlWv0'])[3]")
    public WebElement textFreeMedical;

    @FindBy(xpath = "//*[@aria-label='Page dot 1']")
    public WebElement firstDot;

    @FindBy(xpath = "//*[@aria-label='Previous']")
    public WebElement previousIcon;

    @FindBy(xpath = "//*[@aria-label='Next']")
    public WebElement nextIcon;

    @FindBy(css = ".dot")
    public List<WebElement> dot;

    @FindBy(xpath = "//*[@class='LandingPage_colorBlack__8KCDi']")
    public List<WebElement> people;

    @FindBy(css = ".BaseNavbar_navButton__1Pd6f")
    public List<WebElement> barButtons;

    @FindBy(xpath = "//div[@class='BaseFooter_footerCol__kUthZ']/ul/li")
    public List<WebElement> exploreButton;




    //US_005
    @FindBy(css = ".text-left")
    public WebElement text;

    @FindBy(css = "text-center mb-5")
    public WebElement header;

    //US_016
    @FindBy(css = "[name='name']")
    public WebElement name;

    @FindBy(css = "[name='surname']")
    public WebElement surname;

    @FindBy(css = "[name='email']")
    public WebElement email;

    @FindBy(css = "[name='password']")
    public WebElement password;

    //START US_004
    @FindBy(css = ".BaseFooter_socialLinks__b2Eyv")
    public List<WebElement> links;

    @FindBy(css = ".BaseFooter_footerCol__kUthZ")
    public WebElement scroll;

    //@FindBy(css = ".BaseFooter_socialLinks__b2Eyv>a")
    @FindBy(xpath = "//div[@class='BaseFooter_socialLinks__b2Eyv']/a")
   // @FindBy(xpath = "//div[@class='BaseFooter_hypnotes__d8hUb']/div/div/a")
    public List <WebElement> links2;

   //END US_004
    @FindBy(css = ".RegisterForm_invalid__10sju")
    public List<WebElement> redList;

    @FindBy(css = ".RegisterForm_valid__sQYgm")
    public List<WebElement> greenList;

    @FindBy(css = ".RegisterForm_SignUpBtnInvalid__FtjCT")
    public WebElement invalidSignup;

    @FindBy(css = ".RegisterForm_SignUpBtn__DNymU")
    public WebElement validSignup;

    @FindBy(css = ".ytp-large-play-button-red-bg")
    public WebElement youtube_play;

    @FindBy(css = "[src*='youtube']")
    public WebElement youtube_frame;

    @FindBy(css = ".video-stream.html5-main-video")
    public WebElement youtube_attribute;

    @FindBy(css = ".dot")
    public List<WebElement> dots;

    @FindBy(css = ".details.LandingPage_textDark__EZpFS")
    public List<WebElement> testimonials;

    @FindBy(css = "[aria-label='Previous']")
    public WebElement button_previous;

    @FindBy(css = "[aria-label='Next']")
    public WebElement button_next;

    @FindBy(css = ".BaseFooter_footerCol__kUthZ ul li")
    public List<WebElement> footerLinks;
}

