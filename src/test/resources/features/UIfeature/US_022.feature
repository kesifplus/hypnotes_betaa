@US022
Feature: As a user I should be able to see different options in Sign Up

  Background:
    Given User goes to website

  Scenario: TC_001 User registers as a client
    When Sign up appears and user mouses over Sign Up
    Then User sees client and clicks
    And User verifies "https://test.hypnotes.net/register/client"

  Scenario: TC_002 Available customers can register
    When User sees client and clicks
    Then User sees "Already have an account?"
    And User clicks login button verifies login url "https://test.hypnotes.net/login"


#github çalışması yapılıyor





