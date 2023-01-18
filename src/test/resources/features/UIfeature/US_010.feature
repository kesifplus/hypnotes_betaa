@US010
Feature:As a user, some titles should be visible

  Background:
    Given User goes to website
    When User commes below of Webseite


  Scenario Outline: TC_001 All titles below this title must be visible
    Then User verifies all titles "<subtitles>"

    Examples:
      | subtitles                                                                    |
      | Everything you need for your practice management wrapped up in one solution. |
      | Why Hypnotes is different?                                                   |
      | Who was Hypnotes made for?                                                   |
      | Is Hypnotes a free medical practice management system?                       |

  Scenario:TC_002 Text should be as typographical and logical right
    Then Section is to control

