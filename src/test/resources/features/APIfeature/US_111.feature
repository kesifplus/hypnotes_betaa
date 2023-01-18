@beta_login
Feature: As a user, I should be able to see client list


  Scenario:user sees Client on the Dashboard

    Given the user connects to the "/dashboard/getClients-paginated"
      | search | page | sort |
      | mahir  | 1    | name |
    Then user verifies that the status code of the response is 200
    Then user verifies that the response is as expected
      | clients[0].isVerified | true  |
      | clients[0].name       | mahir |

