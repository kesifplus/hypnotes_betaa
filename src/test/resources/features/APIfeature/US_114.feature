Feature:contact with users

  Scenario:positive scenario
    Given user should be able to establish contact
    Then user verifies  contact the status code is 200
    And user verifies response is exactly expected
      | success | true |


  Scenario:negative scenario
    Given user can not establish contact
    Then user verifies that for contact the status code is 200

