
Feature: As a user (Therapist), I should be able to see various information on the profile page

  Background:
    Given user goes to therapist login page

  Scenario Outline: TC_001
    Given user click profile
    And user assert "About Header" text visible
    And user assert  Profile information of the therapist should be visible
    And user assert "Educations","Experiences", "Specialties & Certifications", "Your Company" titles must be visible
    And user click "Add New Education" button
    And user assert "Create a new Education" text visible
    And user enter "<School Name>", "<Department>", "<Start Date>", "<End Date>", "<Description>"
    And user click save button
    And user assert added Educations should be visible when entering the page
    And user click "Make my profile public switch button"

    Examples:
    |  School Name   |  Department  |  Start Date   |   End Date  | Description |


    Scenario Outline: TC_002
    Given user click "Edit Profile" button
    And user assert "Edit Profile" page visible
    And user uploads file
    And user enter "<Full Name>", "<Job Title>", "<Country>", "<State>", "<City>", "<Address>", "<Zip Code>", "<About Me>"
    And user click save button
    And user verifies "Profile is updated" message
    And user verifies Saved information must be visible on Profile page
    And user assert "Cancel button" clickable and visible

  Examples:
    |  Full Name   |  Job Title   |   Country     | State | City | Address | Zip Code | About Me |
