@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @CreateTopic.BI1
  Scenario Outline: Admin Edit topic with valid description and id
    Given Admin Set method to PUT BI1
    When Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI1
    And Admin input HTTP Body BI1
    And Admin click button Test Request BI1
    Then Show the verify result 200 Created BI1

  @CreateTopic.BI2
  Scenario Outline: Admin Edit topic with input empty description and id
    Given Admin Set method to PUT BI2
    When Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI2
    And Admin input HTTP Body BI2
    And Admin click button Test Request BI2
    Then Show the verify result 400 Bad Request BI2

  @CreateTopic.BI3
  Scenario Outline: Admin Edit topic with input invalid description and id
    Given Admin Set method to PUT BI3
    When Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI3
    And Admin input HTTP Body BI3
    And Admin click button Test Request BI13
    Then Show the verify result 400 Bad Request BI3

  @CreateTopic.BI4
  Scenario Outline: Admin Edit topic with input valid description and empty id
    Given Admin Set method to PUT BI4
    When Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI4
    And Admin input HTTP Body BI4
    And Admin click button Test Request BI4
    Then Show the verify result 400 Bad Request BI4

  @CreateTopic.BI5
  Scenario Outline: Admin Edit topic with input empty description and ID
    Given Admin Set method to PUT BI5
    When Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI5
    And Admin input HTTP Body BI5
    And Admin click button Test Request BI5
    Then Show the verify result 400 Bad Request BI5

  @CreateTopic.BI6
  Scenario Outline: Admin Edit topic with valid description and invalid Id
    Given Admin Set method to PUT BI6
    When Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI6
    And Admin input HTTP Body BI6
    And Admin click button Test Request BI6
    Then Show the verify result 400 Bad Request BI6

  @CreateTopic.BI7
  Scenario Outline: Admin Edit topic with valid description and id
    Given Admin Set method to POST BI7
    When Admin Set URL http://35.78.120.202/api/v1/topics/edit_description/1/ BI7
    And Admin input HTTP Body BI7
    And Admin click button Test Request BI7
    Then Show the verify result 405 Method Not Allowed BI7
