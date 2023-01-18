Feature:As a user, I should be able to perform various actions in the Voice Notes section

  Background:
    Given user goes to therapist login page

  Scenario: TC_001
    When user clicks clients
    Then user search client
    When user clicks view detail
    And  user clicks sessions
    Then Assert voice Notes is enable
    When  user clicks on the sessionsmicrophone add Voice
    Then  user verifies Recording added message
    When user clicks on the lautsprecher
    And Attached files are appear
    Then user clicks play button and verifies functionality
    And User verifies Attached files functionalty