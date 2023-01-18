Feature:Edit Client Information

  Background:
    Given user goes to therapist login page
    When user clicks clients
    Then user clicks View Detail of first client
    And user clicks Edit Button
    And user deletes client's first name
    Then verify "Please input your First Name!" is visible
    And user deletes client's last name
    Then verify  that "Please input your Last Name!" is visible

  Scenario Outline: TC001-If the customer's name and surname are left blank, a warning message should appear.
    When user enters new "<name>", "<last name>" on page
    And user clicks save button
    Then "Are you sure you want to update the client's info?" is visible
    When user clicks yes button
    Then user verifies alert size is "<alertNumber>"
    And user verifies alert messages are "<alertMessage>"
    Examples:
      | name  | last name | alertNumber | alertMessage                                               |
      |       |           | 2           | Please input your First Name!,Please input your Last Name! |
      |       | Koyuncu   | 1           | Please input your First Name!                              |
      | Kazim |           | 1           | Please input your Last Name!                               |


  Scenario:TC002-Alert message check "...should not include any digit or special characters"
    When user enters wrong values in Client Info and alert message should visible
      | name                         | First Name                     |
      | middleName                   | Middle Name                    |
      | surname                      | Last Name                      |
      | occupation                   | Occupation                     |
      | emergencyContactRelationship | Emergency Contact Relationship |
      | doctorName                   | Family Doctor Name             |
      | guardianName                 | Guardian Name                  |

  Scenario:TC003-Alert message check "The input is not valid..."
    When user enters wrong values for editing alert message should visible
      | email         | 2 |
      | zipCode       | a |
      | doctorEmail   | 3 |
      | guardianEmail | 5 |
    Then "The input is not valid" message is displayed


  Scenario: TC004-If the customer's name and surname are edited, the final version should be seen.
    When user enters new name and new lastname
    And user clicks save button
    And user clicks yes button
    Then "Client Info has been successfully updated!✅" message should be visible
    When user clicks clients tab
    Then On the search Client page, edited First and Lastname should appear


  Scenario:TC005-If the user clicks the cancel button, the client information should not be updated.
    When user enters new name and new lastname
    And user clicks cancel button
    When user clicks clients tab
    Then On the search Client page, edited First and Lastname should not appear