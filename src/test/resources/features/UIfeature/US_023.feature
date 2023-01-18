@US023
Feature:Log in as a user on the page I am therapist? I should be able to see that the button is functional

  Scenario:TC_001
    Given User goes to website
    And  Sign up appears and user mouses over Sign Up
    When User sees therapist and clicks
    And  User clicks login button
    Then On the page "I am therapist?" button ist clickable

