Feature:

  Scenario: As a user, I should be able to see that the Sessions button is functional and be able to perform various actions.

    Given User goes to website
    When click the login page
    Then user verifies login page "https://test.hypnotes.net/login"
    And enter the "hypnotes2022tr2@gmail.com"
    And enter the password "Aydinlik2023/"
    And click the login button
    And user clicks clients
    And user clicks view detail
    And user click sessions
    And user assert date and details section


   # line 5-6-7-8-9 ve 10 nun stepdef leri login.feature dan geliyor
  # line 11 ve 12 nin stepdef leri  US_057_stepdef den geliyor
  #line 13 ve 14 benim US_047_stepdef den geliyor