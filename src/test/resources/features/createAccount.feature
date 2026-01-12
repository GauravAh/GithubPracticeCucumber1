
  Feature: Create account functionality

    Background:
      Given I am on a facebook create account page

      @smoke
      Scenario Outline: Create Facebook account with valid data
        When I enter firstname "<FirstName>" in name field
        And I enter surname "<SurName>" in name field
        And I select date of birth from dropdown list
        And I select gender "<Gender">
        And I enter mobile no "<MobileNo"> in text field
        And I enter new password "<New password>"
        And I click on signup button
        Then Validation should be displayed

        Examples:
        | FirstName | SurName | MobileNo | New password | Gender |
        | Gaurav | Ahuja | 9988 | 12345 | Male |
        | Neha   | Ahuja | 8855 | 12345 | Female |

      @sanity
      Scenario: Create Facebook account with valid data using data table
        When I enter below registration details
        | FirstName | LastName | MobileNo | NewPassword |
        | Saurav    | Sharma   | 878787   | 12345       |
        And I select date of birth from dropdown list
        And I select gender from radio button
        And I click on signup button
        Then Validation should be displayed


