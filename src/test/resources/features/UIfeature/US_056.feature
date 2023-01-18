@US_0056
Feature:

  Background:
    Given user goes to therapist login page
    And user clicks clients

@US_0056-TC001
  Scenario Outline:
    And user search client
    When user clicks view detail
    And user clicks login Presenting Issue
    And user clicks add new problem

    Then user enters "<name>" "<statement>" "<location>" "<character>"
    And user clicks submit button

    Examples:
      | name | statement          | location | character |

      | John | button doesnt work | glasgow  | abc       |
  @US_0056-TC002
  Scenario:
    And user search client
    When user clicks view detail
    And user clicks login Presenting Issue
    And user clicks Additional Notes..
    Then assert attachments button is enable..
    And user uploads file
    And copy button is visible..
    And copy button is enable..
    Then assert under foto buttons are enable and visible..



