package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Hooks {
    public static WebDriver driver;
    public static BasePage basePage;
    public static String userSessionID;

    @Before
    public void setUp() {

        driver = Driver.getDriver();
        basePage=new BasePage() {
        };
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshots");
        }

        Driver.closeDriver();
    }
    @Before("@beta_login")
    public void beta_login(){
        login_qa(ConfigurationReader.getProperty("therapistEmail"), ConfigurationReader.getProperty("therapistPassword"));
    }

    public String login_qa(String email, String password) {
        List<String> windowHandles = new ArrayList<>(Driver.getDriver().getWindowHandles());
        if (windowHandles.size() > 1) {
            driver.close();
            BrowserUtilities.switchToWindowWithIndex(0);
        }

        Driver.getDriver().get("https://test.hypnotes.net/login");
        BrowserUtilities.waitFor(3);
        BrowserUtilities.waitForClickability(basePage.getHomePage().hypnotesLogo, 40);

        try {
            basePage.getLoginRegisterPage().login.click();
        } catch (Exception e) {
            basePage.getHomePage().hypnotesLogo.click();
            driver.manage().deleteAllCookies();
            BrowserUtilities.refreshPage();
            BrowserUtilities.waitForClickability(basePage.getLoginRegisterPage().login, 30);
            basePage.getLoginRegisterPage().login.click();
        }

        BrowserUtilities.waitFor(3);
        basePage.getLoginRegisterPage().emailBox.sendKeys(email);
        basePage.getLoginRegisterPage().passwordBox.sendKeys(password);
        BrowserUtilities.clickWithJS(basePage.getLoginRegisterPage().submitButton);
        BrowserUtilities.waitFor(3);
        try{basePage.getLoginRegisterPage().timezoneAlertYes.click();} catch (Exception e){
            e.printStackTrace();
        }
        try {

            BrowserUtilities.waitForClickability(basePage.getLoginRegisterPage().logOut, 30);
        } catch (Exception e) {
            BrowserUtilities.clearLocalSessionCookies();
            BrowserUtilities.refreshPage();
            BrowserUtilities.waitForClickability(basePage.getLoginRegisterPage().login, 30);
            BrowserUtilities.waitFor(3);

            BrowserUtilities.cleanTextInBox(basePage.getLoginRegisterPage().emailBox);
            BrowserUtilities.cleanTextInBox(basePage.getLoginRegisterPage().passwordBox);

            basePage.getLoginRegisterPage().emailBox.sendKeys(email);
            basePage.getLoginRegisterPage().passwordBox.sendKeys(password);
            BrowserUtilities.clickWithJS(basePage.getLoginRegisterPage().submitButton);
            BrowserUtilities.waitFor(3);
        }
        userSessionID = BrowserUtilities.getSessionId().split("=")[1];
        return userSessionID;
    }
}
