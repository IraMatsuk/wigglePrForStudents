Feature: Login Functionality
  In order to test the login page
  As a registered or authorized user
  I want to verify the login conditions


  Scenario Outline: Login with valid credentials
    Given User is on a login page
    When User enter valid "<Email address>" in Email address field
    And User enter valid "<Password>" in Password field
    And User clicks on checkbox to show password
    And User clicks on button
    Then User should navigate to User Account page

    Examples:
      | Email address             | Password     |
      | matsukirina1.20@gmail.com | NewPassw0rd1 |


  Scenario: Login with forgotten password
    Given User is on a login page
    When User clicks on link Forgotten your password
    Then User should navigate to Reset password page



