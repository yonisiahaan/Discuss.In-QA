@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @GetTopicByIdTopic.BF1
  Scenario Outline: Admin Get Topic by id
    Given Admin Set method to GET BF1
    When Admin Set URL http://35.78.120.202/api/v1/topics/1/ BF1
    And Admin click button Test Request BF1
    Then Show the verify result 200 OK BF1

  @GetTopicById.BF2
  Scenario Outline: Admin Get Topic by id
    Given Admin Set method to GET BF2
    When Admin Set URL http://35.78.120.202/api/v1/topics/1/ BF2
    And Admin click button Test Request BF2
    Then Show the verify result 400 Bad Request BF2

  @GetTopicById.BF3
  Scenario Outline: Admin Get Topic by id
    Given Admin Set method to POST BF3
    When Admin Set URL http://35.78.120.202/api/v1/topics/1/ BF3
    And Admin click button Test Request BF3
    Then Show the verify result 405 Method Not Allowed BF3
