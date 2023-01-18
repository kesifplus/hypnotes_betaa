@beta_login
Feature:
  Scenario:Positive scenario
    Given user connects to the "/promoCode/add" with payload
      |promoCode|startedAt                    |enddedAt                     |usersLimit|discountType|discountRate|category |description|
      |ayca  |Mon, 26 Dec 2022 23:23:16 GMT|Wed, 27 Dec 2023 23:23:16 GMT|15        |percantage  |10          |2217,2264|undefined  |
    Then user verifies status code is 200