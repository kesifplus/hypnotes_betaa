@beta_login
Feature: As a user, I should be able to see informations of logged user

  Scenario:user sees Client on the Dashboard
    Given a user connects to the "/dashboard/getUser"
    Then user verifies that the status code of the response is 200