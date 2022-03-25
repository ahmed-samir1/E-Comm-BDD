@smoke
Feature: F09_AddToWishList |  Logged user could add different products to Wishlist
  Scenario: User add different products to Wishlist
    Given User logs
    When  User clicks on product tabs
    And   User clicks on required product
    And   User click on add to wishlist
    Then  Related product added successfully

