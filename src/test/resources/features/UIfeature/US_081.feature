Feature:As a user (Therapist), I should be able to perform various actions in the Profile(Specialties & Certifications) section
  Background:
    Given user goes to therapist login page
    And user clicks Profile

    Scenario: TC001 Specialties Page
      And user clicks Specialties&Certifications Text
      And user clicks Add New Specialty Button
      And user verifies add Specialty text visible
      And user clicks on specialty dropdown
      And user selects any Speciality Name
      When user clicks create Button
      Then user verifies "Specialties is added" message is visible
      And user clicks Add Specialty Cancel button

