@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @GetAllTopic.BE1
  Scenario Outline: Admin Get All Topic
    Given Admin Set method to GET BE1
    When Admin Set URL http://35.78.120.202/api/v1/topics/ BE1
    And Admin click button Test Request BE1
    Then Show the verify result 200 OK BE1

  @GetAllTopic.BE2
  Scenario Outline: Admin Get All Topic
    Given Admin Set method to PUT BE2
    When Admin Set URL http://35.78.120.202/api/v1/topics/ BE2
    And Admin click button Test Request BE2
    Then Show the verify result 405 Method Not Allowed BE2
