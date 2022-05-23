Feature: Demo Feature file

  Background: Open Browser
    Given open chrome browser

  Scenario Outline: Demo Scenario
    Given open url "https://example.testproject.io/web/"
    When user enters "<username>" and "<password>"
    And click on log in button
    Then user is navigated to the home page
    And close browser

    Examples:
      |username |password|
      |usr1     |pass1   |
      |usr2     |pass2   |