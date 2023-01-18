Feature:As a user (Therapist), I should be able to perform various actions in the Profile(Experiences) section
  Background:
    Given user goes to therapist login page
    And user clicks Profile
    And user clicks Experiences
    And user clicks Add New Experience

  Scenario:TC001 Experiences Page

    And user verifies "Create a new Experience" is visible text
    Then user verifies headings are visible
      |Company Name           |Job Title          |Start Date          |End Date        | Description           |
    Then User verifies input boxes are functional
      |    Company Name       |  Job Title        |    Start Date      |    End Date    |   Description         |

  Scenario Outline:TC002 Experience Save Button
    And user enters Company Name "<Company Name>"
    And user enters Job Title "<Job Title>"
   # And user enters Start Date
    And user enters End Date
    And user enter Description "<Description>"
    Then user clicks SaveButton

    Examples:
      |Company Name| Job Title|         Description           |
      |Hypnotes    | Tester   |       jdkhfkjsahf             |


  Scenario:TC003 Create a new Experience input insert
     And user clicks CancelButton
    And user verifies Experiences added message is visible