package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtilities;

import java.util.Random;

public class US_051_StepDef extends BasePage {

    @And("click on getPayment on client info page")
    public void clickOnGetPaymentOnClientInfoPage() {
        BrowserUtilities.clickWithJS(getPaymentPage().getPayment);
    }

    @Then("assert Payment Options appear")
    public void assertPaymentOptionsAppear() {
        BrowserUtilities.waitForVisibility(getPaymentPage().paymentOptionsTitle, 10);
        Assert.assertEquals("Payment options", getPaymentPage().paymentOptionsTitle.getText());


    }

    @And("assert category options should be appear")
    public void assertCategoryOptionsShouldBeAppear() {

         getPaymentPage().selectCategory_genel.click();
        // BrowserUtilities.wait(2);

        Assert.assertTrue(getPaymentPage().selectCategory_list.get(0).isDisplayed());
    }

    @And("User should be able to select custom category")
    public void userShouldBeAbleToSelectCustomCategory() {
        int size = getPaymentPage().selectCategory_list.size();
        Random random = new Random();
        int clickIndex = random.nextInt(size);
        getPaymentPage().selectCategory_list.get(clickIndex).click();

    }

    @And("User should be able to pay different ways: paypal, credit card, stripe, square {int} {string}")
    public void userShouldBeAbleToPayDifferentWaysPaypalCreditCardStripeSquareId(int index, String name) {

        getPaymentPage().ticks_list.get(index).click();
        switch (index) {
            case 0:
                getPaymentPage().payWithPaypal();
                break;
            case 1:
                getPaymentPage().payWithCreditCard();
                break;
            case 2:
                getPaymentPage().payWithStripe();
                break;
            case 3:
                getPaymentPage().payWithSquare();
                break;

        }


    }
}