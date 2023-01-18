package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_009_StepDef extends BasePage {
    WebDriver driver = Driver.getDriver();


    @And("user scrolls down")
    public void userScrollsDown() {
        BrowserUtilities.scrollToElement(getHomePage().testimonialsText);
    }

    @And("user assert that Testimonials is appeared")
    public void userAssertThatTestimonialsIsAppeared() {
        Assert.assertTrue(getHomePage().testimonialsText.isDisplayed());
    }


    @And("user assert that account of the relevant person is visible")
    public void userAssertThatAccountOfTheRelevantPersonIsVisible() {
        String handle1 = driver.getWindowHandle();

        for (int i = 0; i < getHomePage().people.size(); i++) {
            if (i == 3 || i == 4) {
                getHomePage().nextIcon.click();
            }
            Assert.assertTrue(getHomePage().people.get(i).isDisplayed());
            Assert.assertTrue(getHomePage().people.get(i).isEnabled());
            getHomePage().people.get(i).click();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(handle1)) {
                    Driver.getDriver().switchTo().window(handle);
                }

            }
            driver.switchTo().window(handle1);
        }
        Assert.assertEquals(getHomePage().people.size()+1,driver.getWindowHandles().size());

    }

    @And("user assert <> buttons are visible")
    public void userAssertButtonsAreVisible() {
        Assert.assertTrue(getHomePage().nextIcon.isDisplayed());
        Assert.assertTrue(getHomePage().previousIcon.isDisplayed());


    }

    @Then("user clicks on first dot")
    public void userClicksOnFirstDot() {
        // BrowserUtilities.clickWithJS(up.firstDot);
        BrowserUtilities.clickWithJS(getHomePage().dot.get(0));


    }

    @Then("assert previous button is not enabled")
    public void assertPreviousButtonIsNotEnabled() {
        BrowserUtilities.scrollToElement(getHomePage().previousIcon);

        Assert.assertFalse(getHomePage().previousIcon.isEnabled());
 
    }

    @When("user clicks on the last dot")
    public void userClicksOnTheLastDot() {
        getHomePage().dot.get((getHomePage().dot).size() - 1).click();
    }

    @Then("assert next button is not enabled")
    public void assertNextButtonIsEnabled() {
        Assert.assertFalse(getHomePage().nextIcon.isEnabled());
    }

    @Then("previous button is enabled")
    public void previousButtonIsEnabled() {
        Assert.assertTrue(getHomePage().previousIcon.isEnabled());

    }
}
