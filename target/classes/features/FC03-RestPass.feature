
@smoke

Feature: User Could Rest Password

  Background: Open Browser and Navigate to Page


  # Scenario SC3
  Scenario: SC3-  could reset his/her password successfully
    Given user go to login page
    Then user clicks on Forget password Link
    Then user enter email "testEmail@example.com"
    When user clicks on Recover button
    Then Success massage appears on screen


