Feature: C3FormPage

  Scenario: Fill the form
    Given navigates to the Coursera home page
    When the user clicks on For Enterprises
    And the user clicks on Coursera for campus
    And scroll to the form
    Then enter the details in the form
    And verify the error message
