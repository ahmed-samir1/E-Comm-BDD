@smoke
Feature: F07_SelectTag |  Logged user could select different tags
  Scenario: User could select different tags
    Given User login
    When  User Choose any category
    And   User choose awesome tag
    Then  Related products appear successfully

