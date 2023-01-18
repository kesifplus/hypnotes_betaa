Feature:

  Scenario Outline: As a user, I should be able to see various payment options

    Given User goes to website
    When click the login page
    Then user verifies login page "https://test.hypnotes.net/login"
    And enter the "hypnotes2022tr2@gmail.com"
    And enter the password "Aydinlik2023/"
    And click the login button
    And user clicks clients
    And user clicks view detail
    And click on getPayment on client info page
    Then assert Payment Options appear
    And assert category options should be appear
    And User should be able to select custom category
    And User should be able to pay different ways: paypal, credit card, stripe, square <id> "<name>"
    Examples:
      | id | name        |
      | 0  | paypal      |
      | 1  | credit card |
      | 2  | stripe      |
      | 3  | square      |








