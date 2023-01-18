@beta_login
Feature:
  Scenario:US_128
    Given user connects to the "/hypnotherapist/reissue/update-change-rules" for creations
      | clientChangeBefore | clientChangeLimit | canClientChange |
      | 24                 | 100               | false           |
    When user verify status code 200
