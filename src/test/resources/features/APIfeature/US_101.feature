@beta_login
Feature: As a user, I should be able create a blocked time


  Scenario: TC_001 the user creates a blocked time on the calender

    Given user creates a timeoff block
    Then user verifies that the status code of the response is 200
    And user verifies that the response is as expected

      | status                | true   |
      | data[0].isRecurring   | false  |
      | data[0].isAllDay      | false  |
      | data[0].locationTitle | Online |


