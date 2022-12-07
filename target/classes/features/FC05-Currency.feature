@smoke

Feature: User can Change Products Currencies
 Background: Open Browser and Navigate to Page
  Given user go to login page
  Then user enter email "testEmail@1example.com" and Password "P@ssw0rd"
  When user clicks on login button

  #Scenario SC5
  Scenario: SC5- Logged User could switch between currencies US-Euro
   Given user clicks on currencies list and select euro
   Then user can see € sign in products




