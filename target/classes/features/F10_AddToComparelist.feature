@smoke
Feature: F10_AddToCompareList |  Logged user could add different products to compare list
  Scenario: User add different products to compare list
    Given logged user
    When  user click on product tabs
    And   user click on required product
    And   User click on add to compare list
    Then  related products added successfully

