@smoke
Feature: F08_AddToCart |  Logged user could add different products to Shopping cart
  Scenario: User add different products to cart
    Given User log
    When  User click on product tabs
    And   User click on required product
    And   User click on add to cart
    Then  Related products added successfully

