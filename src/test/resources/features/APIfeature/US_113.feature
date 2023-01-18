@beta_login
Feature: As a user, I should be able to send email.

  Scenario: user should be able to send email.
    Given for sending mail user connets "/dashboard/bulkEmail-client" endpoint
      | clients[] | title          | message                 | addCC |
      | all       | Yeni Promosyon | yeni yilin ilk indirimi | true  |
    Then verifies that the status code of response for mail is 200