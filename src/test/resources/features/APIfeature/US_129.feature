@beta_login
Feature:
  Scenario:US_129
    Given user connects to "/public/scheduler/updateSchedulerId" for creation
      | tempSchedulerUrl    |
      | hsyn1234567          |
    When user verify status code 200
    Then user verify success is "success"
