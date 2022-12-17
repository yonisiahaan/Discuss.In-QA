@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Delete.BB1
  Scenario Outline: Admin delete user with valid input id
    Given Admin Set method to DELETE BB1
    When Admin Set URL http://35.78.120.202/api/v1/users/1/ BB1
    And Admin click button Test Request BB1
    Then Show the verify result 201 Created BB1

  @Delete.BB2
  Scenario Outline: Admin delete user with invalid input id
    Given Admin Set method to DELETE BB2
    When Admin Set URL http://35.78.120.202/api/v1/users/1/ BB2
    And Admin click button Test Request BB2
    Then Show the verify result 404 Not Found BB2

  @Delete.BB3
  Scenario Outline: Admin delete user with invalid method request
    Given Admin Set method to PUT BB3
    When Admin Set URL http://35.78.120.202/api/v1/users/1/ BB3
    And Admin click button Test Request BB3
    Then Show the verify result 405 Method Not Allowed BB3
