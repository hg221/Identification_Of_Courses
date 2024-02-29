Feature: C1HomePage

  Scenario: Search for Web Development Courses
    Given Navigate to the coursera home page
    When the user clicks on the inputBox
    And the user selects the checkBox
    Then verify the details of the first course
    And verify the details of the second course
