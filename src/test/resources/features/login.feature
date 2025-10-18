Feature: Login

  Scenario: Successful login
    Given user navigates to the login page
    When user enters valid credentials
    Then user should see the dashboard