Feature:Home

  @HomePageTitles
  Scenario: Blog, Services, Solutions, Pricing, Contact us, About us, Therapist Directory, ?,
  Login, Sign Up headings should be visible
    Given User goes to website
    Then assert titles are visible


  @HomePageTitles2
  Scenario: Blog, Services, Solutions, Pricing, Contact us, About us, Therapist Directory, ?,
  Login, Sign Up headings should be clickable
    Given User goes to website
    Then assert titles are clickable