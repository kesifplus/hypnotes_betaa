@beta_login
Feature: As a user, I should be able  blocked time
@US100
  Scenario: TC_001 the user gets a blocked time on the calender
    Given user creates a timeoff block
      | status |
      | true   |
    Then user verifies that the status code of the response is 200

