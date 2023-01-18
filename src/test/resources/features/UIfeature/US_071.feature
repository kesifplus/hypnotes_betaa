Feature: US_071 As a user I should be able to perform various actions to create an appointment with the Register Services - Register Clients options
 Scenario:
   Given user goes to therapist login page
   And user clicks on scheduling on the sidebar
   And user clicks on Calender on the sidebar
  And user is on the 'Book an appointment' page
  And user clicks a date on the calendar
  Then user sees date box is visible with a different color
@cilek
  Scenario:
    Given user opens book an appointment page
    And user appears registered services default radio button in the Select Service Type section
    And user appears registered service radio button is functional
    And user clicks registered service radio button
    And user appears registered service radio button selectable
    And user any service can be selectable in the service drop down menu.
    And user sees location dropdown menu functional
    And user clicks location dropdown menu and sees various options visible in the location dropdown menu
    And user clicks and selects any location in the location drop down menu
    And user sees Repeat Options dropdown menu is functional
    And user clicks Repeat Options dropdown menu and sees various options in the Repeat Options dropdown menu
    And user selects any option in the Repeat Options dropdown menu
    And user can't see repeat option when Does not repeat is selected
    And user sees Repeat times drop down menu should be visible when any of the Daily, Weekly, Monthly options are selected in the Repeat Options section
    And user selects and clicks A number  from the Repeat times dropdown menu
    And user sees Date dropdown menu is functional
    And  The date on the Calendar should be clickable
    And  The date on the Calendar should be selectable
    And  Time Start, Time End dropdown menus should be functional
    And  Time Start, Time End dropdown should be visible at various times
    And  Any time should be selectable in the Time Start, Time End dropdown menus
    And  Registered Clients, New Client (Enter Manually) options should be visible under the Select Service Type heading.
    And  Registered Clients option should  be able to check
    And Clients dropdown menu should be functional
    And  Any client should be selectable from the Clients dropdown menu.
    And  Do not notify client button should be functional
    And Do not notify client button should be checked
    And After the necessary actions, the Submit button should be clickable
    Then When the user click to Submit button , a message should appear about the meeting being created.







