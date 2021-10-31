@bukalapakTest
@createAccount
Feature: Create account
  Background:
    Given Initiate Browser
    Given setup SetTestData
    Given Navigate Bukalapak.com
#    Positive
  Scenario Outline: Create Account
    Given Navigate Registration Page
    Then input new email "<Email>"

    Examples:
      |Email                      |
      |ibnuhazar.122@gmail.com    |

     #negatif
  Scenario Outline: Negative Create account
    Given Navigate Registration Page
    Then input already email "<Email>"

    Examples:
      | Email                    |
      | ibnuhazar.pmm@gmail.com  |
