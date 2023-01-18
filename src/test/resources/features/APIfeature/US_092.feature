@beta_login
Feature:US_092
  Scenario: TC001  As a user, I should be able to delete a coupon.
    When user sends Post Request to "promoCode/deleteCoupon" Delete
    Then user verifies the status code of the response is "200"
    Then user verifies delete with "success"




