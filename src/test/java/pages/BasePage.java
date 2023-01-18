
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public abstract class BasePage {

    HomePage homePage;
    RegisterPage registerPage;
    LoginRegisterPage loginRegisterPage;
    ClientInfoPage clientInfoPage;
    PaymentPage paymentPage;
    ProfilePage profilePage;

     CalenderBookAnAppointmentPage calenderBookAnAppointmentPage;
    CalenderMeetingInfoAndCalenderPage calenderMeetingInfoAndCalenderPage;
    SettingsPage settingsPage;
    PresentingIssuePage presentingIssuePage;
    SessionPage sessionPage;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public LoginRegisterPage getLoginRegisterPage() {
        if (loginRegisterPage == null) {
            loginRegisterPage = new LoginRegisterPage();
        }
        return loginRegisterPage;
    }

    public PaymentPage getPaymentPage() {
        if (paymentPage == null) {
            paymentPage = new PaymentPage();

        }
        return paymentPage;
    }

    public ClientInfoPage getclientInfoPage() {
        if (clientInfoPage == null) {
            clientInfoPage = new ClientInfoPage();
        }
        return clientInfoPage;
    }


    public CalenderBookAnAppointmentPage getCalenderBookAnAppointmentPage() {
        if (calenderBookAnAppointmentPage == null) {
            System.out.println("Calender Page cagrildi.");
            calenderBookAnAppointmentPage = new CalenderBookAnAppointmentPage();
        }
        return calenderBookAnAppointmentPage;
    }

    public CalenderMeetingInfoAndCalenderPage getCalenderMeetingInfoAndCalenderPage() {
        if (calenderMeetingInfoAndCalenderPage == null) {
            calenderMeetingInfoAndCalenderPage = new CalenderMeetingInfoAndCalenderPage();
        }
        return calenderMeetingInfoAndCalenderPage;
    }

    public ProfilePage getProfilePage() {
        if (profilePage == null) {
            profilePage = new ProfilePage();
        }
        return profilePage;

    }
    public SettingsPage getSettingsPage() {
        if (settingsPage == null) {
            settingsPage = new SettingsPage();
        }
        return settingsPage;
    }


    public PresentingIssuePage getPresentingIssuePage() {
        if (presentingIssuePage == null) {
            presentingIssuePage = new PresentingIssuePage();
        }
        return presentingIssuePage;
    }
    public SessionPage getSessionPage() {
        if (sessionPage == null) {
            sessionPage = new SessionPage();
        }
        return sessionPage;
    }
}



