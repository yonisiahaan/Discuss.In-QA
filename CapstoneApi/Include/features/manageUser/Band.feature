@tag
Feature: Band Admin Feature
  I want to use this template for my feature file

  @Band.BA1
  Scenario Outline: Admin Band Admin with input day
    Given Admin Set method to PUT BA1
    When Admin Set URL http://35.78.120.202/api/v1/Admins/3/ban BA1
    And Admin input HTTP Body BA1
    And Admin click button Test Request BA1
    Then Show the verify result 200 OK BA1

  @Band.BA2
  Scenario Outline: Admin Band Admin with input day
    Given Admin Set method to PUT BA2
    When Admin Set URL http://35.78.120.202/api/v1/Admins/3/ban BA2
    And Admin input HTTP Body BA2
    And Admin click button Test Request BA2
    Then Show the verify result 200 OK BA2

  @Band.BA3
  Scenario Outline: Admin Band Admin with invalid Method
    Given Admin Set method to POST BA3
    When Admin Set URL http://35.78.120.202/api/v1/Admins/3/ban BA3
    And Admin input HTTP Body BA3
    And Admin click button Test Request BA3
    Then Show the verify result 405 Method Not Allowed  BA3
