@smoke
Feature: F02_ForgetPassword | User could reset his/her password successfully

  Scenario: user should be able to reset password successfully
    Given User goes to login page
    When  User click on forget password button
    And   User enter valid user email
    And   User click recover button
    Then  User recover password successfully