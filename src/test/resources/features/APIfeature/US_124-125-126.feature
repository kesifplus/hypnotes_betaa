@beta_login
Feature:Location Settings
  @US_124_Create_Location
  Scenario: US_124 As a user, I should be able to create location.
    Given user connects to the "/settings/location/add" for creation to "locationInfo"
      | addressTitle | address       | zipCode | timeZone                        |
      | Work         | Kahraman Cad. | 0526    | Mountain Standard Time (Mexico) |
    Then user verify status code 200

  @US_125_Update_Location
    Scenario: US_125 As a user, I should be able to update location.
      Given user connects to the "/settings/location/update" for update with "id"
        |addressTitle|address     |zipCode|timeZone|
        |Office      |Kahraman Cad|1256   |Standard|
      When user verify status code 200
      Then user verify change is as expected
    |locationInfo.addressTitle|Office      |
    |locationInfo.address     |Kahraman Cad|
    |locationInfo.zipCode     |1256        |
    |locationInfo.timeZone    |Standard    |

  @US_126_deleteLocation
    Scenario: : US_126 As a user, I should be able to delete location.
    Given user connects to the "/settings/location/delete" for delete with "id"
    When user verify status code 200
    Then user verify success is true
