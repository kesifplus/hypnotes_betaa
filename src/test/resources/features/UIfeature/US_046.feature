Feature: As a user, I should be able to see that the Presenting Issues button is functional and various actions are possible.
    Background:
      Given user goes to therapist login page
      And user clicks clients
  Scenario Outline:
    When user clicks on Add Client Button
    When user enters "<name>", "<last name>"
    When user clicks on Add Client button
    Examples:
      | name    | last name |
      | Huseyin | Gunaydin     |

  Scenario:
    And user search "Huseyin Gunaydin"
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem
    And user clicks on client info
    When user clicks bottom Presenting Issue
    Then user assert problem
    When user clicks Details
    Then user assert "Huseyin Gunaydin"





