@beta_login
Feature: As a user, I should be able delete a blocked time


  Scenario:user deletes a blocked time on the calender

    Then user deletes the created id
    Then user verifies that the status code of the response is 200
    Then user verifies that the response is as expected
      | status | false              |
      | descr  | TimeOff not found. |

