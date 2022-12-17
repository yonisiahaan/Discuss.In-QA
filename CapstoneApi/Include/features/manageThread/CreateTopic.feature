@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @CreateTopic.BG1
  Scenario Outline: Admin create topic with valid name and description
    Given Admin Set method to POST BG1
    When Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG1
    And Admin input HTTP Body BG1
    And Admin click button Test Request BG1
    Then Show the verify result 201 Created BG1

  @CreateTopic.BG2
  Scenario Outline: Admin create topic with valid name and description
    Given Admin Set method to POST BG2
    When Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG2
    And Admin input HTTP Body BG2
    And Admin click button Test Request BG2
    Then Show the verify result 409 Conflict BG2

  @CreateTopic.BG3
  Scenario Outline: Admin create topic with valid name and description
    Given Admin Set method to POST BG3
    When Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG3
    And Admin input HTTP Body BG3
    And Admin click button Test Request BG3
    Then Show the verify result 201 Created BG3

  @CreateTopic.BG4
  Scenario Outline: Admin create topic with valid name and description
    Given Admin Set method to POST BG4
    When Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG4
    And Admin input HTTP Body BG4
    And Admin click button Test Request BG4
    Then Show the verify result 400 Bad Request BG4

  @CreateTopic.BG5
  Scenario Outline: Admin create topic with valid name and description
    Given Admin Set method to POST BG5
    When Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG5
    And Admin input HTTP Body BG5
    And Admin click button Test Request BG5
    Then Show the verify result 400 Bad Request BG5

  @CreateTopic.BG6
  Scenario Outline: Admin create topic with valid name and description
    Given Admin Set method to PUT BG6
    When Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG6
    And Admin input HTTP Body BG6
    And Admin click button Test Request BG6
    Then Show the verify result 405 Method Not Allowed BG6

  @CreateTopic.BG7
  Scenario Outline: Admin create topic with valid name and description
    Given Admin Set method to POST BG7
    When Admin Set URL http://35.78.120.202/api/v1/topics/create/ BG7
    And Admin input HTTP Body BG7
    And Admin click button Test Request BG7
    Then Show the verify result 400 Bad Request BG7
