@beta_login
Feature:
  @US_123
  Scenario:US_123
    Given user connects to the "/settings/sendVerificationSms" for creation
      | number         |
      | 0123 |
    When user verify status code 200
    Then user verify success is true

@US_127
  Scenario: US_127
    Given user connects to the "/hypnotherapist/reissue/update-cancel-rules" for creation
      | clientCancelBefore | discountType | cancellationFee | canClientCancel |
      | 24                 | percentage   | 100             | true            |
    When user verify status code 200