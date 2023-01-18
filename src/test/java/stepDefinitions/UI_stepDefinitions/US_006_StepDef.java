package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

public class US_006_StepDef extends BasePage {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @Then("{string} header should appear")
    public void header_should_appear(String erva) {
        BrowserUtilities.scrollToElement(getHomePage().aboutHypnotes);
        BrowserUtilities.waitFor(3);
        Assert.assertEquals("aboutHypnotes header is appear", erva, getHomePage().aboutHypnotes.getText());


    }

    @Then("{string} should be clickable")
    public void should_be_clickable(String string) {
        BrowserUtilities.doubleClick(getHomePage().aboutHypnotes);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://test.hypnotes.net/about-us";
        Assert.assertEquals(currentUrl, expectedUrl);

    }


    @Then("On the opened web page {string} and other titles should be visible.")
    public void onTheOpenedWebPageAndOtherTitlesShouldBeVisible(String title) {


        JSUtils.scrollIntoViewJS(getHomePage().hypnotes);
        BrowserUtilities.waitFor(2);
        String expectedTitle1a = "Who is";
        String expectedTitle1b = "Hypnotes?";
        String actualTitle1 = getHomePage().hypnotes.getText();
        Assert.assertTrue(actualTitle1.contains(expectedTitle1a));
        Assert.assertTrue(actualTitle1.contains(expectedTitle1b));


        JSUtils.scrollIntoViewJS(getHomePage().ourTeam);
        BrowserUtilities.waitFor(2);
        String expectedTitle2a = "Who is our team? &";
        String expectedTitle2b = "Why we are?";
        String actualTitle2 = getHomePage().ourTeam.getText();
        Assert.assertTrue(actualTitle2.contains(expectedTitle2a));
        Assert.assertTrue(actualTitle2.contains(expectedTitle2b));


        JSUtils.scrollIntoViewJS(getHomePage().services);
        BrowserUtilities.waitFor(2);
        String expectedTitle3a = "Our services &";
        String expectedTitle3b = "Features";
        String actualTitle3 = getHomePage().services.getText();
        Assert.assertTrue(actualTitle3.contains(expectedTitle3a));
        Assert.assertTrue(actualTitle3.contains(expectedTitle3b));

        JSUtils.scrollIntoViewJS(getHomePage().startUsing);
        BrowserUtilities.waitFor(2);
        String expectedTitle4a = "Why you should start using";
        String expectedTitle4b = "Hypnotes now!";
        String actualTitle4 = getHomePage().startUsing.getText();
        System.out.println(actualTitle3);
        Assert.assertTrue(actualTitle4.contains(expectedTitle4a));
        Assert.assertTrue(actualTitle4.contains(expectedTitle4b));

        Driver.getDriver().close();

    }
}





