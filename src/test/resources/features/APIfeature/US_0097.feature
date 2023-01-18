@beta_login
Feature: As a user, I should be able get service limit details
  Scenario:
    Given the user connects to "/settings/meeting/serviceLimitControl" for servisLimit
    Then user verifies the status code of the response is 200
