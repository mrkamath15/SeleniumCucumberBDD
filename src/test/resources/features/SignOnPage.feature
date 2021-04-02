Feature: Sign On functionality

  Scenario: Login with blank credentials in Sign-on page
    Given user is in home page
    And user clicks on sign-on link
    When user enters username "" and password ""
    And user clicks on submit button
    Then login success page is displayed

  Scenario: Login with blank password in Sign-on page
    Given user is in home page
    And user clicks on sign-on link
    When user enters username "qwe" and password ""
    And user clicks on submit button
    Then login success page is displayed

  Scenario: Login with blank username in Sign-on page
    Given user is in home page
    And user clicks on sign-on link
    When user enters username "" and password "qwe"
    And user clicks on submit button
    Then login success page is displayed