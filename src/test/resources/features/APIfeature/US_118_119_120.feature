@beta_login
Feature:
  @US_118_119_120
  Scenario:US_118
    Given user connects to the "/profile/addExperience" for creation to "experience"
      | company | jobTitle  | startedAt            |
      | hep     | qa tester | Fri, 18 Nov 2022 GMT |

    When user verify status code 200

    Scenario:US_119
      Given user connects to the "/profile/updateExperience" for update with "experienceId"
        | company | jobTitle  | startedAt            |
        | beycan  | qa tester | Sun, 18 Dec 2022 GMT |

      When user verify status code 200
      Then user verify change is as expected
        | experience.company        | beycan                     |
        | experience.jobTitle       | qa tester                  |
        | experience.startedAt.date | 2022-12-18 00:00:00.000000 |

      Scenario: US_120
        Given user connects to the "/profile/removeExperience" for delete with "experienceId"
        When user verify status code 200
        Then user verify success is true