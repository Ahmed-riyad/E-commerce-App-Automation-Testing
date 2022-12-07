@smoke

  Feature: Logged user could add different products to Wishlist

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "testEmail@example.com" and Password "P@ssw0rd"
      When user clicks on login button

      #Scenario: SC10
    Scenario: SC10- Logged user could add different products to Wishlist
      Given user select Apparel and go to sub category Shoes
      Then user select color red from CheckBox
      Then user select size and color
      Then user add item to Wishlist
      Then user select Computers and go to sub category Software
      And user select Windows-8-Pro and added to Wishlist
      Then user go to Wishlist page and view items



