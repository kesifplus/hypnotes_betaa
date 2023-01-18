Feature: As a user, I should be able to create Group Session in

  Scenario:
    Given user goes to therapist kostenfrei login page
    When user clicks services button.
    And  user verifies Group Session
    And  Add New Session is appear
    When user clicks Add New Session
    And page is displayed
    And schreib add Session Kenntnisse
    And show all subsciption plans and cancel button are appear
    When user clicks show all subscription plans
    And user verifies subscription page Basic, Standard, Premium, Enterprise details
    And Basic, Standard, Premium, Enterprise 'Activate' button are clickable on Subscription page
    When user clicks the Activate button and the payment options.
    And Monthly, Yearly options are active on the Subscription page
    Then Payment is completed with payment options(only one package)