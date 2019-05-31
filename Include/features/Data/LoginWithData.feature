#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


@LoginData
Feature: Sign in on the login page
  As a user I want to sign in to my account

 @ValidLogin
  Scenario Outline: sign in as simple user on mss portal 
    Given I navigate to mms login page
    When I inter mss username <username> and password <password>
    And I click on login button
    Then am on the home page

    Examples: 
      | username 										 | password 																	  |
      | mss_uat_tst_smile_marc       | ijdvIsWMz78SLKul36eVLbCn/PuUMCA6cHe61FHJLWM= |
         |