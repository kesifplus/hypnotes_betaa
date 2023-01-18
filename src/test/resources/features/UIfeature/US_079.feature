Feature: US_079
  Scenario: TC001
    Given user goes to therapist login page
    And user click profile
    And user clicks add New education
    And user enters School Name "Oxford"
    And user enters department "Hypnotes"
    And user enters Create a new Education Start Date
    When user clicks Education save button
    Then user verifies alert messages "Education is added"