Feature: Logout Account
  As a user
  I want to logout
  So I can logout my account

  Scenario: Logout with valid email and Password
    Given I am on the home page
    When I click Profile button
    And I click Setting button
    Then I click logout icon
    And I will go to login page