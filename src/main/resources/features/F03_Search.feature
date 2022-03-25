@smoke
Feature: F03_Search | Logged User could search for any product

  Scenario: user could search for product using fullname
    Given Logged-in user
    When  User clicks on search field
    And   User search with name of product
    Then  User could find relative results
