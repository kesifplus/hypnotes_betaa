Feature:View Details Page

  Scenario:TC001-As a user, I should be able to see various titles when I click the View Details button

    Given user goes to therapist login page
    When user clicks clients
    Then user search client
    When user clicks view detail
    Then assert that "CLIENT INFO" page open
    Then verify that all buttons at the top of the page are displayed
    Then verify that all buttons at the top of the page are clickable
    Then verify that all buttons at the bottom of the page are displayed
    Then verify that all buttons at the bottom of the page are clickable
