Feature:As a user, I should be able to see the Clients added on the Search Clients page

  Background:
    Given user goes to therapist login page
    And user clicks clients


  Scenario:
    When assert Search Client is visible and clickable
    Then assert Search Client Button is visible and clickable
    Then assert Name in Dropdown Functionality is visible and clickable
    Then assert Surname in Dropdown Functionality is visible and clickable
    Then assert Date Added in Dropdown Functionality is visible and clickable

#    When Added Clients should be seen
#    And Search Clients section should be functional
#    And Search button should be clickable
#    And you click the Search button, it should give the correct result (The letters should be in order) !!!
#    And Sort by' dropdown should be functional
#    And The 'Sort by' dropdown should select any 'Sort by'
#    And The selected 'sort by' should give the correct result

