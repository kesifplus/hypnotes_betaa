Feature: US_072
  Scenario: TC001 As a user, I should be able to perform various actions to create an appointment with the Custom Service - Register Clients options
    Given user goes to therapist login page
    And user clicks Scheduling button
    And user clicks Calender button
    And user clicks day
    And user clicks Costum Service
    And user enters Service Name "Hypnotes"
    And user enters price "50"
    And user enters Duration "30"
    And user click Do not notify client
    When user clicks BookAnAppointment submit button
    Then user assert alert messages are "New Meeting Created"



