Feature:As a user(therapist), I should be able to see the various headings when I click Presenting Issue button

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
    And user clicks on the Presenting Issues
    And assert Add new problem button is clickable
