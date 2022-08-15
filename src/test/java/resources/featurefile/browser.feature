@browser
Feature: creating a demo account and adding crypto currencies

  Scenario: creating a demo account

    Given User is on myvip.avatrade.com page
    When  User clicks on try free demo
    Then  User navigates to next page and verify open demo account text to next page and verify open demo account text

 Scenario: User sending details to create an demo account
     Given User on AVA TRADE open demo account page
     When  User sends in First Name
     And   User sends in Last Name
     And   User sends Email address
     And   User enters Phone Number
     And   User clicks for Promotion and newsletters
     And   User accepts all Terms and Conditons
     When  User clicks on Create Account button
     Then  User navigates to AVATrade page.










