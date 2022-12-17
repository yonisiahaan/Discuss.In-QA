@tag
Feature: Title of your feature
  I want to use this template for my feature file

 @Postsuspended.BD1
  Scenario Outline: Admin suspended Post with id 
   Given Admin Set method to PUT BD1
   When Admin Set URL http://35.78.120.202/api/v1/posts/3/suspend/ BD1
   And Admin click button Test Request BD1
   Then Show the verify result 200 OK BD1
   
   
 @Postsuspended.BD2
  Scenario Outline: Admin suspended Post with invald ID
   Given Admin Set method to PUT BD2
   When Admin Set URL http://35.78.120.202/api/v1/posts/3/suspend/ BD2
   And Admin click button Test Request BD2
   Then Show the verify result 500 Internal Server Eror BD2
   
  @Postsuspended.BD3
  Scenario Outline: Admin suspended Post with invald ID
   Given Admin Set method to GET BD3
   When Admin Set URL http://35.78.120.202/api/v1/posts/3/suspend/ BD3
   And Admin click button Test Request BD3
   Then Show the verify result 405 Method Not Allowed BD3