# This example demonstrates using the pre-built steps in the
# geb-cucumber library

Feature: Geb web site navigation with prebuilt steps

  Scenario: Find what I'm looking for with prebuilt steps
    When I go to the Geb home page
    Then the first heading has the value 'What is it?'
    When I click the documentation link
    Then I am at the book of geb page
