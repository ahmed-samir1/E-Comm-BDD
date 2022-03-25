@smoke
Feature: F01_Login | Users could use login functionality to open their accounts with valid credentials

  Scenario: user should be able to login with valid username and password
    Given User go to login page
    When  User enter valid user data with valid@example.com and P@ssw0rd
    And   User click login button
    Then  User login successfully
