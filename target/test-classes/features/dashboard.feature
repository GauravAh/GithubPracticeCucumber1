
  Feature: Fashion menu hover functionality

    Background:
      Given I am on flipkart page

      @smoke
      Scenario: Display fashion section on mouse hover
        When I hover mouse over menu tab
        Then The fashion section should be displayed

       @smoke
       Scenario: User Click on Mens Tshirt from faishon menu
         When I hover mouse over menu tab
         Then The fashion section should be displayed
         And User clicks on Mens T-shirt
         Then User should be navigated to Mens T-Shirt page