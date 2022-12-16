Feature: Login Account
  As a user
  I want to login
  So I can access my dashboard

  Scenario Outline: Login with email and Password
    Given I am on the login page
    When I input "<email>" email "<password>" password
    And I click Login button
    Then I will get the "<result>"
    Examples:
    |email |password |result        |
    |valid |valid    |success       |
    |random|valid    |failed message|
    |valid |random   |failed message|
    |random|random   |failed message|
    |null  |null     |failed message|
    |random|null     |failed message|
    |null  |random   |failed message|
    |valid |null     |failed message|
    |null  |valid    |failed message|
