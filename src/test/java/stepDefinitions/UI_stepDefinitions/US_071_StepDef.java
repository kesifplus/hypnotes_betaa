package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utilities.BrowserUtilities;
import utilities.JSUtils;

public class US_071_StepDef extends BasePage {
    @Given("user clicks on scheduling on the sidebar")
    public void user_clicks_on_scheduling_on_the_sidebar() {
       BrowserUtilities.waitFor(3);
      // BrowserUtilities.waitForClickablility(getCalenderBookAnAppointmentPage().scheduling,5);
       getCalenderBookAnAppointmentPage().scheduling.click();
      BrowserUtilities.waitFor(3);

    }

    @Given("user clicks on Calender on the sidebar")
    public void user_clicks_on_calender_on_the_sidebar() {
       //BrowserUtilities.waitFor(2);
      // JSUtils.scrollDownByJS();
      // BrowserUtilities.waitFor(3);
     // BrowserUtilities.scrollToElement(getCalenderBookAnAppointmentPage().scheduling_calendar);
       getCalenderBookAnAppointmentPage().scheduling_calendar.click();
        BrowserUtilities.waitFor(3);

    }

    @Given("user is on the {string} page")
    public void user_is_on_the_page(String string) {


    }

    @Given("user clicks a date on the calendar")
    public void user_clicks_a_date_on_the_calendar() {
        BrowserUtilities.waitFor(3);
getCalenderBookAnAppointmentPage().appoinmentDateNumber18.click();
BrowserUtilities.waitFor(3);
    }

    @Then("user sees date box is visible with a different color")
    public void user_sees_date_box_is_visible_with_a_different_color() {
        getCalenderBookAnAppointmentPage().appoinmentDateNumber18.isDisplayed();
        BrowserUtilities.waitFor(10);

    }

    @Given("user opens book an appointment page")
    public void user_opens_book_an_appointment_page() {
       // getCalenderBookAnAppointmentPage().bookAnAppointmentPage.isDisplayed();

    }

    @Given("user appears registered services default radio button in the Select Service Type section")
    public void user_appears_registered_services_default_radio_button_in_the_select_service_type_section() {


  Assert.assertTrue(getCalenderBookAnAppointmentPage().registeredServiceRadioButton.isSelected());
    }

    @Given("user appears registered service radio button is functional")
   public void user_appears_registered_service_radio_button_is_functional() {
    getCalenderBookAnAppointmentPage().registeredServiceRadioButton.isEnabled();
    }

    @Given("user clicks registered service radio button")
    public void user_clicks_registered_service_radio_button() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(getCalenderBookAnAppointmentPage().registeredServiceRadioButton);
       BrowserUtilities.waitFor(3);

    }

    @Given("user appears registered service radio button selectable")
    public void user_appears_registered_service_radio_button_selectable() {
        getCalenderBookAnAppointmentPage().registeredServiceRadioButton.isEnabled();
        getCalenderBookAnAppointmentPage().registeredServiceRadioButton.isDisplayed();


    }

    @Given("user any service can be selectable in the service drop down menu.")
    public void user_any_service_can_be_selectable_in_the_service_drop_down_menu() {
getCalenderBookAnAppointmentPage().servicesDropdown.isEnabled();
getCalenderBookAnAppointmentPage().servicesDropdown.isDisplayed();
    }

    @Given("user sees location dropdown menu functional")
    public void user_sees_location_dropdown_menu_functional() {
        getCalenderBookAnAppointmentPage().locationDropdown.isEnabled();

    }

    @Given("user clicks location dropdown menu and sees various options visible in the location dropdown menu")
    public void user_clicks_location_dropdown_menu_and_sees_various_options_visible_in_the_location_dropdown_menu() {
        BrowserUtilities.waitFor(5);
        Select dropdown = new Select(getCalenderBookAnAppointmentPage().locationDropdown);
        dropdown.getOptions();
    }

    @Given("user clicks and selects any location in the location drop down menu")
    public void user_clicks_and_selects_any_location_in_the_location_drop_down_menu() {

    }

    @Given("user sees Repeat Options dropdown menu is functional")
    public void user_sees_repeat_options_dropdown_menu_is_functional() {

    }

    @Given("user clicks Repeat Options dropdown menu and sees various options in the Repeat Options dropdown menu")
    public void user_clicks_repeat_options_dropdown_menu_and_sees_various_options_in_the_repeat_options_dropdown_menu() {

    }

    @Given("user selects any option in the Repeat Options dropdown menu")
    public void user_selects_any_option_in_the_repeat_options_dropdown_menu() {

    }

    @Given("user can't see repeat option when Does not repeat is selected")
    public void user_can_t_see_repeat_option_when_does_not_repeat_is_selected() {

    }

    @Given("user sees Repeat times drop down menu should be visible when any of the Daily, Weekly, Monthly options are selected in the Repeat Options section")
    public void user_sees_repeat_times_drop_down_menu_should_be_visible_when_any_of_the_daily_weekly_monthly_options_are_selected_in_the_repeat_options_section() {

    }

    @Given("user selects and clicks A number  from the Repeat times dropdown menu")
    public void user_selects_and_clicks_a_number_from_the_repeat_times_dropdown_menu() {

    }

    @Given("user sees Date dropdown menu is functional")
    public void user_sees_date_dropdown_menu_is_functional() {

    }

    @Given("The date on the Calendar should be clickable")
    public void the_date_on_the_calendar_should_be_clickable() {

    }

    @Given("The date on the Calendar should be selectable")
    public void the_date_on_the_calendar_should_be_selectable() {

    }

    @Given("Time Start, Time End dropdown menus should be functional")
    public void time_start_time_end_dropdown_menus_should_be_functional() {

    }

    @Given("Time Start, Time End dropdown should be visible at various times")
    public void time_start_time_end_dropdown_should_be_visible_at_various_times() {

    }

    @Given("Any time should be selectable in the Time Start, Time End dropdown menus")
    public void any_time_should_be_selectable_in_the_time_start_time_end_dropdown_menus() {

    }

    @Given("Registered Clients, New Client \\(Enter Manually) options should be visible under the Select Service Type heading.")
    public void registered_clients_new_client_enter_manually_options_should_be_visible_under_the_select_service_type_heading() {

    }

    @Given("Registered Clients option should  be able to check")
    public void registered_clients_option_should_be_able_to_check() {

    }

    @Given("Clients dropdown menu should be functional")
    public void clients_dropdown_menu_should_be_functional() {

    }

    @Given("Any client should be selectable from the Clients dropdown menu.")
    public void any_client_should_be_selectable_from_the_clients_dropdown_menu() {

    }

    @Given("Do not notify client button should be functional")
    public void do_not_notify_client_button_should_be_functional() {

    }

    @Given("Do not notify client button should be checked")
    public void do_not_notify_client_button_should_be_checked() {

    }

    @Given("After the necessary actions, the Submit button should be clickable")
    public void after_the_necessary_actions_the_submit_button_should_be_clickable() {

    }

    @Then("When the user click to Submit button , a message should appear about the meeting being created.")
    public void when_the_user_click_to_submit_button_a_message_should_appear_about_the_meeting_being_created() {

    }













}
