Feature: C2LanguagePage

  Scenario: Display the languages and levels
    Given navigate to the coursera home page
    When the user clicks on show more
    Then get the languages and their count
    And get the levels and their count
