Feature:As a user, I should be able to control the functionality of various buttons on the Search Clients page

  Scenario:TC_001
    Given user goes to therapist login page
    And user clicks clients
   When user checks that Add Button is clickable and goes to the relevant page
   When user checks that Import Button is clickable and goes to the relevant page
  Then user checks that Export Button is clickable and goes to the relevant page
  Then user checks that Start Meeting Button is clickable and goes to the relevant page
  Then user checks that Logout Button is clickable and exit from the page
