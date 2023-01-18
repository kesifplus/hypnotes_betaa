Feature:RegisterPage

  Scenario:TC019 As a user I should be able to see the functionality of the register page.
    Given user goes to register page
    When user name button is visible
    And user email button is visible
    And user password button is visible
    And user name button is enable
    And user email button is enable
    And user password button is enable

  Scenario Outline:
    Given user goes to register page
    When user enters "<fullname>" "<email>" "<password>"
    Then verify that the "<message>" prompt appears
    Examples:
      | fullname     | email                     | password      | message                                                                      |
      |              | hypnotes2022tr2@gmail.com | Aydinlik2023/ |                                                                              |
      | Erva Senel   |                           | Aydinlik2023/ | Please fill in this field.                                                   |
      | Erva Senel   | hypnotes2022tr2@gmail.com |               |                                                                              |
      | Sebnem Aydin | meltemcoban               | Aydinlik2023/ | Please include an '@' in the email address. 'meltemcoban' is missing an '@'. |