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

@Login
Feature: Sign in on the login page
  As a user I want to sign in to my git account

 @InValid
  Scenario Outline: sign in as simple user with incorrect identifier
    Given I navigate to gitHub login page
    When I inter my username <username> and password <password>
    And I click on the login button
    Then an error message is displayed on the page

    Examples: 
      | username 						 | password |
      | sarra@gmail.com      | p@ssword |
      
      
      