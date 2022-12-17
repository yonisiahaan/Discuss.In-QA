@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Register.AB1
  Scenario Outline: user register with valid email, password dan username
    Given User Set method to POST AB1
    When User Set URL http://35.78.120.202/api/v1/users/register AB1
    And User input HTTP Body AB1
    And User click button Test Request AB1
    Then Show the verify result 201 Created AB1

  @Register.AB2
  Scenario Outline: user register with invalid email, invalid password dan username
    Given User Set method to POST AB2
    When User Set URL http://35.78.120.202/api/v1/users/register AB2
    And User input HTTP Body AB2
    And User click button Test Request AB2
    Then Show the verify result 409 Conflict AB2

  @Register.AB3
  Scenario Outline: user register using input invalid password, valid email dan username
    Given User Set method to POST AB3
    When User Set URL http://35.78.120.202/api/v1/users/register AB3
    And User input HTTP Body AB3
    And User click button Test Request AB3
    Then Show the verify result 400 Bad Request AB3

  @Register.AB4
  Scenario Outline: user register with invalid username, valid email and password
    Given User Set method to POST AB4
    When User Set URL http://35.78.120.202/api/v1/users/register AB4
    And User input HTTP Body AB4
    And User click button Test Request AB4
    Then Show the verify result 415 Unsupported Media Type   AB4

  @Register.AB5
  Scenario Outline: User register invalid method request
    Given User Set method to PUT AB5
    When User Set URL http://35.78.120.202/api/v1/users/register AB5
    And User input HTTP Body AB5
    And User click button Test Request AB5
    Then Show the verify result 405 Bad Request AB5
