Feature: Support Page functionality

  Scenario: Verify under construction banner in Support page
    Given user is in home page
    When user clicks on support link
    Then under construction banner is displayed