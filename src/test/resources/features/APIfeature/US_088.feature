Feature:
 # @beta_login
  Scenario:As a user, I should be able to get coupons.
    When user sends Post Request to "promoCode/getCoupons" for get coupons.
    Then the user verifies the status code of the response is "200"


