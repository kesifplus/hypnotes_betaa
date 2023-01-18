package stepDefinitions.UI_stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utilities.Driver;

import java.util.List;

public class  US_005_StepDef extends BasePage {
    WebDriver driver = Driver.getDriver();

    @Given("user go to website {string}")
    public void user_go_to_website(String url) {

        WebDriverManager.chromedriver().setup();
        driver.get("https://test.hypnotes.net/");
        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Then("assert titles are displayed")
    public void asser_titles_are_displayed(DataTable dataTable) {
        List<String> column = dataTable.column(0);

        for (int i = 0; i < column.size(); i++) {
            Assert.assertEquals(column.get(i), getHomePage().header.getText());
        }


    }
}


