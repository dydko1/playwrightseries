@release2
Feature: Searching New Cars
  In order to search new cars. As a User. I have to naviagate to carwale.com.

  Scenario: Finding new cars test3
    Given user navigates to carwale website
    When user mouseover to newcars
    Then user clicks on Find new cars link
    And user clicks on "<carBrand>" car
    And user validates carTitle as "<carTitle>"

  Scenario: Test4
    Given user navigates to carwale website
    When user mouseover to newcars
    Then user clicks on Find new cars link