# This example demonstrates using the custom steps written in
# src/cucumber/glue/steps

Feature: Geb web site navigation with custom steps

  Scenario: Find what I'm looking for with custom steps
    Given I am on the Geb home page
    Then the first heading on the page is 'What is it?'
    When the link to documentation is clicked
    Then I end up at The Book of Geb
