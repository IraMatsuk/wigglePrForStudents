Feature: Search Functionality
  In order to test the login page
  As a registered or authorized user
  I want to verify the login conditions

  Scenario: Search product by a word and login with forgotten password
    Given Search field is displayed on the main page
    When User typed a word in search field and press enter
    And User should navigate to Product page
    And User clicks on the first product on Product page
    And User should navigate to Item page
    And User check is Add to basket button displayed
    And User clicks on Your account link
    And User should navigate to User Account page
    And User clicks on link Forgotten your password
    Then User should navigate to Reset password page

