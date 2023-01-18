Feature:

  Background:
    Given user goes to therapist login page
    And user clicks clients


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

  Scenario:
    And user search client
    When user clicks view detail
    And user clicks login Presenting Issue
    And delete issue button is visible.
    And delete issue button is enable.
    And delete issue button is clickable.
    And No button is enable.
    And Yes button is enable.
    And Yes button is clickable.
    Then delete issue button not visible.


