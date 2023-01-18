#@therapist_login
@beta_login
Feature: US_095 As a user, I should be able to remove a individual session
  @US_095
  Scenario: US_095 As a user, I should be able to remove a individual session
    Given user connects to the "/settings/meeting/category/remove" for deletion
    Then user verifies remove with status code 200
    Then user verifies remove with "success"
