Feature:As a user, I should be able to see that the Documents button
  is functional and be able to perform various actions.

  Background:
    Given user goes to therapist login page
    And user clicks clients

  Scenario Outline:
    When user clicks on Add Client Button
    When user enters "<name>", "<last name>"
    When user clicks on Add Client button
    Examples:
      | name | last name |
      | Omer | Can       |

  Scenario:
    And user search "Omer Can"
    And user scroll down to see Documents
    And user clicks on clientInfoDocumentsButton
    And user scroll down to see various titles
    And user assert visibility and click ability
