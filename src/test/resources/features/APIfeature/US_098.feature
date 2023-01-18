@beta_login
Feature:

  Background:
    Given user connects to the "/settings/meeting/get"
    Then user verifies the status code of the response is 200
   Scenario: TC_001 -verifies the api response has mandatory fields.

    Then user verifies the api response has mandatory fields.
      | id                      |
      | datetime.date           |
      | datetime.timezone_type  |
      | datetime.timezone       |
      | password                |
      | name                    |
      | googleId                |
      | clientInfos.name        |
      | clientInfos.doctorEmail |

  Scenario: TC_002 - Does the number of meetings in the UI match with the one in the API?
    When user clicks Scheduling button
    And user clicks Calender button
    Then verify the number of meetings in the UI appears in the API

