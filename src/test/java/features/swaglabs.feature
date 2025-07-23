Feature: swag labs scenarios
  Background:
    Given I am on swag labs website

  Scenario Outline: Enter a valid username and password
    When I enter a valid <email> and <password>
    And I click on the Login button
    Then I am logged on the page

    Examples:
      | email          | password |
      | test1@test.com | Test1234 |
      |                |          |

  Scenario Outline: Enter an invalid username and password
    When I enter an invalid <email> and <password>
    And I click on the Login button
    Then I get an error message

    Examples:
      | email          | password |
      | test1@test.com | Test1234 |