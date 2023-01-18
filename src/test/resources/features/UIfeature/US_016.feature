Feature:client

  Background:
    Given user go to website "https://test.hypnotes.net/register/client"
    When user enters "alex" to name input
    And user enters "beta" to surname input
    And user enters "hypnotes2022cl1@gmail.com" to email input

  Scenario Outline: TC001 - negative scenarios
    When user enters "<data>"
    Then user verifies green list's size is "<green>"
    And user verifies red list's size is "<red>"
    And user verifies sign up button is not clickable
    Examples:
      | data                                                             | green | red |
      | a                                                                | 1     | 4   |
      | A                                                                | 1     | 4   |
      | a1                                                               | 2     | 3   |
      | a@1                                                              | 3     | 2   |
      | a5@A                                                             | 4     | 1   |
      | aaaaaaaa                                                         | 2     | 3   |
      | A2@                                                              | 3     | 2   |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | 1     | 4   |

  Scenario: TC001.01 - negative scenario datatable
    When user enters password, then user verifies sizes of the lists
      | a                                                                | 1 | 4 |
      | A                                                                | 1 | 4 |
      | a1                                                               | 2 | 3 |
      | a@1                                                              | 3 | 2 |
      | a5@A                                                             | 4 | 1 |
      | aaaaaaaa                                                         | 2 | 3 |
      | A2@                                                              | 3 | 2 |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | 1 | 4 |
