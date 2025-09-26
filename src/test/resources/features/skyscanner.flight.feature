
@Reg
Feature: Basic flight search on Skyscanner
  As a user
  I want to search for flights
  So that I can see matching flight options and prices

  Scenario: Successful round-trip search from Madrid to Barcelona
    Given I am on the Skyscanner flights page
    And I have selected "Round-trip"
    When I set the origin to "Madrid (MAD)"
    And I set the destination to "Barcelona (BCN)"
    And I choose departure date "2025-11-10" and return date "2025-11-17"
    And I set passengers to 1 adult
    And I start the search
    Then I should see a list of flight results

