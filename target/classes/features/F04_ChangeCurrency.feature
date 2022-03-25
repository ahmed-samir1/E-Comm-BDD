@smoke
Feature: F04_ChangeCurrency |  User could change currency successfully
  Scenario: User change currency successfully
    Given Logged user
    When  User Change currency from currency menu
    Then  Currency changes successfully


