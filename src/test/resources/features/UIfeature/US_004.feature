@US_004
Feature:HomePage_US_004

  Scenario:TC_001
    Given user go to Website "https://test.hypnotes.net/"
    And user scroll down
    Then user assert  that the Facebook, LinkedIn, Twitter, Instagram icons are visible.

    Then user assert that the Facebook, LinkedIn, Twitter, Instagram icons are clickable.

    And user clicks on the Facebook, LinkedIn, Twitter, Instagram icons.
#   Then user assert  the company-related page be visible.
