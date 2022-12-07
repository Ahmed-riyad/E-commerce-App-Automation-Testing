@smoke

Feature: User could Select different Categories

 Background: Open Browser and Navigate to Page
  Given user go to login page
  Then user enter email "testEmail@1example.com" and Password "P@ssw0rd"
  When user clicks on login button

  #Scenario SC6
  Scenario: SC6- Logged user could select different Categories
   Given user select different category tabs
   Then user select Computers and go to sub category Software
   And user select Windows-8-Pro
   When user clicks on currencies list and select euro
   Then user can see € sign in products





