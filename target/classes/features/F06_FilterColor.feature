@smoke
Feature: F06_FilterColor |  User could filter product with color
  Scenario: User could filter shoes by colors
    Given The Logged user
    When  User Choose shoes category
    And   User Choose blue color shoes
    Then  Required product color appears successfully

