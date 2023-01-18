#"Email address and password button should be functional
#Valid email and password must be entered
#Successful login after valid information is entered"

Feature:

  @nav
  Scenario: As a user I should be able to login with my account

    Given User goes to website
    When click the login page
    Then user verifies login page "https://test.hypnotes.net/login"
    And enter the "hypnotes2022tr2@gmail.com"
    And enter the password "Aydinlik2023/"
    And click the login button
    Then dasboard calendar page's url should open






