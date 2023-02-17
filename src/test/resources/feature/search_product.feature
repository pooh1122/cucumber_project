Feature: Search a Product feature

  Background: User has to login
    Given User is logged in

  @smoke
  Scenario: Verify that the user can able to search a product
    Given the user navigates to the home page
    When the user enter a product name
    Then the product result should be displayed



    Scenario: Login
      Given User is on Home Page
      When User Navigate to Login Page
      And User enters "testuser" and "test@123"


