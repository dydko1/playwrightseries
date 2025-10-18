Feature: Dropdown list on Wikipedia

  Scenario: Verify language dropdown options
    Given user navigates to Wikipedia homepage
    When user views the language dropdown
    Then all language options should be visible