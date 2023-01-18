Feature:Page
  Scenario : As a user, I should be able to see the various heards and check some language features on the homepage
    Given user go to website "https://test.hypnotes.net/"
    Then assert titles are displayed

    |All in One Place for Practice Management |
    |Why Therapists Love Hypnotes?            |



