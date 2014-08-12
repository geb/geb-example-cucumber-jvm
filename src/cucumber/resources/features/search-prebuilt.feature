# This example demonstrates using the pre-built steps in the
# geb-cucumber library

Feature: Search
  In order to learn more
  As an information seeker
  I want to find more information

  Scenario: Find what I'm looking for
    When I go to the duck duck go home page
    And I enter "cucumber-jvm github" into the search field
    And I click the search button
    Then the results table 1st row link matches /cucumber\/cucumber-jvm · GitHub.*/
