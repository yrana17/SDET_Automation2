@Login
Feature: Login Feature Testing

  @ValidCredLogin
  Scenario: Test Login Functionality with Valid Credentials
    Given User is on home-login page of application 
    When User enters credentials
    And click on login button
    Then User should be logged in successfully

  @InvalidCredLogin
  Scenario: Test Login Functionality with InValid Credentials
    Given User is on home-login page of application 
    When User enters credentials
    And click on login button
    Then User should get Invalid credentails error message   
    
  @LoginMixScenariosWithMultipleData  
  Scenario Outline: Test Login Functionality with different Input
   Given User is on home page of app "https://amazon.in"
   When i enter "<userid>" and "<pswd>"
   And click on submit button
   Then validate the "<status>" of login as success or failure
   
   Examples: 
    |userid| pswd| status|
    |admin | adm123| Failed|
    |test| test123| Passes|    