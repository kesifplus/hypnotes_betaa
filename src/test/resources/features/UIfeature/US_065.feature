Feature: As a user, I should be able to attach files about problems

  Background:
    Given user goes to therapist login page

  Scenario:
    When user clicks services button.
    Then user clicks individual session button.
    And add new individual sessions button is visible.
    And generate scheduler url button is visible.
    And user clicks packages section.
    And add new package button is visible.
    And generate scheduler url1 button is visible.
    And user clicks group session button.
    And add new session button is visible.
    And add generated scheduler url button is visible.
