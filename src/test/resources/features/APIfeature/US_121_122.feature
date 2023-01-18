@beta_login
Feature:
  Scenario:
    Given user connects to the "/profile/addSpeciality" for creation
    |speciality|
    |Aggression|
    When user verify status code 200
    Then user verify success is true
    
    Scenario: 
      Given user connects to the "/profile/removeSpeciality" for delete
      When  user verify status code 200
      Then user verify success is true