Feature: Login form interaction

  Scenario: Successful login
    Given user opens login page
    When user enters valid credentials
    And clicks sign in button
    Then user should be redirected to the homepage