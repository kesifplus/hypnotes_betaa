Feature:I should be able to perform various actions in the Profile(Your Company) section

  Scenario:
    Given user goes to hypnotes page
    When hover over sign up button
    And user clicks therapist sign up button
    And user goes to therapist login page
    And user enters faker full name,email and password
    And user clicks sign up button
    Then user clicks Profile

  Scenario:
    Given User Navigates to "dashboard/profile"
    When User Open Company details Page
    Then User verifies Company title is clickable
    Then user clicks on the company title
    And user verifies add new company button is visible
    Then clicks on add new company button
    And verifies the "Your Logo, Your Company, Company's Address, City, State, Zip, Country, Company's URL, Company's Phone Number Fields are visible
    And user verifies a valide logo is loadable
    And user verifies a valid company's name is applicable
    And user verifies a valid company's address is applicable
    And user verifies a valid city,state,zip should be applicable the related fields
    And user verifies country dropdown  menu is functionalable
    And user verifies a country is selectable from dropdown menu
    And user verifies a valid Url is applicable
    And user verifies a valid company's phone number is applicable the related fields
    And user verifies a valid email address is applicable the related fields
    Then user clicks on the updates button




