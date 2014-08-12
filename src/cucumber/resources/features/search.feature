# This example demonstrates using the custom steps written in
# src/cucumber/glue/steps

Feature: Search
  In order to learn more
  As an information seeker
  I want to find more information

  Scenario: Find what I'm looking for
    Given I am on the DuckDuckGo search page
    When I search for "cucumber-jvm github"
    Then I can see some results
    And the first link should be "cucumber/cucumber-jvm · GitHub"
