@LoginAndAddCryptoCurrencies

Feature: User Logging into AVA Trade website and adding Crypto currencies


 Scenario: User Logging into AVA Trade Trading website
   Given User is on Login Page
   When   User enters email id into email element
   And    User enters password into password element
   And    User clicks on Login button
   Then   User navigates to Trading Page
   When  User selects Trade Element on the left hand side
   And   User scrolls and find the element and click on crypto
   And   User selects Five of his favourites
   And   User go back to favourites and select
   Then  User should be able to see all selected crypto currencies in favourites

