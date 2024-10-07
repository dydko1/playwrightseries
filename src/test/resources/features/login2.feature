@release1
Feature: Searching New Cars
  In order to search new cars. As a User. I have to naviagate to carwale.com.

  Scenario Outline: Finding new cars test1
    Given user navigates to carwale website
    When user mouseover to newcars
    Then user clicks on Find new cars link
    And user clicks on "<carBrand>" car
    And user validates carTitle as "<carTitle>"
    Examples:
      | carBrand | carTitle    |
      | Toyota   | Toyota Cars |
#      | Kia      | Kia Cars    |
#      | Kia2      | Kia Cars2  |
#      | Honda    | Honda Cars  |
#      | BMW      | BMW Cars    |


  Scenario: Test2
    Given user navigates to carwale website
    When user mouseover to newcars
    Then user clicks on Find new cars link