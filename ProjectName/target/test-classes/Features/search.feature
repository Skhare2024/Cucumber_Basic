Feature: Search

Scenario: Search in google 1
Given navigate to google.com
When enter the value for search and click search
Then search should be successful

Scenario: Search in google 2
Given navigate to google.com
When enter the "Selenium 3" for search and click search
Then search should be successful

Scenario Outline: Search in google 3
Given navigate to google.com
When enter the "<searchText>" for search and click search
Then search should be successful

Examples:
    | searchText   |
    | Selenium 4.8.2   |
    | Selenium 4.8.3   |
    