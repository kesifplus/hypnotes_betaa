package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US_004_StepDef extends BasePage {
    @Given("user go to Website {string}")
    public void user_go_to_website(String URL) {
        Driver.getDriver().get(URL);
    }

    @Given("user scroll down")
    public void user_scroll_down() {
        BrowserUtilities.scrollToElement(getHomePage().scroll);
    }

    @Then("user assert  that the Facebook, LinkedIn, Twitter, Instagram icons are visible.")
    public void user_assert_that_the_facebook_linked_in_twitter_instagram_icons_are_visible() {
        for (int i = 0; i < getHomePage().links.size(); i++) {
            Assert.assertTrue(getHomePage().links.get(i).isDisplayed());
        }
    }

    @Then("user assert that the Facebook, LinkedIn, Twitter, Instagram icons are clickable.")
    public void user_assert_that_the_facebook_linked_in_twitter_instagram_icons_are_clickable() {
        for (int i = 0; i < getHomePage().links.size(); i++) {
            Assert.assertTrue(getHomePage().links.get(i).isEnabled());
        }
    }
    @Then("user clicks on the Facebook, LinkedIn, Twitter, Instagram icons.")
    public void user_clicks_on_the_facebook_linked_in_twitter_instagram_icons() {

    }
    //@Then("user assert  the company-related page be visible.")
    //public void user_assert_the_company_related_page_be_visible() {
//        for (int i = 0; i < hp.links2.size(); i++) {

//                hp.links2.get(i).click();
//
//
//            Set<String> windowAllWindows = Driver.getDriver().getWindowHandles();
//            System.out.println("------getDriverHandels------" + Driver.getDriver().getWindowHandles());
//            System.out.println("------setDriverHandels-------" + windowAllWindows);
//            for (String Window:windowAllWindows){
//                Driver.getDriver().switchTo().window(Window);
//                Driver.getDriver().close();
//
//
//
//
//            }
//            String CurrentURL = Driver.getDriver().getCurrentUrl();
//            System.out.println(CurrentURL);
//            if (i==0) {
//                Assert.assertEquals("https://www.facebook.com/hypnotesinc", CurrentURL);
//               // Driver.getDriver().close();
//            }
//            else if(i==1){
//                Assert.assertEquals("https://twitter.com/HypnotesInc", CurrentURL);
//             //   Driver.getDriver().close();
//            }
//            else if(i==2){
//                Assert.assertEquals("https://www.instagram.com/hypnotesinc/?utm_medium=copy_link", CurrentURL);
//              //  Driver.getDriver().close();
//            }
//            else{
//                Assert.assertEquals("https://www.linkedin.com/company/hypnotes/", CurrentURL);
//              //  Driver.getDriver().close();
//            }
//            Driver.getDriver().close();
//        }
   // }
}

