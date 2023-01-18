Feature: As a user, I should be able to delete the Session
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
    And user clicks Sessions Button
    And user scroll untelDeleteButton
    And user clicks deleteButton
    When user clicks yesButton
    Then assert alert message