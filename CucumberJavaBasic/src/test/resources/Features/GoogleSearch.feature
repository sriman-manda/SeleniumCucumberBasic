Feature: Feature to test google search functionality

  Scenario: google search is working
    Given browser is open
    And user is on google search page
    When user enters text in search box
    And hits enter
    Then user is navigated
