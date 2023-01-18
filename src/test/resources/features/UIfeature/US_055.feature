@US_055_Updating_Presenting_Issue
Feature: US_55_Updating_Presenting_Issue
  Background:
    Given user goes to therapist login page
    Then user clicks clients
    And user search client "Deniz Akar"
    And user clicks view detail

@TC_001_Updating_Presenting_Issue_Subjective
  Scenario: TC_001_Updating_Presenting_Issue_Subjective
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem "anxiety"
    And verify -Chief or Primary Complaint- text is visible
    And enter Name Of CC Box new value
    And verify -Successfully updated- message
    And enter Brief Statement Box new value
    And verify -Successfully updated- message
    And enter Onset Box new value
    And verify -Successfully updated- message
    And enter Location Box new value
    And verify -Successfully updated- message
    And enter Duration Box new value
    And verify -Successfully updated- message
    And enter Character Box new value
    And verify -Successfully updated- message
    And enter Alleviating Box new value
    And verify -Successfully updated- message
    And enter Radiation Box new value
    And verify -Successfully updated- message
    And enter Temporal Pattern Box new value
    And verify -Successfully updated- message
    And enter Severity Box new value
    And verify -Successfully updated- message
    And enter Pertinent History Box new value
    And verify -Successfully updated- message
    And enter Surgical History Box new value
    And verify -Successfully updated- message
    And enter Social History Box new value
    And verify -Successfully updated- message
    And enter Review Of Symptoms Box new value
    And verify -Successfully updated- message
    And enter Current Medications Box new value
    And verify -Successfully updated- message
    And user deletes the problem
    And verify -Issue is successfully deleted.- alert

  @TC_002_Updating_Presenting_Issue_Subjective_With_Just_Click
  Scenario: TC_002_Updating_Presenting_Issue_Subjective_With_Just_Click
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem "anxiety"
    And verify -Chief or Primary Complaint- text is visible
    And click and pass Name Of CC Box
    And verify -Successfully updated- message
    And click and pass Brief Statement Box
    And verify -Successfully updated- message
    And click and pass Onset Box
    And verify -Successfully updated- message
    And click and pass Location Box
    And verify -Successfully updated- message
    And click and pass Duration Box
    And verify -Successfully updated- message
    And click and pass Character Box
    And verify -Successfully updated- message
    And click and pass Alleviating Box
    And verify -Successfully updated- message
    And click and pass Radiation Box
    And verify -Successfully updated- message
    And click and pass Temporal Pattern Box
    And verify -Successfully updated- message
    And click and pass Severity Box
    And verify -Successfully updated- message
    And click and pass Pertinent History Box
    And verify -Successfully updated- message
    And click and pass Surgical History Box
    And verify -Successfully updated- message
    And click and pass Social History Box
    And verify -Successfully updated- message
    And click and pass Review Of Symptoms Box
    And verify -Successfully updated- message
    And click and pass Current Medications Box
    And verify -Successfully updated- message
    And user deletes the problem
    And verify -Issue is successfully deleted.- alert

    @TC_003_Updating_Presenting_Issue_Objective
    Scenario: TC_003_Updating_Presenting_Issue_Objective
      And user clicks on the Presenting Issues
      And user clicks addNewProblemButton
      And user creates a new problem "anxiety"
      And user clicks Objective Link
      And enter Physical Presentation Box new value
      And verify -Successfully updated- message
      And enter Characterization Box new value
      And verify -Successfully updated- message
      And enter Psychological Status Box new value
      And verify -Successfully updated- message
      And enter Laboratory Results Box new value
      And verify -Successfully updated- message
      And user deletes the problem
      And verify -Issue is successfully deleted.- alert

  @TC_004_Updating_Presenting_Issue_Objective_With_Just_Click
  Scenario: TC_004_Updating_Presenting_Issue_Objective_With_Just_Click
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem "anxiety"
    And user clicks Objective Link
    And click and pass Physical Presentation Box
    And verify -Successfully updated- message
    And click and pass Characterization Box
    And verify -Successfully updated- message
    And click and pass Psychological Status Box
    And verify -Successfully updated- message
    And click and pass Laboratory Results Box
    And verify -Successfully updated- message
    And user deletes the problem
    And verify -Issue is successfully deleted.- alert

  @TC_005_Updating_Presenting_Issue_Assessment
  Scenario: TC_005_Updating_Presenting_Issue_Assessment
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem "anxiety"
    And user clicks Assessment Link
    And enter Diagnosis Or Problem Box new value
    And verify -Successfully updated- message
    And enter Differential Diagnosis Box new value
    And verify -Successfully updated- message
    And user deletes the problem
    And verify -Issue is successfully deleted.- alert

  @TC_006_Updating_Presenting_Issue_Assessment_With_Just_Click
  Scenario: TC_006_Updating_Presenting_Issue_Assessment_With_Just_Click
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem "anxiety"
    And user clicks Assessment Link
    And click and pass Diagnosis Or Problem Box
    And verify -Successfully updated- message
    And click and pass Differential Diagnosis Box
    And verify -Successfully updated- message
    And user deletes the problem
    And verify -Issue is successfully deleted.- alert

  @TC_007_Updating_Presenting_Issue_Plan
  Scenario: TC_007_Updating_Presenting_Issue_Plan
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem "anxiety"
    And user clicks Plan Link
    And enter Medication Prescribed Box new value
    And verify -Successfully updated- message
    And enter Psychoeducation Box new value
    And verify -Successfully updated- message
    And enter Testing Box new value
    And verify -Successfully updated- message
    And user deletes the problem
    And verify -Issue is successfully deleted.- alert

  @TC_008_Updating_Presenting_Issue_Plan_With_Just_Click
  Scenario: TC_008_Updating_Presenting_Issue_Plan_With_Just_Click
    And user clicks on the Presenting Issues
    And user clicks addNewProblemButton
    And user creates a new problem "anxiety"
    And user clicks Plan Link
    And click and pass Medication Prescribed Box
    And verify -Successfully updated- message
    And click and pass Psychoeducation Box
    And verify -Successfully updated- message
    And click and pass Testing Box
    And verify -Successfully updated- message
    And user deletes the problem
    And verify -Issue is successfully deleted.- alert




