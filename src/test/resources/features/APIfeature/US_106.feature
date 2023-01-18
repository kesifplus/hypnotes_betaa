Feature: As a user, I should be able update blocked date

  @US_106
  Scenario: TC_001 The user update a blocked time on the calender
    Given the user connects to "hypnotherapist/timeoff/create"
      | isRecurring | recurringDays[0] | startAt | finisAt | title  | specificDate | isAllDay |
      | false       | Thursday         | 00:30   | 01:00   | Online | 2022-12-29   | false    |
    Then the user verifies that status code of the response is 200
    And the user verifies  the api response has mandatory fields
      | status             |
      | data               |
      | data.id            |
      | data.isRecurring   |
      | data.startAt       |
      | data.finishAt      |
      | data.recurringDays |
      | data.specificDate  |
      | data.isAllDay      |
      | data.locationTitle |
