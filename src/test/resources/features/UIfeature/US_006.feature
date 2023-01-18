Feature:HomePage

  @Ilknur
  Scenario:As a user, I should be able to see the various titles and make various controls on the homepage.
    Given the user is on the main page
    And "About Hypnotes" header should appear
    And "About Hypnotes" should be clickable
    Then  On the opened web page "Who is Hypnotes?" and other titles should be visible.