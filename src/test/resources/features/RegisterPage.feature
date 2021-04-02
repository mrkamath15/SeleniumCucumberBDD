Feature: Registration functionality

  Scenario: Register a new user
    Given user is in home page
    When user clicks on Register link
    And user fills and registration details
    And user clicks on submit button
    Then user is registered successfully
