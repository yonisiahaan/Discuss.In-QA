
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Login.AA1
  Scenario Outline: user login with valid email and password
    Given User Set method to PUT AA1
    When User Set URL http://35.78.120.202/api/v1/users/login AA1
    And User input HTTP Body AA1
    And User click button Test Request AA1
    Then Show the verify result 200 OK AA1
    
  @Login.AA2
  Scenario Outline: User login using input blank email and valid password
    Given User Set method to PUT AA2
    When User Set URL http://35.78.120.202/api/v1/users/login AA2
    And User input HTTP Body AA2
    And User click button Test Request AA2
    Then Show the verify result 400 Bad Request AA2
    
  @Login.AA3
  Scenario Outline: User login using input valid email and invalid password
    Given User Set method to PUT AA3
    When User Set URL http://35.78.120.202/api/v1/users/login AA3
    And User input HTTP Body AA3
    And User click button Test Request AA3
    Then Show the verify result 403 Forbidden AA3
  
  @Login.AA4
  Scenario Outline: User login using invalid method request
    Given User Set method to PUT AA4
    When User Set URL http://35.78.120.202/api/v1/users/login AA4
    And User input HTTP Body AA4
    And User click button Test Request AA4
    Then Show the verify result 405 Method Not Allowed AA4