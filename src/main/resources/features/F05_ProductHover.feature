@smoke
Feature: F05_ProductHover |  User could choose different categories
  Scenario: User could choose different categories
    Given Log user
    When  User Choose different category
    Then  Category page open successfully
    And   Sub-category page open successfully

