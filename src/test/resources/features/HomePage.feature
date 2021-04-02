Feature: Home page functionality

  Scenario: Login with blank credentials
    Given user is in home page
    When user enters username "" and password ""
    And user clicks on submit button
    Then login success page is displayed

  Scenario: Login with blank password
    Given user is in home page
    When user enters username "qwe" and password ""
    And user clicks on submit button
    Then login success page is displayed

    @Debug
  Scenario: Login with blank username
    Given user is in home page
    When user enters username "" and password "qwe"
    And user clicks on submit button
    Then login success page is displayed
