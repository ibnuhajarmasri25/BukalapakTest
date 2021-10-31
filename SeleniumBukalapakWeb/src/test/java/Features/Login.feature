@bukalapakTest
@login
Feature: Login Bukalapak.com
  Background:
    Given Initiate Browser
    Given setup SetTestData
    Given Navigate Bukalapak.com
  Scenario Outline: Bukalapak Login
    Then navigate to login page
    Then input email
    Then input password
    And Click login Button
    And Search "<Product>"
    And Add To chart
    Examples:
      | Product            |
      | Iphone             |



