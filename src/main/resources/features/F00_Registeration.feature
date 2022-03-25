@smoke
Feature: F00_Registration |  User could register with valid data

  Scenario: User Successful Registration
    Given  User go to registration page
    When   User enter the user data
    And   User click register button
    Then  User Register Successfully
