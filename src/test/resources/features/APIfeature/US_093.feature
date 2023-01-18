@beta_login
Feature:
  Scenario: TC001  As a user, I should be able to add new individual session.
    When user creates a new individual session "settings/meeting/category/add"
      |title       |price  |showPrice  |duration  |blockBefore  |blockAfter  |paymentRequired  |bookable|online|
      |Huseyin    | 10    |   true      |   12     |      13     |       14   |    true          |  true   |true  |
   Then the user verifies the status code of the response is "200"
    Then user verifies add new individual sessions with "success"


