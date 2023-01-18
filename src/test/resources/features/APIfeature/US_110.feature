@beta_login
Feature:  As a user, I should be able to create rate us info

  Scenario:user creates feedback
    Given  user connects to the  "/dashboard/rateUs"
      | rate | feedback | email                | userEmail                 | fullName        |
      | 3    | gut      | noreply@hypnotes.net | hypnotes2022tr2@gmail.com | Mustafa Duyarer |

    Then user verifies that the status code of the response is 200

