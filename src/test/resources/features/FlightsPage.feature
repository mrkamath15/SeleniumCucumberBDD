Feature: Flight Booking functionality

  Scenario: One way trip from London to Paris
    Given user is in home page
    When user clicks on flights link
    And user selects one way trip
    And user selects 2 passengers
    And user departs from "London"
    And user departs on "May" month and 12 day
    And user arrives in "Paris"
    And user prefers first class service
    And user prefers "Unified Airlines" airline
    And user clicks on continue button
    Then back to home image is displayed


  Scenario: Round way trip from Paris to London
    Given user is in home page
    When user clicks on flights link
    And user selects round way trip
    And user selects 4 passengers
    And user departs from "Paris"
    And user departs on "June" month and 19 day
    And user arrives in "London"
    And user returns on "November" month and 15 day
    And user prefers business class service
    And user prefers "Blue Skies Airlines" airline
    And user clicks on continue button
    Then back to home image is displayed
