@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @GetAllUser.BC1
  Scenario Outline: GET All User With valid page
   Given Admin Set method to GET BC1
   When Admin Set URL http://35.78.120.202/api/v1/users?page=1 BC1
   And Admin click button Test Request BC1
   Then Show the verify result 200 OK BC1
   
  @GetAllUser.BC2
  Scenario Outline: GET All User With invalid Method Not Allowed
   Given Admin Set method to GET BC2
   When Admin Set URL http://35.78.120.202/api/v1/users?page=1 BC2
   And Admin click button Test Request BC2
   Then Show the verify result 405 Method Not Allowed BC2

   