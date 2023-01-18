@US_060_Updating_Sessions
Feature:US_060_Updating_Sessions
  Background:
    Given user goes to therapist login page
    Then user clicks clients
    And user search client "Deniz Akar"
    And user clicks view detail
    And user clicks on the Sessions Link
    And user clicks on Add New Session Button

  @TC001_Updating_Sessions_Without_Text
  Scenario: TC001_Updating_Sessions_Without_Text
    And user clicks on Associated Problem view Box
    And user verifies -Problem is successfully linked.- alert
    And user clicks on Associated Problem view Box
    And user verifies -Problem is successfully unlinked.- alert
    And user clicks and pass Key Points Box
    And user verifies -Note updated- alert
    And user clicks and pass After Thoughts Box
    And user verifies -After thoughts updated- alert
    And user clicks and pass Application And Suggestions Box
    And user verifies -Note updated- alert
    And user deletes the session
    And user verifies -Session is successfully deleted.- alert

  @TC002_Updating_Sessions
  Scenario: TC002_Updating_Sessions
    And enter Key Points Box new value
    And user verifies -Note updated- alert
    And enter After Thoughts Box new value
    And user verifies -After thoughts updated- alert
    And enter Application And Suggestions Box new value
    And user verifies -Note updated- alert
    And user deletes the session
    And user verifies -Session is successfully deleted.- alert
