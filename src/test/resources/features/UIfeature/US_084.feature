@US084
Feature: US084_User should be able to update Your Company session

  @US084_TC001_updating_your_company_session
  Scenario: US084_TC001_User_should be able to update your company session
    Given user goes to therapist login page
    When user clicks Profile Button
    Then User verifies Company title is clickable
    Then user clicks on the company link
    Then user verifies the previously attached company information is visible
    Then user clicks Edit Button for company
    Then user verifies Edit your company information page displayed
    Then user updates the company name
    And user updates the Company's Address
    And user updates the City, State, Zip
    And user updates the Country
    And user updates the Company's URL
    And user updates the Company's Phone Number
    And user updates the image
    And user clicks on the updates button
    And user verifies -Company information has been updated- alert
    And user verify all updates are as expected
