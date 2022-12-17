@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @DeleteTopic.FF1
  Scenario Outline: Admin Delete Topic with valid input id
    Given Admin Set method to DeleteTopic FF1
    When Admin Set URL http://35.78.120.202/api/v1/topics/delete/72 FF1
    And Admin click button Test Request FF1
    Then Show the verify result 200 OK FF1

  @DeleteTopic.FF2
  Scenario Outline: Admin Delete Topic  with invalid input id
    Given Admin Set method to DeleteTopic FF2
    When Admin Set URL http://35.78.120.202/api/v1/topics/delete/1 FF2
    And Admin click button Test Request FF2
    Then Show the verify result 404 Not Found FF2

  @DeleteTopic.FF3
  Scenario Outline: Admin DeleteTopic user with invalid method request
    Given Admin Set method to PUT FF3
    When Admin Set URL http://35.78.120.202/api/v1/topics/delete/1 FF3
    And Admin click button Test Request FF3
    Then Show the verify result 405 Method Not Allowed FF3
