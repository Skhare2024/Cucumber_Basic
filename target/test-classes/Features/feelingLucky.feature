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
@GoogleSearch
Feature: I am feeling lucky
  #I want to use this template for my feature file

  @Test
  Scenario: Search in google 1a
    Given navigate to google.com
		When enter the value for search and click I m Feeling Lucky
		Then search by feeling lucky should be successful

  @Test @tag2
  Scenario Outline: Search in google 1b
    Given navigate to google.com
		When enter the "<searchText>" for search and click I m Feeling Lucky
		Then search by feeling lucky should be successful
		
		Examples:
		    | searchText   |
		    | Selenium 4.8.2   |
		    | Selenium 4.8.3   |
