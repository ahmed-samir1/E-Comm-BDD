@smoke
Feature: F11_SuccessfulOrder |  Create successful Order
  Scenario: User add different products to cart
    Given user login
    When  User add product to cart
    And   User click on checkout
    And   User completes his data
    And   User follow all steps
    Then  Order completed successfully

