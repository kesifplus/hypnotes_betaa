Feature: US_053

  Background:
    Given user goes to therapist login page
    And user clicks clients
  Scenario Outline:
    When user clicks on Add Client Button
    When user enters "<name>", "<last name>"
    When user clicks on Add Client button
    Examples:
      | name    | last name    |
      | Selim   | Gunaydin     |


  Scenario:
    And user search "Selim Gunaydin"
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    When user creates a new problem
    Then user assert alert message
    Then user Assert that Objective, Assessment, Plan, Additional notes are clickable and visible

